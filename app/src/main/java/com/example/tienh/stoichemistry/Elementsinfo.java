package com.example.tienh.stoichemistry;

import java.util.HashMap;
import java.util.Map;

public final class Elementsinfo {

	private static Map<String, Double> massInfo;

	static {
		massInfo = new HashMap<String, Double>();

		massInfo.put("H", 1.0079);
		massInfo.put("He", 4.0026);
		massInfo.put("Li", 6.941);
		massInfo.put("Be", 9.0122);
		massInfo.put("B", 10.811);
		massInfo.put("C", 12.0107);
		massInfo.put("N", 14.0067);
		massInfo.put("O", 15.9994);
		massInfo.put("F", 18.9984);
		massInfo.put("Ne", 20.1797);
		massInfo.put("Na", 22.9897);
		massInfo.put("Mg", 24.305);
		massInfo.put("Al", 26.9815);
		massInfo.put("Si", 28.0855);
		massInfo.put("P", 30.9738);
		massInfo.put("S", 32.065);
		massInfo.put("Cl", 35.453);
		massInfo.put("K", 39.0983);
		massInfo.put("Ar", 39.948);
		massInfo.put("Ca", 40.078);
		massInfo.put("Sc", 44.9559);
		massInfo.put("Ti", 47.867);
		massInfo.put("V", 50.9415);
		massInfo.put("Cr", 51.9961);
		massInfo.put("Mn", 54.938);
		massInfo.put("Fe", 55.845);
		massInfo.put("Ni", 58.6934);
		massInfo.put("Co", 58.9332);
		massInfo.put("Cu", 63.546);
		massInfo.put("Zn", 65.39);
		massInfo.put("Ga", 69.723);
		massInfo.put("Ge", 72.64);
		massInfo.put("As", 74.9216);
		massInfo.put("Se", 78.96);
		massInfo.put("Br", 79.904);
		massInfo.put("Kr", 83.8);
		massInfo.put("Rb", 85.4678);
		massInfo.put("Y", 88.9059);
		massInfo.put("Zr", 91.224);
		massInfo.put("Nb", 92.9064);
		massInfo.put("Mo", 95.94);
		massInfo.put("Tc", 98.0);
		massInfo.put("Ru", 101.07);
		massInfo.put("Pd", 106.42);
		massInfo.put("Ag", 107.8682);
		massInfo.put("Cd", 112.411);
		massInfo.put("In", 114.818);
		massInfo.put("Sn", 118.71);
		massInfo.put("Sb", 121.76);
		massInfo.put("I", 126.9045);
		massInfo.put("Te", 127.6);
		massInfo.put("Xe", 131.293);
		massInfo.put("Cs", 132.9055);
		massInfo.put("Ba", 137.327);
		massInfo.put("La", 138.9055);
		massInfo.put("Ce", 140.116);
		massInfo.put("Pr", 140.9077);
		massInfo.put("Nd", 	144.24);
		massInfo.put("Pm", 145.0);
		massInfo.put("Pr", 140.9077);
		massInfo.put("Sm", 	150.36);
		massInfo.put("Eu", 151.964);
		massInfo.put("Gd", 157.25);
		massInfo.put("Tb", 158.9253);
		massInfo.put("Dy", 162.5);
		massInfo.put("Ho", 164.9303);
		massInfo.put("Er", 167.259);
		massInfo.put("Tm", 168.9342);
		massInfo.put("Yb", 173.04);
		massInfo.put("Lu", 174.967);
		massInfo.put("Hf", 178.49);
		massInfo.put("Ta", 180.9479);
		massInfo.put("W", 183.84);
		massInfo.put("Re", 186.207);
		massInfo.put("Os", 190.23);
		massInfo.put("Ir", 192.217);
		massInfo.put("Pt", 195.078);
		massInfo.put("Au", 196.9665);
		massInfo.put("Hg", 200.59);
		massInfo.put("Ti", 204.3833);
		massInfo.put("Pb", 207.2);
		massInfo.put("Bi", 208.9804);
		massInfo.put("Po", 209.0);
		massInfo.put("At", 210.0);
		massInfo.put("Rn", 222.0);
		massInfo.put("Fr", 223.0);
		massInfo.put("Ra", 226.0);
		massInfo.put("Ac", 227.0);
		massInfo.put("Th", 232.0377);
		massInfo.put("Pa", 231.03588);
		massInfo.put("U",  238.02891);
		massInfo.put("Np", 237.0);
		massInfo.put("Pu", 244.0);
		massInfo.put("Am", 243.0);
		massInfo.put("Cm", 247.0);
		massInfo.put("Bk", 247.0);
		massInfo.put("Cf", 251.0);
		massInfo.put("Es", 252.0);
		massInfo.put("Fm", 257.0);
		massInfo.put("Md", 258.0);
		massInfo.put("No", 259.0);
		massInfo.put("Lr", 262.0);
		massInfo.put("Rf", 263.0);
		massInfo.put("Db", 268.0);
		massInfo.put("Sg", 271.0);
		massInfo.put("Bh", 270.0);
		massInfo.put("Hs", 270.0);
		massInfo.put("Mt", 278.0);
		massInfo.put("Ds", 281.0);
		massInfo.put("Rg", 281.0);
		massInfo.put("Cn", 285.0);
		massInfo.put("Nh", 286.0);
		massInfo.put("Fl", 289.0);
		massInfo.put("Mc", 289.0);
		massInfo.put("Lv", 293.0);
		massInfo.put("Ts", 294.0);
		massInfo.put("Og", 294.0);
	}
	
	public static double lookup(String element) {
		if (massInfo==null) {
			System.err.println("Trying to lookup element before table is created");
		}
		Double m = massInfo.get(element);
		if (m==null) {
			return 0.0;
		} else {
			return m;
		}
	}

	public static double molecularWeight(String compound) {
		return lookup(compound);
	}
	public static double molecularWeight2(String compound) {
		return lookup(compound);
	}
	
}
