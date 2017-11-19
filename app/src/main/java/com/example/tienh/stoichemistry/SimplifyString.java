package com.example.tienh.stoichemistry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/**
 * This program provides utilities for parsing a chemistry
 * compound and turning it into a simple formula without numbers
 * @author tcolley
 * @version 2017-04-24
 */

public class SimplifyString 
{
	/**
	 * Testing main class
	 * @param args
	 */
//	public static void main(String[] args)
//	{
//		String chem = "PO4H2(CH2)12CH3";
//		//String chem = "NaO2Cl3";
//		System.out.println(parseString(chem));
//	}
	
	/**
	 * Given a complex chemstry compound, returns the simple formula
	 * @param chem The complex chemistry compound
	 * @return The simple (expanded) formula
	 */
	public static String parseString(String chem)
	{
		ArrayList<Parenthesis> listOfParen = new ArrayList<Parenthesis>();
		listOfParen = doParenthesisPass(chem);
		
		boolean running = true;
		int highestNest = getMax(listOfParen);
		
		int i = 0;
		while (running)
		{
			boolean reset = false;
			if (listOfParen.size() == 0)
			{
				running = false;
				chem = parseElement(chem);
			}
			else	//we're still working on the list
			{
				Parenthesis thisParen = listOfParen.get(i);
				if (thisParen.getLayersIn() == highestNest)
				{
					System.out.println("Before: " + chem);
					chem = resolveInnerString(chem, thisParen);
					System.out.println("After:  " + chem);
					reset = true;
					listOfParen = doParenthesisPass(chem);
					highestNest = getMax(listOfParen);
					i = 0;
				}

				
				
				if (!reset)
				{
					i++;
				}
			}
		}
		
		return chem;
	}
	
	/**
	 * Returns the Parentheses as Objects within the String
	 * @param chem The complex String
	 * @return The ArrayList of Parenthesis
	 */
	private static ArrayList<Parenthesis> doParenthesisPass(String chem)
	{
		int numOfOpens = 0;
		Stack<Integer> stack = new Stack<Integer>();
		ArrayList<Parenthesis> array = new ArrayList<Parenthesis>();
		for (int i =0 ;i<chem.length(); i++)
		{
			char c = chem.charAt(i);
			if (c == '(')
			{
				//System.out.println("Starting parenthesis at " + i);
				numOfOpens++;
				//System.out.println("Number of open parentheses now: " + numOfOpens);
				stack.push(i);
			}
			else if (c == ')')
			{
				//System.out.println("Ending parenthesis at " + i);
				numOfOpens--;
				//System.out.println("Number of open parentheses now: " + numOfOpens);
				
				Parenthesis p = new Parenthesis();
				if (stack.size() == 0)
				{
					System.err.println("The stack is empty for argument: " + chem);
				}
				else
				{
					p.setStart(stack.pop());
				}
				
				p.setEnd(i);
				p.setLayersIn(numOfOpens);
				p.parseMultiplier(chem);
				array.add(p);
			}
		}
		
		Collections.sort(array);
		return array;
	}
	
	/**
	 * Simple max method. Returns the highest layersIn in the array
	 * @param listOfParen The ArrayList of Parenthesis to work within
	 * @return The highest layersIn number
	 */
	private static int getMax(ArrayList<Parenthesis> listOfParen)
	{
		int max = 0;
		for (int i = 0; i<listOfParen.size(); i++)
		{
			int layersIn = listOfParen.get(i).getLayersIn();
			if (layersIn > max)
			{
				max = layersIn;
			}
		}
		
		return max;
	}
	
	/**
	 * Given the complex chemistry String and a Parenthesis Object, 
	 * resolves the inner String defined by the Parenthesis Object
	 * @param chem The complex chemistry String
	 * @param paren The Parenthesis Object to define the inner String
	 * @return The resolved inner String
	 */
	private static String resolveInnerString(String chem, Parenthesis paren)
	{
		String inner = chem.substring(paren.getStart()+1, paren.getEnd());
		inner = parseElement(inner);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i<paren.getMultiplier(); i++)
		{
			sb.append(inner);
		}
		
		//TODO fix +2 for number parsing by passing back count of digits in number
		int numOfDigits = (paren.getMultiplier()+"").length();
		String open = chem.substring(0, paren.getStart());
		String middle = sb.toString();
		//+1 for end parenthesis, then account for digits
		String close = chem.substring(paren.getEnd()+1+numOfDigits, chem.length());	
		String newChem = open + middle + close;
		return newChem;
	}
	
	/**
	 * Given a simple element, removes the numbers and gives the simple formula
	 * @param element The simple element
	 * @return The simple formula of that element (IE: Na2Cl2 --> NaNaClCl)
	 */
	private static String parseElement(String element)
	{
		String newElement = element;
		for (int i = 0; i<element.length(); i++)
		{
			if (Character.isDigit(element.charAt(i)))
			{
				
				int elementMultiplier = Parenthesis.findMultiplier(element, i-1);
				
				String elementToMultiply = "";
				int startIndex = 0;
				int endIndex = 0;
				if (Character.isLowerCase(element.charAt(i-1)))
				{
					startIndex = i-2;
					endIndex = i;
				}
				else
				{
					startIndex = i-1;
					endIndex = i;
				}
				elementToMultiply = element.substring(startIndex, endIndex);
				
				StringBuilder elementExtender = new StringBuilder();
				for (int j = 0; j<elementMultiplier; j++)
				{
					elementExtender.append(elementToMultiply);
				}
				
				String open = element.substring(0, startIndex);
				String middle = elementExtender.toString();
				String close = element.substring(endIndex+1, element.length());
				newElement = open + middle + close;
				element = newElement;
				
				i =-1;
				
			}
			
		}
		
		if (containsNumbers(newElement))
		{
			parseElement(newElement);
		}
		
		return newElement;
	}
	
	/**
	 * Given a String, checks to see if any characters are digits
	 * @param element The String to check upon
	 * @return True if any digits exist, false otherwise
	 */
	private static boolean containsNumbers(String element)
	{
		for (int i = 0; i<element.length(); i++)
		{
			char c = element.charAt(i);
			if (Character.isDigit(c))
			{
				return true;
			}
		}
		
		return false;
	}
}
