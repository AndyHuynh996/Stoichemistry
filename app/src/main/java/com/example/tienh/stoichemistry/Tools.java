package com.example.tienh.stoichemistry;

import android.widget.EditText;

/**
 * Created by TienH on 4/1/2017.
 */
public class Tools {


    public static String nextElt(String str) {

        if (str.length() < 2) {
            return str;
        }
        char first = str.charAt(0);
        char second = str.charAt(1);

        // System.out.println(" in nextElt, first is '" + first + "' and second
        // is '" + second +"'.");;
        if (!Character.isUpperCase(first)) {

            return "";
        }
        if (Character.isLowerCase(second)) {
            return str.substring(0, 2);
        } else {
            return str.substring(0, 1);
        }

    }


    public static String Elt(String S) {
        if (S.length() > 0) {
            return S;
        }
        return S;
    }

    public double calculateMolarMass(EditText compound) {
        double molarmass = 0;

        String compoundStr = compound.getText().toString();
        String simpleStr= SimplifyString.parseString(compoundStr);
        while (simpleStr.length() > 0) {
            String element = nextElt(simpleStr);
            simpleStr = simpleStr.substring(element.length());
            double elementNum = Elementsinfo.lookup(element);
            molarmass += elementNum;
        }
        return molarmass;
    }
}
