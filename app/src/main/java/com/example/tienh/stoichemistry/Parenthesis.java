package com.example.tienh.stoichemistry;

/**
 * Parenthesis a POJO that contains fields for a parenthesis as
 * well as a multiplier field (for the number(s) next to it and 
 * how nested the Parenthesis is
 * @author tcolley
 * @version 2017-04-24
 */
public class Parenthesis implements Comparable<Parenthesis>
{
	//Instance variables
	private int start;
	private int end;
	private int multiplier;
	private int layersIn;
	
	/**
	 * Gets the start parenthesis index
	 * @return The start parenthesis index
	 */
	public int getStart() 
	{
		return start;
	}
	
	/**
	 * Set sthe start parenthesis index
	 * @param start The start parenthesis index to set
	 */
	public void setStart(int start) 
	{
		this.start = start;
	}
	
	/**
	 * Gets the end parenthesis index
	 * @return The end parenthesis index
	 */
	public int getEnd() 
	{
		return end;
	}
	
	/**
	 * Sets the end parenthesis index
	 * @param end The end parenthesis index to set
	 */
	public void setEnd(int end) 
	{
		this.end = end;
	}
	
	/**
	 * Gets the multiplier of the insides
	 * @return The multiplier of the inside
	 */
	public int getMultiplier() 
	{
		return multiplier;
	}
	
	/**
	 * Sets the multiplier to a given integer
	 * @param multiplier The multiplier of the inside
	 */
	public void setMultiplier(int multiplier) 
	{
		this.multiplier = multiplier;
	}
	
	/**
	 * Gets the layers in (used to denote how nested we are)
	 * @return The number of layers in
	 */
	public int getLayersIn() 
	{
		return layersIn;
	}
	
	/**
	 * Sets the layersIn to an integer
	 * @param layersIn The number of layersIn to set
	 */
	public void setLayersIn(int layersIn) 
	{
		this.layersIn = layersIn;
	}
	
	/**
	 * Given a chemistry string and this Parenthesis' start + end indices, 
	 * parses out the multiplier and sets it in the Object
	 * @param chem The chemistry string to work with
	 */
	public void parseMultiplier(String chem)
	{
		int thisMultiplier = 1;
		if (end < chem.length())
		{
			try
			{
				thisMultiplier = findMultiplier(chem, end);

			}
			catch (Exception e) //not an integer
			{
				thisMultiplier = 1; //ensure it's 1 on total fail
			}
		}
		
		this.setMultiplier(thisMultiplier);
		
	}
	
	public static int findMultiplier(String chem, int endOfParen)
	{
		int thisMultiplier = 1;
		//TODO multiple digit fix
		boolean hasDigits = true;
		StringBuilder sb = new StringBuilder();
		int i = 1;
		while (hasDigits && endOfParen+i < chem.length())
		{
			char thisChar = chem.charAt(endOfParen+i);
			
			if (Character.isDigit(thisChar))
			{
				sb.append(thisChar);
			}
			else
			{
				hasDigits = false;
			}
			
			i++;
		}
		thisMultiplier = Integer.parseInt(sb.toString());
		
		return thisMultiplier;
	}
	
	
	@Override
	public String toString() {
		return "Parenthesis [start=" + start + ", end=" + end + ", multiplier=" + multiplier + ", layersIn=" + layersIn
				+ "]";
	}
	@Override
	public int compareTo(Parenthesis arg0) 
	{
		if (this.getStart() > arg0.getStart())
		{
			return 1;
		}
		else if (this.getStart() < arg0.getStart())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
	
}
