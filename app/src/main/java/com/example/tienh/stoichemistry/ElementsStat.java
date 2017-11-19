package com.example.tienh.stoichemistry;

import java.util.HashMap;
import java.util.Map;

public class ElementsStat {
    private static Map<String, String> ElementsStat;

    static {
        ElementsStat = new HashMap<String, String>();

        ElementsStat.put("Hydrogen",
                "\n" + "Atomic Number: 1" + "\n" + "Atomic Weight: 1.00798" + "\n"
                        + "Melting Point: 13.81 K (-259.34�C or -434.81�F)" + "\n"
                        + "Boiling Point: 20.28 K (-252.87�C or -423.17�F)" + "\n"
                        + "Density: 0.00008988 grams per cubic centimeter" + "\n" + "Phase at Room Temperature: Gas"
                        + "\n" + "Element Classification: Non-metal" + "\n"
                        + "Period Number: 1    Group Number: 1    Group Name: none");
        ElementsStat.put("Helium",
                "\n" + "Atomic Number: 2" + "\n" + "Atomic Weight: 4.002602" + "\n"
                        + "Melting Point:  0.95 K (-272.2�C or -458.0�F))" + "\n"
                        + "Boiling Point: 4.22 K (-268.93�C or -452.07�F))" + "\n"
                        + "Density: 0.0001785 grams per cubic centimeter" + "\n" + "Phase at Room Temperature: Gas"
                        + "\n" + "Element Classification: Non-metal" + "\n"
                        + "Period Number: 1    Group Number: 18    Group Name: Noble Gas");
        ElementsStat.put("Lithium", "\n" + "Atomic Number: 3" + "\n" + "Atomic Weight: 6.968" + "\n"
                + "Melting Point:  453.65 K (180.50�C or 356.90�F))" + "\n"
                + "Boiling Point: 1615 K (1342�C or 2448�F))" + "\n"
                + "Density: 0.534 grams per cubic centimeter" + "\n" + "Phase at Room Temperature: Solid"
                + "\n" + "Element Classification: Metal" + "\n"
                + "Period Number: 2    Group Number: 1    Group Name: Alkali Metal");
        ElementsStat.put("Beryllium", "\n" + "Atomic Number: 4" + "\n" +
                "Atomic Weight: 9.0121831" + "\n" +
                "Melting Point: 1560 K (1287�C or 2349�F)" + "\n" +
                "Boiling Point: 2744 K (2471�C or 4480�F)" + "\n" +
                "Density: 1.85 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 2    Group Number: 2    Group Name: Alkaline Earth Metal");
        ElementsStat.put("Boron", "\n" + "Atomic Number: 5" + "\n" +
                "Atomic Weight: 10.814" + "\n" +
                "Melting Point: 2348 K (2075�C or 3767�F)" + "\n" +
                "Boiling Point: 4273 K (4000�C or 7232�F)" + "\n" +
                "Density: 2.37 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Semi-metal" + "\n" +
                "Period Number: 2    Group Number: 13    Group Name: none");
        ElementsStat.put("Carbon", "\n" + "Atomic Number: 6" + "\n" +
                "Atomic Weight: 12.0106" + "\n" +
                "Melting Point: 3823 K (3550�C or 6422�F)" + "\n" +
                "Boiling Point: 4098 K (3825�C or 6917�F)" + "\n" +
                "Density: 2.2670 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Non-metal" + "\n" +
                "Period Number: 2    Group Number: 14    Group Name: none");
        ElementsStat.put("Nitrogen", "\n" + "Atomic Number: 7" + "\n" +
                "Atomic Weight: 14.00686" + "\n" +
                "Melting Point: 63.15 K (-210.00�C or -346.00�F)" + "\n" +
                "Boiling Point: 77.36 K (-195.79�C or -320.44�F)" + "\n" +
                "Density: 0.0012506 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Gas" + "\n" +
                "Element Classification: Non-metal" + "\n" +
                "Period Number: 2    Group Number: 15    Group Name: Pnictogen");
        ElementsStat.put("Oxygen", "\n" + "Atomic Number: 8" + "\n" +
                "Atomic Weight: 15.99940" + "\n" +
                "Melting Point: 54.36 K (-218.79�C or -361.82�F)" + "\n" +
                "Boiling Point: 90.20 K (-182.95�C or -297.31�F)" + "\n" +
                "Density: 0.001429 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Gas" + "\n" +
                "Element Classification: Non-metal" + "\n" +
                "Period Number: 2    Group Number: 16    Group Name: Chalcogen");
        ElementsStat.put("Fluorine", "\n" + "Atomic Number: 9" + "\n" +
                "Atomic Weight: 18.998403163" + "\n" +
                "Melting Point: 53.53 K (-219.62�C or -363.32�F)" + "\n" +
                "Boiling Point: 85.03 K (-188.12�C or -306.62�F)" + "\n" +
                "Density: 0.001696 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Gas" + "\n" +
                "Element Classification: Non-metal" + "\n" +
                "Period Number: 2    Group Number: 17    Group Name: Halogen");
        ElementsStat.put("Neon", "\n" + "Atomic Number: 10" + "\n" +
                "Atomic Weight: 20.1797" + "\n" +
                "Melting Point: 24.56 K (-248.59�C or -415.46�F)" + "\n" +
                "Boiling Point: 27.07 K (-246.08�C or -410.94�F)" + "\n" +
                "Density: 0.0008999 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Gas" + "\n" +
                "Element Classification: Non-metal" + "\n" +
                "Period Number: 2    Group Number: 18    Group Name: Noble Gas");
        ElementsStat.put("Sodium", "\n" + "Atomic Number: 11" + "\n" +
                "Atomic Weight: 22.98976928" + "\n" +
                "Melting Point: 370.95 K (97.80�C or 208.04�F)" + "\n" +
                "Boiling Point: 1156 K (883�C or 1621�F)" + "\n" +
                "Density: 0.97 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 3    Group Number: 1    Group Name: Alkali Metal");
        ElementsStat.put("Magnesium", "\n" + "Atomic Number: 12" + "\n" +
                "Atomic Weight: 24.306" + "\n" +
                "Melting Point: 923 K (650�C or 1202�F)" + "\n" +
                "Boiling Point: 1363 K (1090�C or 1994�F)" + "\n" +
                "Density: 1.74 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 3    Group Number: 2    Group Name: Alkaline Earth Metal");
        ElementsStat.put("Aluminum", "\n" + "Atomic Number: 13" + "\n" +
                "Atomic Weight: 26.9815385" + "\n" +
                "Melting Point: 933.437 K (660.323�C or 1220.581�F)" + "\n" +
                "Boiling Point: 2792 K (2519�C or 4566�F)" + "\n" +
                "Density: 2.70 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 3    Group Number: 13    Group Name: none");
        ElementsStat.put("Silicon", "\n" + "Atomic Number: 14" + "\n" +
                "Atomic Weight: 28.085" + "\n" +
                "Melting Point: 1687 K (1414�C or 2577�F)" + "\n" +
                "Boiling Point: 3538 K (3265�C or 5909�F)" + "\n" +
                "Density: 2.3296 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Semi-metal" + "\n" +
                "Period Number: 3    Group Number: 14    Group Name: none");
        ElementsStat.put("Phosphorus", "\n" + "Atomic Number: 15" + "\n" +
                "Atomic Weight: 30.973761998" + "\n" +
                "Melting Point: 317.30 K (44.15�C or 111.47�F)" + "\n" +
                "Boiling Point: 553.65 K (280.5�C or 536.9�F)" + "\n" +
                "Density: 1.82 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Non-metal" + "\n" +
                "Period Number: 3    Group Number: 15    Group Name: Pnictogen");
        ElementsStat.put("Sulfur", "\n" + "Atomic Number: 16" + "\n" +
                "Atomic Weight: 32.068" + "\n" +
                "Melting Point: 388.36 K (115.21�C or 239.38�F)" + "\n" +
                "Boiling Point: 717.75 K (444.60�C or 832.28�F)" + "\n" +
                "Density: 2.067 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Non-metal" + "\n" +
                "Period Number: 3    Group Number: 16    Group Name: Chalcogen");
        ElementsStat.put("Chlorine", "\n" + "Atomic Number: 17" + "\n" +
                "Atomic Weight: 35.452" + "\n" +
                "Melting Point: 171.65 K (-101.5�C or -150.7�F)" + "\n" +
                "Boiling Point: 239.11 K (-34.04�C or -29.27�F)" + "\n" +
                "Density: 0.003214 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Gas" + "\n" +
                "Element Classification: Non-metal" + "\n" +
                "Period Number: 3    Group Number: 17    Group Name: Halogen");
        ElementsStat.put("Potassium", "\n" + "Atomic Number: 19" + "\n" +
                "Atomic Weight: 39.0983" + "\n" +
                "Melting Point: 336.53 K (63.38�C or 146.08�F)" + "\n" +
                "Boiling Point: 1032 K (759�C or 1398�F)" + "\n" +
                "Density: 0.89 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 4    Group Number: 1    Group Name: Alkali Metal");
        ElementsStat.put("Argon", "\n" + "Atomic Number: 18" + "\n" +
                "Atomic Weight: 39.948" + "\n" +
                "Melting Point: 83.80 K (-189.35�C or -308.83�F)" + "\n" +
                "Boiling Point: 87.30 K (-185.85�C or -302.53�F)" + "\n" +
                "Density: 0.0017837 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Gas" + "\n" +
                "Element Classification: Non-metal" + "\n" +
                "Period Number: 3    Group Number: 18    Group Name: Noble Gas");
        ElementsStat.put("Calcium", "\n" + "Atomic Number: 20" + "\n" +
                "Atomic Weight: 40.078" + "\n" +
                "Melting Point: 1115 K (842�C or 1548�F)" + "\n" +
                "Boiling Point: 1757 K (1484�C or 2703�F)" + "\n" +
                "Density: 1.54 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 4    Group Number: 2    Group Name: Alkaline Earth Metal");
        ElementsStat.put("Scandium", "\n" + "Atomic Number: 21" + "\n" +
                "Atomic Weight: 44.955908" + "\n" +
                "Melting Point: 1814 K (1541�C or 2806�F)" + "\n" +
                "Boiling Point: 3109 K (2836�C or 5137�F)" + "\n" +
                "Density: 2.99 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 4    Group Number: 3    Group Name: none");
        ElementsStat.put("Titanium", "\n" + "Atomic Number: 22" + "\n" +
                "Atomic Weight: 47.867" + "\n" +
                "Melting Point: 1941 K (1668�C or 3034�F)" + "\n" +
                "Boiling Point: 3560 K (3287�C or 5949�F)" + "\n" +
                "Density: 4.5 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 4    Group Number: 4    Group Name: none");
        ElementsStat.put("Vanadium", "\n" + "Atomic Number: 23" + "\n" +
                "Atomic Weight: 50.9415" + "\n" +
                "Melting Point: 2183 K (1910�C or 3470�F)" + "\n" +
                "Boiling Point: 3680 K (3407�C or 6165�F)" + "\n" +
                "Density: 6.0 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 4    Group Number: 5    Group Name: none");
        ElementsStat.put("Chromium", "\n" + "Atomic Number: 24" + "\n" +
                "Atomic Weight: 51.9961" + "\n" +
                "Melting Point: 2180 K (1907�C or 3465�F)" + "\n" +
                "Boiling Point: 2944 K (2671�C or 4840�F)" + "\n" +
                "Density: 7.15 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 4    Group Number: 6    Group Name: none");
        ElementsStat.put("Manganese", "\n" + "Atomic Number: 25" + "\n" +
                "Atomic Weight: 54.938044" + "\n" +
                "Melting Point: 1519 K (1246�C or 2275�F)" + "\n" +
                "Boiling Point: 2334 K (2061�C or 3742�F)" + "\n" +
                "Density: 7.3 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 4    Group Number: 7    Group Name: none");
        ElementsStat.put("Iron", "\n" + "Atomic Number: 26" + "\n" +
                "Atomic Weight: 55.845" + "\n" +
                "Melting Point: 1811 K (1538�C or 2800�F)" + "\n" +
                "Boiling Point: 3134 K (2861�C or 5182�F)" + "\n" +
                "Density: 7.874 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 4    Group Number: 8    Group Name: none");
        ElementsStat.put("Nickel", "\n" + "Atomic Number: 28" + "\n" +
                "Atomic Weight: 58.6934" + "\n" +
                "Melting Point: 1728 K (1455�C or 2651�F)" + "\n" +
                "Boiling Point: 3186 K (2913�C or 5275�F)" + "\n" +
                "Density: 8.912 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 4    Group Number: 10    Group Name: none");
        ElementsStat.put("Cobalt", "\n" + "Atomic Number: 27" + "\n" +
                "Atomic Weight: 58.933194" + "\n" +
                "Melting Point: 1768 K (1495�C or 2723�F)" + "\n" +
                "Boiling Point: 3200 K (2927�C or 5301�F)" + "\n" +
                "Density: 8.86 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 4    Group Number: 9    Group Name: none");
        ElementsStat.put("Copper", "\n" + "Atomic Number: 29" + "\n" +
                "Atomic Weight: 63.546" + "\n" +
                "Melting Point: 1357.77 K (1084.62�C or 1984.32�F)" + "\n" +
                "Boiling Point: 2835 K (2562�C or 4644�F)" + "\n" +
                "Density: 8.933 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 4    Group Number: 11    Group Name: none");
        ElementsStat.put("Zinc", "\n" + "Atomic Number: 30" + "\n" +
                "Atomic Weight: 65.38" + "\n" +
                "Melting Point: 692.68 K (419.53�C or 787.15�F)" + "\n" +
                "Boiling Point: 1180 K (907�C or 1665�F)" + "\n" +
                "Density: 7.134 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 4    Group Number: 12    Group Name: none");
        ElementsStat.put("Gallium", "\n" + "Atomic Number: 31" + "\n" +
                "Atomic Weight: 69.723" + "\n" +
                "Melting Point: 302.91 K (29.76�C or 85.57�F)" + "\n" +
                "Boiling Point: 2477 K (2204�C or 3999�F)" + "\n" +
                "Density: 5.91 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 4    Group Number: 13    Group Name: none");
        ElementsStat.put("Germanium", "\n" + "Atomic Number: 32" + "\n" +
                "Atomic Weight: 72.630" + "\n" +
                "Melting Point: 1211.40 K (938.25�C or 1720.85�F)" + "\n" +
                "Boiling Point: 3106 K (2833�C or 5131�F)" + "\n" +
                "Density: 5.323 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Semi-metal" + "\n" +
                "Period Number: 4    Group Number: 14    Group Name: none");
        ElementsStat.put("Arsenic", "\n" + "Atomic Number: 33" + "\n" +
                "Atomic Weight: 74.921595" + "\n" +
                "Melting Point: 1090 K (817�C or 1503�F)" + "\n" +
                "Boiling Point: 887 K (614�C or 1137�F)" + "\n" +
                "Density: 5.776 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Semi-metal" + "\n" +
                "Period Number: 4    Group Number: 15    Group Name: Pnictogen");
        ElementsStat.put("Selenium", "\n" + "Atomic Number: 34" + "\n" +
                "Atomic Weight: 78.971" + "\n" +
                "Melting Point: 493.65 K (220.5�C or 428.9�F)" + "\n" +
                "Boiling Point: 958 K (685�C or 1265�F)" + "\n" +
                "Density: 4.809 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Non-metal" + "\n" +
                "Period Number: 4    Group Number: 16    Group Name: Chalcogen");
        ElementsStat.put("Bromine", "\n" + "Atomic Number: 35" + "\n" +
                "Atomic Weight: 79.904" + "\n" +
                "Melting Point: 265.95 K (-7.2�C or 19.0�F)" + "\n" +
                "Boiling Point: 331.95 K (58.8�C or 137.8�F)" + "\n" +
                "Density: 3.11 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Liquid" + "\n" +
                "Element Classification: Non-metal" + "\n" +
                "Period Number: 4    Group Number: 17    Group Name: Halogen");
        ElementsStat.put("Krypton", "\n" + "Atomic Number: 36" + "\n" +
                "Atomic Weight: 83.798" + "\n" +
                "Melting Point: 115.79 K (-157.36�C or -251.25�F)" + "\n" +
                "Boiling Point: 119.93 K (-153.22�C or -243.80�F)" + "\n" +
                "Density: 0.003733 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Gas" + "\n" +
                "Element Classification: Non-metal" + "\n" +
                "Period Number: 4    Group Number: 18    Group Name: Noble Gas");
        ElementsStat.put("Rubidium", "\n" + "Atomic Number: 37" + "\n" +
                "Atomic Weight: 85.4678" + "\n" +
                "Melting Point: 312.46 K (39.31�C or 102.76�F)" + "\n" +
                "Boiling Point: 961 K (688�C or 1270�F)" + "\n" +
                "Density: 1.53 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 5    Group Number: 1    Group Name: Alkali Metal");
        ElementsStat.put("Strontium", "\n" + "Atomic Number: 38" + "\n" +
                "Atomic Weight: 87.62" + "\n" +
                "Melting Point: 1050 K (777�C or 1431�F)" + "\n" +
                "Boiling Point: 1655 K (1382�C or 2520�F)" + "\n" +
                "Density: 2.64 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 5    Group Number: 2    Group Name: Alkaline Earth Metal");
        ElementsStat.put("Yttrium", "\n" + "Atomic Number: 39" + "\n" +
                "Atomic Weight: 88.90584" + "\n" +
                "Melting Point: 1795 K (1522�C or 2772�F)" + "\n" +
                "Boiling Point: 3618 K (3345�C or 6053�F)" + "\n" +
                "Density: 4.47 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 5    Group Number: 3    Group Name: none");
        ElementsStat.put("Zirconium", "\n" + "Atomic Number: 40" + "\n" +
                "Atomic Weight: 91.224" + "\n" +
                "Melting Point: 2128 K (1855�C or 3371�F)" + "\n" +
                "Boiling Point: 4682 K (4409�C or 7968�F)" + "\n" +
                "Density: 6.52 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 5    Group Number: 4    Group Name: none");
        ElementsStat.put("Niobium", "\n" + "Atomic Number: 41" + "\n" +
                "Atomic Weight: 92.90637" + "\n" +
                "Melting Point: 2750 K (2477�C or 4491�F)" + "\n" +
                "Boiling Point: 5017 K (4744�C or 8571�F)" + "\n" +
                "Density: 8.57 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 5    Group Number: 5    Group Name: none");
        ElementsStat.put("Molybdenum", "\n" + "Atomic Number: 42" + "\n" +
                "Atomic Weight: 95.95" + "\n" +
                "Melting Point: 2896 K (2623�C or 4753�F)" + "\n" +
                "Boiling Point: 4912 K (4639�C or 8382�F)" + "\n" +
                "Density: 10.2 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 5    Group Number: 6    Group Name: none");
        ElementsStat.put("Technetium", "\n" + "Atomic Number: 43" + "\n" +
                "Atomic Weight: 98" + "\n" +
                "Melting Point: 2430 K (2157�C or 3915�F)" + "\n" +
                "Boiling Point: 4538 K (4265�C or 7709�F)" + "\n" +
                "Density: 11 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 5    Group Number: 7    Group Name: none");
        ElementsStat.put("Ruthenium", "\n" + "Atomic Number: 44" + "\n" +
                "Atomic Weight: 101.07" + "\n" +
                "Melting Point: 2607 K (2334�C or 4233�F)" + "\n" +
                "Boiling Point: 4423 K (4150�C or 7502�F)" + "\n" +
                "Density: 12.1 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 5    Group Number: 8    Group Name: none");
        ElementsStat.put("Rhodium", "\n" + "Atomic Number: 45" + "\n" +
                "Atomic Weight: 102.90550" + "\n" +
                "Melting Point: 2237 K (1964�C or 3567�F)" + "\n" +
                "Boiling Point: 3968 K (3695�C or 6683�F)" + "\n" +
                "Density: 12.4 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 5    Group Number: 9    Group Name: none");
        ElementsStat.put("Palladium", "\n" + "Atomic Number: 46" + "\n" +
                "Atomic Weight: 106.42" + "\n" +
                "Melting Point: 1828.05 K (1554.9�C or 2830.8�F)" + "\n" +
                "Boiling Point: 3236 K (2963�C or 5365�F)" + "\n" +
                "Density: 12.0 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 5    Group Number: 10    Group Name: none");
        ElementsStat.put("Silver", "\n" + "Atomic Number: 47" + "\n" +
                "Atomic Weight: 107.8682" + "\n" +
                "Melting Point: 1234.93 K (961.78�C or 1763.20�F)" + "\n" +
                "Boiling Point: 2435 K (2162�C or 3924�F)" + "\n" +
                "Density: 10.501 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 5    Group Number: 11    Group Name: none");
        ElementsStat.put("Cadmium", "\n" + "Atomic Number: 48" + "\n" +
                "Atomic Weight: 112.414" + "\n" +
                "Melting Point: 594.22 K (321.07�C or 609.93�F)" + "\n" +
                "Boiling Point: 1040 K (767�C or 1413�F)" + "\n" +
                "Density: 8.69 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 5    Group Number: 12    Group Name: none");
        ElementsStat.put("Indium", "\n" + "Atomic Number: 49" + "\n" +
                "Atomic Weight: 114.818" + "\n" +
                "Melting Point: 429.75 K (156.60�C or 313.88�F)" + "\n" +
                "Boiling Point: 2345 K (2072�C or 3762�F)" + "\n" +
                "Density: 7.31 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 5    Group Number: 13    Group Name: none");
        ElementsStat.put("Tin", "\n" + "Atomic Number: 50" + "\n" +
                "Atomic Weight: 118.710" + "\n" +
                "Melting Point: 505.08 K (231.93�C or 449.47�F)" + "\n" +
                "Boiling Point: 2875 K (2602�C or 4715�F)" + "\n" +
                "Density: 7.287 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 5    Group Number: 14    Group Name: none");
        ElementsStat.put("Antimony", "\n" + "Atomic Number: 51" + "\n" +
                "Atomic Weight: 121.760" + "\n" +
                "Melting Point: 903.78 K (630.63�C or 1167.13�F)" + "\n" +
                "Boiling Point: 1860 K (1587�C or 2889�F)" + "\n" +
                "Density: 6.685 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Semi-metal" + "\n" +
                "Period Number: 5    Group Number: 15    Group Name: Pnictogen");
        ElementsStat.put("Iodine", "\n" + "Atomic Number: 53" + "\n" +
                "Atomic Weight: 126.90447" + "\n" +
                "Melting Point: 386.85 K (113.7�C or 236.7�F)" + "\n" +
                "Boiling Point: 457.55 K (184.4�C or 364.0�F)" + "\n" +
                "Density: 4.93 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Non-metal" + "\n" +
                "Period Number: 5    Group Number: 17    Group Name: Halogen");
        ElementsStat.put("Tellurium", "\n" + "Atomic Number: 52" + "\n" +
                "Atomic Weight: 127.60" + "\n" +
                "Melting Point: 722.66 K (449.51�C or 841.12�F)" + "\n" +
                "Boiling Point: 1261 K (988�C or 1810�F)" + "\n" +
                "Density: 6.232 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Semi-metal" + "\n" +
                "Period Number: 5    Group Number: 16    Group Name: Chalcogen");
        ElementsStat.put("Xenon", "\n" + "Atomic Number: 54" + "\n" +
                "Atomic Weight: 131.293" + "\n" +
                "Melting Point: 161.36 K (-111.79�C or -169.22�F)" + "\n" +
                "Boiling Point: 165.03 K (-108.12�C or -162.62�F)" + "\n" +
                "Density: 0.005887 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Gas" + "\n" +
                "Element Classification: Non-metal" + "\n" +
                "Period Number: 5    Group Number: 18    Group Name: Noble Gas");
        ElementsStat.put("Cesium", "\n" + "Atomic Number: 55" + "\n" +
                "Atomic Weight: 132.90545196" + "\n" +
                "Melting Point: 301.59 K (28.44�C or 83.19�F)" + "\n" +
                "Boiling Point: 944 K (671�C or 1240�F)" + "\n" +
                "Density: 1.93 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 6    Group Number: 1    Group Name: Alkali Metal");
        ElementsStat.put("Barium", "\n" + "Atomic Number: 56" + "\n" +
                "Atomic Weight: 137.327" + "\n" +
                "Melting Point: 1000 K (727�C or 1341�F)" + "\n" +
                "Boiling Point: 2170 K (1897�C or 3447�F)" + "\n" +
                "Density: 3.62 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 6    Group Number: 2    Group Name: Alkaline Earth Metal");
        ElementsStat.put("Lanthanum", "\n" + "Atomic Number: 57" + "\n" +
                "Atomic Weight: 138.90547" + "\n" +
                "Melting Point: 1191 K (918�C or 1684�F)" + "\n" +
                "Boiling Point: 3737 K (3464�C or 6267�F)" + "\n" +
                "Density: 6.15 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 6    Group Number: none    Group Name: Lanthanide");
        ElementsStat.put("Cerium", "\n" + "Atomic Number: 58" + "\n" +
                "Atomic Weight: 140.116" + "\n" +
                "Melting Point: 1071 K (798�C or 1468�F)" + "\n" +
                "Boiling Point: 3697 K (3424�C or 6195�F)" + "\n" +
                "Density: 6.770 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 6    Group Number: none    Group Name: Lanthanide");
        ElementsStat.put("Praseodymium", "\n" + "Atomic Number: 59" + "\n" +
                "Atomic Weight: 140.90766" + "\n" +
                "Melting Point: 1204 K (931�C or 1708�F)" + "\n" +
                "Boiling Point: 3793 K (3520�C or 6368�F)" + "\n" +
                "Density: 6.77 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 6    Group Number: none    Group Name: Lanthanide");
        ElementsStat.put("Neodymium", "\n" + "Atomic Number: 60" + "\n" +
                "Atomic Weight: 144.242" + "\n" +
                "Melting Point: 1294 K (1021�C or 1870�F)" + "\n" +
                "Boiling Point: 3347 K (3074�C or 5565�F)" + "\n" +
                "Density: 7.01 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 6    Group Number: none    Group Name: Lanthanide");
        ElementsStat.put("Promethium", "Atomic Number: 61 \n"
                + "Atomic Weight: 145 \n"
                + "Melting Point: 1315 K (1042°C or 1908°F) \n"
                + "Boiling Point: 3273 K (3000°C or 5432°F) \n"
                + "Density: 7.26 grams per cubic centimeter \n"
                + "Phase at Room Temperature: Solid \n"
                + "Element Classification: Metal \n"
                + "Period Number: 6    Group Number: none    Group Name: Lanthanide");
        ElementsStat.put("Samarium", "Atomic Number: 62\n" +
                "Atomic Weight: 150.36\n" +
                "Melting Point: 1347 K (1074°C or 1965°F)\n" +
                "Boiling Point: 2067 K (1794°C or 3261°F)\n" +
                "Density: 7.52 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: none    Group Name: Lanthanide");

        ElementsStat.put("Europium", "Atomic Number: 63\n" +
                "Atomic Weight: 151.964\n" +
                "Melting Point: 1095 K (822°C or 1512°F)\n" +
                "Boiling Point: 1802 K (1529°C or 2784°F)\n" +
                "Density: 5.24 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: none    Group Name: Lanthanide");
        ElementsStat.put("Gadolinium", "Atomic Number: 64\n" +
                "Atomic Weight: 157.25\n" +
                "Melting Point: 1586 K (1313°C or 2395°F)\n" +
                "Boiling Point: 3546 K (3273°C or 5923°F)\n" +
                "Density: 7.90 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: none    Group Name: Lanthanide");
        ElementsStat.put("Terbium", "Atomic Number: 65\n" +
                "Atomic Weight: 158.92535\n" +
                "Melting Point: 1629 K (1356°C or 2473°F)\n" +
                "Boiling Point: 3503 K (3230°C or 5846°F)\n" +
                "Density: 8.23 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: none    Group Name: Lanthanide");
        ElementsStat.put("Dysprosium", "Atomic Number: 66\n" +
                "Atomic Weight: 162.500\n" +
                "Melting Point: 1685 K (1412°C or 2574°F)\n" +
                "Boiling Point: 2840 K (2567°C or 4653°F)\n" +
                "Density: 8.55 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: none    Group Name: Lanthanide");
        ElementsStat.put("Holmium", "Atomic Number: 67\n" +
                "Atomic Weight: 164.93033\n" +
                "Melting Point: 1747 K (1474°C or 2685°F)\n" +
                "Boiling Point: 2973 K (2700°C or 4892°F)\n" +
                "Density: 8.80 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: none    Group Name: Lanthanide");
        ElementsStat.put("Erbium", "Atomic Number: 68\n" +
                "Atomic Weight: 167.259\n" +
                "Melting Point: 1802 K (1529°C or 2784°F)\n" +
                "Boiling Point: 3141 K (2868°C or 5194°F)\n" +
                "Density: 9.07 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: none    Group Name: Lanthanide");
        ElementsStat.put("Thulium", "Atomic Number: 69\n" +
                "Atomic Weight: 168.93422\n" +
                "Melting Point: 1818 K (1545°C or 2813°F)\n" +
                "Boiling Point: 2223 K (1950°C or 3542°F)\n" +
                "Density: 9.32 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: none    Group Name: Lanthanide");
        ElementsStat.put("Ytterbium", "Atomic Number: 70\n" +
                "Atomic Weight: 173.045\n" +
                "Melting Point: 1092 K (819°C or 1506°F)\n" +
                "Boiling Point: 1469 K (1196°C or 2185°F)\n" +
                "Density: 6.90 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: none    Group Name: Lanthanide");
        ElementsStat.put("Luteium", "Atomic Number: 71\n" +
                "Atomic Weight: 174.9668\n" +
                "Melting Point: 1936 K (1663°C or 3025°F)\n" +
                "Boiling Point: 3675 K (3402°C or 6156°F)\n" +
                "Density: 9.84 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: 3    Group Name: Lanthanide");
        ElementsStat.put("Hafnium", "Atomic Number: 72\n" +
                "Atomic Weight: 178.49\n" +
                "Melting Point: 2506 K (2233°C or 4051°F)\n" +
                "Boiling Point: 4876 K (4603°C or 8317°F)\n" +
                "Density: 13.3 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: 4    Group Name: none");
        ElementsStat.put("Tantalum", "Atomic Number: 73\n" +
                "Atomic Weight: 180.94788\n" +
                "Melting Point: 3290 K (3017°C or 5463°F)\n" +
                "Boiling Point: 5731 K (5458°C or 9856°F)\n" +
                "Density: 16.4 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: 5    Group Name: none");
        ElementsStat.put("Tungsten", "Atomic Number: 74\n" +
                "Atomic Weight: 183.84\n" +
                "Melting Point: 3695 K (3422°C or 6192°F)\n" +
                "Boiling Point: 5828 K (5555°C or 10031°F)\n" +
                "Density: 19.3 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: 6    Group Name: none");
        ElementsStat.put("Rhenium", "Atomic Number: 75\n" +
                "Atomic Weight: 186.207\n" +
                "Melting Point: 3459 K (3186°C or 5767°F)\n" +
                "Boiling Point: 5869 K (5596°C or 10105°F)\n" +
                "Density: 20.8 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: 7    Group Name: none");
        ElementsStat.put("Osmium", "Atomic Number: 76\n" +
                "Atomic Weight: 190.23\n" +
                "Melting Point: 3306 K (3033°C or 5491°F)\n" +
                "Boiling Point: 5285 K (5012°C or 9054°F)\n" +
                "Density: 22.57 grams per cubic centim");
        ElementsStat.put("Iridium", "Atomic Number: 77\n" +
                "Atomic Weight: 192.217\n" +
                "Melting Point: 2719 K (2446°C or 4435°F)\n" +
                "Boiling Point: 4701 K (4428°C or 8002°F)\n" +
                "Density: 22.42 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: 9    Group Name: none");
        ElementsStat.put("Platium", "Atomic Number: 78\n" +
                "Atomic Weight: 195.084\n" +
                "Melting Point: 2041.55 K (1768.4°C or 3215.1°F)\n" +
                "Boiling Point: 4098 K (3825°C or 6917°F)\n" +
                "Density: 21.46 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: 10    Group Name: none");
        ElementsStat.put("Gold", "Atomic Number: 79\n" +
                "Atomic Weight: 196.966569\n" +
                "Melting Point: 1337.33 K (1064.18°C or 1947.52°F)\n" +
                "Boiling Point: 3129 K (2856°C or 5173°F)\n" +
                "Density: 19.282 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: 11    Group Name: none");
        ElementsStat.put("Mercury", "Atomic Number: 80\n" +
                "Atomic Weight: 200.592\n" +
                "Melting Point: 234.32 K (-38.83°C or -37.89°F)\n" +
                "Boiling Point: 629.88 K (356.73°C or 674.11°F)\n" +
                "Density: 13.5336 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Liquid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: 12    Group Name: none");
        ElementsStat.put("Thallium", "Atomic Number: 81\n" +
                "Atomic Weight: 204.3833\n" +
                "Melting Point: 577 K (304°C or 579°F)\n" +
                "Boiling Point: 1746 K (1473°C or 2683°F)\n" +
                "Density: 11.8 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: 13    Group Name: none");
        ElementsStat.put("Lead", "Atomic Number: 82\n" +
                "Atomic Weight: 207.2\n" +
                "Melting Point: 600.61 K (327.46°C or 621.43°F)\n" +
                "Boiling Point: 2022 K (1749°C or 3180°F)\n" +
                "Density: 11.342 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: 14    Group Name: none");
        ElementsStat.put("Bismuth", "Atomic Number: 83\n" +
                "Atomic Weight: 208.98040\n" +
                "Melting Point: 544.55 K (271.40°C or 520.52°F)\n" +
                "Boiling Point: 1837 K (1564°C or 2847°F)\n" +
                "Density: 9.807 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: 15    Group Name: Pnictogen\n" +
                "Radioactive");
        ElementsStat.put("Polonium", "Atomic Number: 84\n" +
                "Atomic Weight: 209\n" +
                "Melting Point: 527 K (254°C or 489°F)\n" +
                "Boiling Point: 1235 K (962°C or 1764°F)\n" +
                "Density: 9.32 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: 16    Group Name: Chalcogen\n" +
                "Radioactive");
        ElementsStat.put("Astatine", "Atomic Number: 85\n" +
                "Atomic Weight: 210\n" +
                "Melting Point: 575 K (302°C or 576°F)\n" +
                "Boiling Point: Unknown\n" +
                "Density: about 7 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Semi-metal\n" +
                "Period Number: 6    Group Number: 17    Group Name: Halogen\n" +
                "Radioactive");
        ElementsStat.put("Radon", "Atomic Number: 86\n" +
                "Atomic Weight: 222\n" +
                "Melting Point: 202 K (-71°C or -96°F)\n" +
                "Boiling Point: 211.45 K (-61.7°C or -79.1°F)\n" +
                "Density: 0.00973 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Gas\n" +
                "Element Classification: Non-metal\n" +
                "Period Number: 6    Group Number: 18    Group Name: Noble Gas\n" +
                "Radioactive");
        ElementsStat.put("Francium", "Atomic Number: 87\n" +
                "Atomic Weight: 223\n" +
                "Melting Point: 300 K (27°C or 81°F)\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: 1    Group Name: Alkali Metal\n" +
                "Radioactive");
        ElementsStat.put("Radium", "Atomic Number: 88\n" +
                "Atomic Weight: 226\n" +
                "Melting Point: 973 K (700°C or 1292°F)\n" +
                "Boiling Point: 1413 K (1140°C or 2084°F)\n" +
                "Density: 5 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: 2    Group Name: Alkaline Earth Metal\n" +
                "Radioactive");
        ElementsStat.put("Actinium", "Atomic Number: 89\n" +
                "Atomic Weight: 227\n" +
                "Melting Point: 1324 K (1051°C or 1924°F)\n" +
                "Boiling Point: 3471 K (3198°C or 5788°F)\n" +
                "Density: 10.07 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: none    Group Name: Actinide\n" +
                "Radioactive");
        ElementsStat.put("Thorium", "Atomic Number: 90\n" +
                "Atomic Weight: 232.0377\n" +
                "Melting Point: 2023 K (1750°C or 3182°F)\n" +
                "Boiling Point: 5061 K (4788°C or 8650°F)\n" +
                "Density: 11.72 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: none    Group Name: Actinide\n" +
                "Radioactive");
        ElementsStat.put("Protactinium", "Atomic Number: 91\n" +
                "Atomic Weight: 231.03588\n" +
                "Melting Point: 1845 K (1572°C or 2862°F)\n" +
                "Boiling Point: Unknown\n" +
                "Density: 15.37 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: none    Group Name: Actinide\n" +
                "Radioactive");
        ElementsStat.put("Uranium", "Atomic Number: 92\n" +
                "Atomic Weight: 238.02891\n" +
                "Melting Point: 1408 K (1135°C or 2075°F)\n" +
                "Boiling Point: 4404 K (4131°C or 7468°F)\n" +
                "Density: 18.95 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: none    Group Name: Actinide\n" +
                "Radioactive");
        ElementsStat.put("Neptunium", "Atomic Number: 93\n" +
                "Atomic Weight: 237\n" +
                "Melting Point: 917 K (644°C or 1191°F)\n" +
                "Boiling Point: 4175 K (3902°C or 7056°F)\n" +
                "Density: 20.25 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: none    Group Name: Actinide\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Plutonium", "Atomic Number: 94\n" +
                "Atomic Weight: 244\n" +
                "Melting Point: 913 K (640°C or 1184°F)\n" +
                "Boiling Point: 3501 K (3228°C or 5842°F)\n" +
                "Density: 19.84 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: none    Group Name: Actinide\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Americium", "Atomic Number: 95\n" +
                "Atomic Weight: 243\n" +
                "Melting Point: 1449 K (1176°C or 2149°F)\n" +
                "Boiling Point: 2284 K (2011°C or 3652°F)\n" +
                "Density: 13.69 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: none    Group Name: Actinide\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Curium", "Atomic Number: 96\n" +
                "Atomic Weight: 247\n" +
                "Melting Point: 1618 K (1345°C or 2453°F)\n" +
                "Boiling Point: ~3400 K (~3100°C or ~5600°F)\n" +
                "Density: 13.51 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: none    Group Name: Actinide\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Berkelium", "Atomic Number: 97\n" +
                "Atomic Weight: 247\n" +
                "Melting Point: 1323 K (1050°C or 1922°F)\n" +
                "Boiling Point: Unknown\n" +
                "Density: 14 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: none    Group Name: Actinide\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Californium", "Atomic Number: 98\n" +
                "Atomic Weight: 251\n" +
                "Melting Point: 1173 K (900°C or 1652°F)\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: none    Group Name: Actinide\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Einsteinium", "Atomic Number: 99\n" +
                "Atomic Weight: 252\n" +
                "Melting Point: 1133 K (860°C or 1580°F)\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: none    Group Name: Actinide\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Fermium", "Atomic Number: 100\n" +
                "Atomic Weight: 257\n" +
                "Melting Point: 1800 K (1527°C or 2781°F)\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: none    Group Name: Actinide\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Mendelevium", "Atomic Number: 101\n" +
                "Atomic Weight: 258\n" +
                "Melting Point: 1100 K (827°C or 1521°F)\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: none    Group Name: Actinide\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Nobelium", "Atomic Number: 102\n" +
                "Atomic Weight: 259\n" +
                "Melting Point: 1100 K (827°C or 1520°F)\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: none    Group Name: Actinide\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Lawrencium", "Atomic Number: 103\n" +
                "Atomic Weight: 262\n" +
                "Melting Point: 1900 K (1627°C or 2961°F)\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: 3    Group Name: Actinide\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Rutherfordium", "Atomic Number: 104\n" +
                "Atomic Weight: 263\n" +
                "Melting Point: Unknown\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: 4    Group Name: none\n" +
                "Radioactive and Artificially Produced");

        ElementsStat.put("Dubnium", "Atomic Number: 105\n" +
                "Atomic Weight: 268\n" +
                "Melting Point: Unknown\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: 5    Group Name: none\n" +
                "Radioactive and Artificially Produced");

        ElementsStat.put("Seaborgium", "Atomic Number: 106\n" +
                "Atomic Weight: 271\n" +
                "Melting Point: Unknown\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: 6    Group Name: none\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Bohrium", "Atomic Number: 107\n" +
                "Atomic Weight: 270\n" +
                "Melting Point: Unknown\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: 7    Group Name: none\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Hassium", "Atomic Number: 108\n" +
                "Atomic Weight: 270\n" +
                "Melting Point: Unknown\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: 8    Group Name: none\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Meitnerium", "Atomic Number: 109\n" +
                "Atomic Weight: 278\n" +
                "Melting Point: Unknown\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: 9    Group Name: none\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Darmstadtium", "Atomic Number: 110\n" +
                "Atomic Weight: 281\n" +
                "Melting Point: Unknown\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Expected to be a Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: 10    Group Name: none\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Roentgenium", "Atomic Number: 111\n" +
                "Atomic Weight: 281\n" +
                "Melting Point: Unknown\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Expected to be a Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: 11    Group Name: none\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Copernicium", "Atomic Number: 112\n" +
                "Atomic Weight: 285\n" +
                "Melting Point: Unknown\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Expected to be a Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: 12    Group Name: none\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Nihonium", "Atomic Number: 113\n" +
                "Atomic Weight: 286\n" +
                "Melting Point: Unknown\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Expected to be a Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: 13    Group Name: none\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Flerovium", "Atomic Number: 114\n" +
                "Atomic Weight: 289\n" +
                "Melting Point: Unknown\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Expected to be a Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: 14    Group Name: none\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Moscovium", "Atomic Number: 115\n" +
                "Atomic Weight: 289\n" +
                "Melting Point: Unknown\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Expected to be a Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: 15    Group Name: Pnictogen\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Livermorium", "Atomic Number: 116\n" +
                "Atomic Weight: 293\n" +
                "Melting Point: Unknown\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Expected to be a Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: 16    Group Name: Chalcogen\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Tennessine", "Atomic Number: 117\n" +
                "Atomic Weight: 294\n" +
                "Melting Point: Unknown\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Expected to be a Solid\n" +
                "Element Classification: Unknown\n" +
                "Period Number: 7    Group Number: 17    Group Name: Halogen\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Oganesson", "Atomic Number: 118\n" +
                "Atomic Weight: 294\n" +
                "Melting Point: Unknown\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Expected to be a Gas\n" +
                "Element Classification: Non-metal\n" +
                "Period Number: 7    Group Number: 18    Group Name: Noble Gas\n" +
                "Radioactive and Artificially Produced");
        //**********************************************************************************\\


        ElementsStat.put("H",
                "\n" + "Atomic Number: 1" + "\n" + "Atomic Weight: 1.00798" + "\n"
                        + "Melting Point: 13.81 K (-259.34�C or -434.81�F)" + "\n"
                        + "Boiling Point: 20.28 K (-252.87�C or -423.17�F)" + "\n"
                        + "Density: 0.00008988 grams per cubic centimeter" + "\n" + "Phase at Room Temperature: Gas"
                        + "\n" + "Element Classification: Non-metal" + "\n"
                        + "Period Number: 1    Group Number: 1    Group Name: none");
        ElementsStat.put("He",
                "\n" + "Atomic Number: 2" + "\n" + "Atomic Weight: 4.002602" + "\n"
                        + "Melting Point:  0.95 K (-272.2�C or -458.0�F))" + "\n"
                        + "Boiling Point: 4.22 K (-268.93�C or -452.07�F))" + "\n"
                        + "Density: 0.0001785 grams per cubic centimeter" + "\n" + "Phase at Room Temperature: Gas"
                        + "\n" + "Element Classification: Non-metal" + "\n"
                        + "Period Number: 1    Group Number: 18    Group Name: Noble Gas");
        ElementsStat.put("Li", "\n" + "Atomic Number: 3" + "\n" + "Atomic Weight: 6.968" + "\n"
                + "Melting Point:  453.65 K (180.50�C or 356.90�F))" + "\n"
                + "Boiling Point: 1615 K (1342�C or 2448�F))" + "\n"
                + "Density: 0.534 grams per cubic centimeter" + "\n" + "Phase at Room Temperature: Solid"
                + "\n" + "Element Classification: Metal" + "\n"
                + "Period Number: 2    Group Number: 1    Group Name: Alkali Metal");
        ElementsStat.put("Be", "\n" + "Atomic Number: 4" + "\n" +
                "Atomic Weight: 9.0121831" + "\n" +
                "Melting Point: 1560 K (1287�C or 2349�F)" + "\n" +
                "Boiling Point: 2744 K (2471�C or 4480�F)" + "\n" +
                "Density: 1.85 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 2    Group Number: 2    Group Name: Alkaline Earth Metal");
        ElementsStat.put("B", "\n" + "Atomic Number: 5" + "\n" +
                "Atomic Weight: 10.814" + "\n" +
                "Melting Point: 2348 K (2075�C or 3767�F)" + "\n" +
                "Boiling Point: 4273 K (4000�C or 7232�F)" + "\n" +
                "Density: 2.37 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Semi-metal" + "\n" +
                "Period Number: 2    Group Number: 13    Group Name: none");
        ElementsStat.put("C", "\n" + "Atomic Number: 6" + "\n" +
                "Atomic Weight: 12.0106" + "\n" +
                "Melting Point: 3823 K (3550�C or 6422�F)" + "\n" +
                "Boiling Point: 4098 K (3825�C or 6917�F)" + "\n" +
                "Density: 2.2670 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Non-metal" + "\n" +
                "Period Number: 2    Group Number: 14    Group Name: none");
        ElementsStat.put("N", "\n" + "Atomic Number: 7" + "\n" +
                "Atomic Weight: 14.00686" + "\n" +
                "Melting Point: 63.15 K (-210.00�C or -346.00�F)" + "\n" +
                "Boiling Point: 77.36 K (-195.79�C or -320.44�F)" + "\n" +
                "Density: 0.0012506 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Gas" + "\n" +
                "Element Classification: Non-metal" + "\n" +
                "Period Number: 2    Group Number: 15    Group Name: Pnictogen");
        ElementsStat.put("O", "\n" + "Atomic Number: 8" + "\n" +
                "Atomic Weight: 15.99940" + "\n" +
                "Melting Point: 54.36 K (-218.79�C or -361.82�F)" + "\n" +
                "Boiling Point: 90.20 K (-182.95�C or -297.31�F)" + "\n" +
                "Density: 0.001429 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Gas" + "\n" +
                "Element Classification: Non-metal" + "\n" +
                "Period Number: 2    Group Number: 16    Group Name: Chalcogen");
        ElementsStat.put("F", "\n" + "Atomic Number: 9" + "\n" +
                "Atomic Weight: 18.998403163" + "\n" +
                "Melting Point: 53.53 K (-219.62�C or -363.32�F)" + "\n" +
                "Boiling Point: 85.03 K (-188.12�C or -306.62�F)" + "\n" +
                "Density: 0.001696 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Gas" + "\n" +
                "Element Classification: Non-metal" + "\n" +
                "Period Number: 2    Group Number: 17    Group Name: Halogen");
        ElementsStat.put("Ne", "\n" + "Atomic Number: 10" + "\n" +
                "Atomic Weight: 20.1797" + "\n" +
                "Melting Point: 24.56 K (-248.59�C or -415.46�F)" + "\n" +
                "Boiling Point: 27.07 K (-246.08�C or -410.94�F)" + "\n" +
                "Density: 0.0008999 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Gas" + "\n" +
                "Element Classification: Non-metal" + "\n" +
                "Period Number: 2    Group Number: 18    Group Name: Noble Gas");
        ElementsStat.put("Na", "\n" + "Atomic Number: 11" + "\n" +
                "Atomic Weight: 22.98976928" + "\n" +
                "Melting Point: 370.95 K (97.80�C or 208.04�F)" + "\n" +
                "Boiling Point: 1156 K (883�C or 1621�F)" + "\n" +
                "Density: 0.97 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 3    Group Number: 1    Group Name: Alkali Metal");
        ElementsStat.put("Mg", "\n" + "Atomic Number: 12" + "\n" +
                "Atomic Weight: 24.306" + "\n" +
                "Melting Point: 923 K (650�C or 1202�F)" + "\n" +
                "Boiling Point: 1363 K (1090�C or 1994�F)" + "\n" +
                "Density: 1.74 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 3    Group Number: 2    Group Name: Alkaline Earth Metal");
        ElementsStat.put("Al", "\n" + "Atomic Number: 13" + "\n" +
                "Atomic Weight: 26.9815385" + "\n" +
                "Melting Point: 933.437 K (660.323�C or 1220.581�F)" + "\n" +
                "Boiling Point: 2792 K (2519�C or 4566�F)" + "\n" +
                "Density: 2.70 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 3    Group Number: 13    Group Name: none");
        ElementsStat.put("Si", "\n" + "Atomic Number: 14" + "\n" +
                "Atomic Weight: 28.085" + "\n" +
                "Melting Point: 1687 K (1414�C or 2577�F)" + "\n" +
                "Boiling Point: 3538 K (3265�C or 5909�F)" + "\n" +
                "Density: 2.3296 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Semi-metal" + "\n" +
                "Period Number: 3    Group Number: 14    Group Name: none");
        ElementsStat.put("P", "\n" + "Atomic Number: 15" + "\n" +
                "Atomic Weight: 30.973761998" + "\n" +
                "Melting Point: 317.30 K (44.15�C or 111.47�F)" + "\n" +
                "Boiling Point: 553.65 K (280.5�C or 536.9�F)" + "\n" +
                "Density: 1.82 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Non-metal" + "\n" +
                "Period Number: 3    Group Number: 15    Group Name: Pnictogen");
        ElementsStat.put("S", "\n" + "Atomic Number: 16" + "\n" +
                "Atomic Weight: 32.068" + "\n" +
                "Melting Point: 388.36 K (115.21�C or 239.38�F)" + "\n" +
                "Boiling Point: 717.75 K (444.60�C or 832.28�F)" + "\n" +
                "Density: 2.067 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Non-metal" + "\n" +
                "Period Number: 3    Group Number: 16    Group Name: Chalcogen");
        ElementsStat.put("Cl", "\n" + "Atomic Number: 17" + "\n" +
                "Atomic Weight: 35.452" + "\n" +
                "Melting Point: 171.65 K (-101.5�C or -150.7�F)" + "\n" +
                "Boiling Point: 239.11 K (-34.04�C or -29.27�F)" + "\n" +
                "Density: 0.003214 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Gas" + "\n" +
                "Element Classification: Non-metal" + "\n" +
                "Period Number: 3    Group Number: 17    Group Name: Halogen");
        ElementsStat.put("K", "\n" + "Atomic Number: 19" + "\n" +
                "Atomic Weight: 39.0983" + "\n" +
                "Melting Point: 336.53 K (63.38�C or 146.08�F)" + "\n" +
                "Boiling Point: 1032 K (759�C or 1398�F)" + "\n" +
                "Density: 0.89 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 4    Group Number: 1    Group Name: Alkali Metal");
        ElementsStat.put("Ar", "\n" + "Atomic Number: 18" + "\n" +
                "Atomic Weight: 39.948" + "\n" +
                "Melting Point: 83.80 K (-189.35�C or -308.83�F)" + "\n" +
                "Boiling Point: 87.30 K (-185.85�C or -302.53�F)" + "\n" +
                "Density: 0.0017837 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Gas" + "\n" +
                "Element Classification: Non-metal" + "\n" +
                "Period Number: 3    Group Number: 18    Group Name: Noble Gas");
        ElementsStat.put("Ca", "\n" + "Atomic Number: 20" + "\n" +
                "Atomic Weight: 40.078" + "\n" +
                "Melting Point: 1115 K (842�C or 1548�F)" + "\n" +
                "Boiling Point: 1757 K (1484�C or 2703�F)" + "\n" +
                "Density: 1.54 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 4    Group Number: 2    Group Name: Alkaline Earth Metal");
        ElementsStat.put("Sc", "\n" + "Atomic Number: 21" + "\n" +
                "Atomic Weight: 44.955908" + "\n" +
                "Melting Point: 1814 K (1541�C or 2806�F)" + "\n" +
                "Boiling Point: 3109 K (2836�C or 5137�F)" + "\n" +
                "Density: 2.99 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 4    Group Number: 3    Group Name: none");
        ElementsStat.put("Ti", "\n" + "Atomic Number: 22" + "\n" +
                "Atomic Weight: 47.867" + "\n" +
                "Melting Point: 1941 K (1668�C or 3034�F)" + "\n" +
                "Boiling Point: 3560 K (3287�C or 5949�F)" + "\n" +
                "Density: 4.5 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 4    Group Number: 4    Group Name: none");
        ElementsStat.put("V", "\n" + "Atomic Number: 23" + "\n" +
                "Atomic Weight: 50.9415" + "\n" +
                "Melting Point: 2183 K (1910�C or 3470�F)" + "\n" +
                "Boiling Point: 3680 K (3407�C or 6165�F)" + "\n" +
                "Density: 6.0 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 4    Group Number: 5    Group Name: none");
        ElementsStat.put("Cr", "\n" + "Atomic Number: 24" + "\n" +
                "Atomic Weight: 51.9961" + "\n" +
                "Melting Point: 2180 K (1907�C or 3465�F)" + "\n" +
                "Boiling Point: 2944 K (2671�C or 4840�F)" + "\n" +
                "Density: 7.15 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 4    Group Number: 6    Group Name: none");
        ElementsStat.put("Mn", "\n" + "Atomic Number: 25" + "\n" +
                "Atomic Weight: 54.938044" + "\n" +
                "Melting Point: 1519 K (1246�C or 2275�F)" + "\n" +
                "Boiling Point: 2334 K (2061�C or 3742�F)" + "\n" +
                "Density: 7.3 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 4    Group Number: 7    Group Name: none");
        ElementsStat.put("Fe", "\n" + "Atomic Number: 26" + "\n" +
                "Atomic Weight: 55.845" + "\n" +
                "Melting Point: 1811 K (1538�C or 2800�F)" + "\n" +
                "Boiling Point: 3134 K (2861�C or 5182�F)" + "\n" +
                "Density: 7.874 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 4    Group Number: 8    Group Name: none");
        ElementsStat.put("Ni", "\n" + "Atomic Number: 28" + "\n" +
                "Atomic Weight: 58.6934" + "\n" +
                "Melting Point: 1728 K (1455�C or 2651�F)" + "\n" +
                "Boiling Point: 3186 K (2913�C or 5275�F)" + "\n" +
                "Density: 8.912 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 4    Group Number: 10    Group Name: none");
        ElementsStat.put("Co", "\n" + "Atomic Number: 27" + "\n" +
                "Atomic Weight: 58.933194" + "\n" +
                "Melting Point: 1768 K (1495�C or 2723�F)" + "\n" +
                "Boiling Point: 3200 K (2927�C or 5301�F)" + "\n" +
                "Density: 8.86 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 4    Group Number: 9    Group Name: none");
        ElementsStat.put("Cu", "\n" + "Atomic Number: 29" + "\n" +
                "Atomic Weight: 63.546" + "\n" +
                "Melting Point: 1357.77 K (1084.62�C or 1984.32�F)" + "\n" +
                "Boiling Point: 2835 K (2562�C or 4644�F)" + "\n" +
                "Density: 8.933 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 4    Group Number: 11    Group Name: none");
        ElementsStat.put("Zn", "\n" + "Atomic Number: 30" + "\n" +
                "Atomic Weight: 65.38" + "\n" +
                "Melting Point: 692.68 K (419.53�C or 787.15�F)" + "\n" +
                "Boiling Point: 1180 K (907�C or 1665�F)" + "\n" +
                "Density: 7.134 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 4    Group Number: 12    Group Name: none");
        ElementsStat.put("Ga", "\n" + "Atomic Number: 31" + "\n" +
                "Atomic Weight: 69.723" + "\n" +
                "Melting Point: 302.91 K (29.76�C or 85.57�F)" + "\n" +
                "Boiling Point: 2477 K (2204�C or 3999�F)" + "\n" +
                "Density: 5.91 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 4    Group Number: 13    Group Name: none");
        ElementsStat.put("Ge", "\n" + "Atomic Number: 32" + "\n" +
                "Atomic Weight: 72.630" + "\n" +
                "Melting Point: 1211.40 K (938.25�C or 1720.85�F)" + "\n" +
                "Boiling Point: 3106 K (2833�C or 5131�F)" + "\n" +
                "Density: 5.323 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Semi-metal" + "\n" +
                "Period Number: 4    Group Number: 14    Group Name: none");
        ElementsStat.put("As", "\n" + "Atomic Number: 33" + "\n" +
                "Atomic Weight: 74.921595" + "\n" +
                "Melting Point: 1090 K (817�C or 1503�F)" + "\n" +
                "Boiling Point: 887 K (614�C or 1137�F)" + "\n" +
                "Density: 5.776 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Semi-metal" + "\n" +
                "Period Number: 4    Group Number: 15    Group Name: Pnictogen");
        ElementsStat.put("Se", "\n" + "Atomic Number: 34" + "\n" +
                "Atomic Weight: 78.971" + "\n" +
                "Melting Point: 493.65 K (220.5�C or 428.9�F)" + "\n" +
                "Boiling Point: 958 K (685�C or 1265�F)" + "\n" +
                "Density: 4.809 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Non-metal" + "\n" +
                "Period Number: 4    Group Number: 16    Group Name: Chalcogen");
        ElementsStat.put("Br", "\n" + "Atomic Number: 35" + "\n" +
                "Atomic Weight: 79.904" + "\n" +
                "Melting Point: 265.95 K (-7.2�C or 19.0�F)" + "\n" +
                "Boiling Point: 331.95 K (58.8�C or 137.8�F)" + "\n" +
                "Density: 3.11 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Liquid" + "\n" +
                "Element Classification: Non-metal" + "\n" +
                "Period Number: 4    Group Number: 17    Group Name: Halogen");
        ElementsStat.put("Kr", "\n" + "Atomic Number: 36" + "\n" +
                "Atomic Weight: 83.798" + "\n" +
                "Melting Point: 115.79 K (-157.36�C or -251.25�F)" + "\n" +
                "Boiling Point: 119.93 K (-153.22�C or -243.80�F)" + "\n" +
                "Density: 0.003733 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Gas" + "\n" +
                "Element Classification: Non-metal" + "\n" +
                "Period Number: 4    Group Number: 18    Group Name: Noble Gas");
        ElementsStat.put("Rb", "\n" + "Atomic Number: 37" + "\n" +
                "Atomic Weight: 85.4678" + "\n" +
                "Melting Point: 312.46 K (39.31�C or 102.76�F)" + "\n" +
                "Boiling Point: 961 K (688�C or 1270�F)" + "\n" +
                "Density: 1.53 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 5    Group Number: 1    Group Name: Alkali Metal");
        ElementsStat.put("Sr", "\n" + "Atomic Number: 38" + "\n" +
                "Atomic Weight: 87.62" + "\n" +
                "Melting Point: 1050 K (777�C or 1431�F)" + "\n" +
                "Boiling Point: 1655 K (1382�C or 2520�F)" + "\n" +
                "Density: 2.64 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 5    Group Number: 2    Group Name: Alkaline Earth Metal");
        ElementsStat.put("Y", "\n" + "Atomic Number: 39" + "\n" +
                "Atomic Weight: 88.90584" + "\n" +
                "Melting Point: 1795 K (1522�C or 2772�F)" + "\n" +
                "Boiling Point: 3618 K (3345�C or 6053�F)" + "\n" +
                "Density: 4.47 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 5    Group Number: 3    Group Name: none");
        ElementsStat.put("Zr", "\n" + "Atomic Number: 40" + "\n" +
                "Atomic Weight: 91.224" + "\n" +
                "Melting Point: 2128 K (1855�C or 3371�F)" + "\n" +
                "Boiling Point: 4682 K (4409�C or 7968�F)" + "\n" +
                "Density: 6.52 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 5    Group Number: 4    Group Name: none");
        ElementsStat.put("Nb", "\n" + "Atomic Number: 41" + "\n" +
                "Atomic Weight: 92.90637" + "\n" +
                "Melting Point: 2750 K (2477�C or 4491�F)" + "\n" +
                "Boiling Point: 5017 K (4744�C or 8571�F)" + "\n" +
                "Density: 8.57 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 5    Group Number: 5    Group Name: none");
        ElementsStat.put("Mo", "\n" + "Atomic Number: 42" + "\n" +
                "Atomic Weight: 95.95" + "\n" +
                "Melting Point: 2896 K (2623�C or 4753�F)" + "\n" +
                "Boiling Point: 4912 K (4639�C or 8382�F)" + "\n" +
                "Density: 10.2 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 5    Group Number: 6    Group Name: none");
        ElementsStat.put("Tc", "\n" + "Atomic Number: 43" + "\n" +
                "Atomic Weight: 98" + "\n" +
                "Melting Point: 2430 K (2157�C or 3915�F)" + "\n" +
                "Boiling Point: 4538 K (4265�C or 7709�F)" + "\n" +
                "Density: 11 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 5    Group Number: 7    Group Name: none");
        ElementsStat.put("Ru", "\n" + "Atomic Number: 44" + "\n" +
                "Atomic Weight: 101.07" + "\n" +
                "Melting Point: 2607 K (2334�C or 4233�F)" + "\n" +
                "Boiling Point: 4423 K (4150�C or 7502�F)" + "\n" +
                "Density: 12.1 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 5    Group Number: 8    Group Name: none");
        ElementsStat.put("Rh", "\n" + "Atomic Number: 45" + "\n" +
                "Atomic Weight: 102.90550" + "\n" +
                "Melting Point: 2237 K (1964�C or 3567�F)" + "\n" +
                "Boiling Point: 3968 K (3695�C or 6683�F)" + "\n" +
                "Density: 12.4 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 5    Group Number: 9    Group Name: none");
        ElementsStat.put("Pd", "\n" + "Atomic Number: 46" + "\n" +
                "Atomic Weight: 106.42" + "\n" +
                "Melting Point: 1828.05 K (1554.9�C or 2830.8�F)" + "\n" +
                "Boiling Point: 3236 K (2963�C or 5365�F)" + "\n" +
                "Density: 12.0 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 5    Group Number: 10    Group Name: none");
        ElementsStat.put("Ag", "\n" + "Atomic Number: 47" + "\n" +
                "Atomic Weight: 107.8682" + "\n" +
                "Melting Point: 1234.93 K (961.78�C or 1763.20�F)" + "\n" +
                "Boiling Point: 2435 K (2162�C or 3924�F)" + "\n" +
                "Density: 10.501 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 5    Group Number: 11    Group Name: none");
        ElementsStat.put("Cd", "\n" + "Atomic Number: 48" + "\n" +
                "Atomic Weight: 112.414" + "\n" +
                "Melting Point: 594.22 K (321.07�C or 609.93�F)" + "\n" +
                "Boiling Point: 1040 K (767�C or 1413�F)" + "\n" +
                "Density: 8.69 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 5    Group Number: 12    Group Name: none");
        ElementsStat.put("In", "\n" + "Atomic Number: 49" + "\n" +
                "Atomic Weight: 114.818" + "\n" +
                "Melting Point: 429.75 K (156.60�C or 313.88�F)" + "\n" +
                "Boiling Point: 2345 K (2072�C or 3762�F)" + "\n" +
                "Density: 7.31 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 5    Group Number: 13    Group Name: none");
        ElementsStat.put("Sn", "\n" + "Atomic Number: 50" + "\n" +
                "Atomic Weight: 118.710" + "\n" +
                "Melting Point: 505.08 K (231.93�C or 449.47�F)" + "\n" +
                "Boiling Point: 2875 K (2602�C or 4715�F)" + "\n" +
                "Density: 7.287 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 5    Group Number: 14    Group Name: none");
        ElementsStat.put("Sb", "\n" + "Atomic Number: 51" + "\n" +
                "Atomic Weight: 121.760" + "\n" +
                "Melting Point: 903.78 K (630.63�C or 1167.13�F)" + "\n" +
                "Boiling Point: 1860 K (1587�C or 2889�F)" + "\n" +
                "Density: 6.685 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Semi-metal" + "\n" +
                "Period Number: 5    Group Number: 15    Group Name: Pnictogen");
        ElementsStat.put("I", "\n" + "Atomic Number: 53" + "\n" +
                "Atomic Weight: 126.90447" + "\n" +
                "Melting Point: 386.85 K (113.7�C or 236.7�F)" + "\n" +
                "Boiling Point: 457.55 K (184.4�C or 364.0�F)" + "\n" +
                "Density: 4.93 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Non-metal" + "\n" +
                "Period Number: 5    Group Number: 17    Group Name: Halogen");
        ElementsStat.put("Te", "\n" + "Atomic Number: 52" + "\n" +
                "Atomic Weight: 127.60" + "\n" +
                "Melting Point: 722.66 K (449.51�C or 841.12�F)" + "\n" +
                "Boiling Point: 1261 K (988�C or 1810�F)" + "\n" +
                "Density: 6.232 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Semi-metal" + "\n" +
                "Period Number: 5    Group Number: 16    Group Name: Chalcogen");
        ElementsStat.put("Xe", "\n" + "Atomic Number: 54" + "\n" +
                "Atomic Weight: 131.293" + "\n" +
                "Melting Point: 161.36 K (-111.79�C or -169.22�F)" + "\n" +
                "Boiling Point: 165.03 K (-108.12�C or -162.62�F)" + "\n" +
                "Density: 0.005887 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Gas" + "\n" +
                "Element Classification: Non-metal" + "\n" +
                "Period Number: 5    Group Number: 18    Group Name: Noble Gas");
        ElementsStat.put("Cs", "\n" + "Atomic Number: 55" + "\n" +
                "Atomic Weight: 132.90545196" + "\n" +
                "Melting Point: 301.59 K (28.44�C or 83.19�F)" + "\n" +
                "Boiling Point: 944 K (671�C or 1240�F)" + "\n" +
                "Density: 1.93 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 6    Group Number: 1    Group Name: Alkali Metal");
        ElementsStat.put("Ba", "\n" + "Atomic Number: 56" + "\n" +
                "Atomic Weight: 137.327" + "\n" +
                "Melting Point: 1000 K (727�C or 1341�F)" + "\n" +
                "Boiling Point: 2170 K (1897�C or 3447�F)" + "\n" +
                "Density: 3.62 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 6    Group Number: 2    Group Name: Alkaline Earth Metal");
        ElementsStat.put("La", "\n" + "Atomic Number: 57" + "\n" +
                "Atomic Weight: 138.90547" + "\n" +
                "Melting Point: 1191 K (918�C or 1684�F)" + "\n" +
                "Boiling Point: 3737 K (3464�C or 6267�F)" + "\n" +
                "Density: 6.15 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 6    Group Number: none    Group Name: Lanthanide");
        ElementsStat.put("Ce", "\n" + "Atomic Number: 58" + "\n" +
                "Atomic Weight: 140.116" + "\n" +
                "Melting Point: 1071 K (798�C or 1468�F)" + "\n" +
                "Boiling Point: 3697 K (3424�C or 6195�F)" + "\n" +
                "Density: 6.770 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 6    Group Number: none    Group Name: Lanthanide");
        ElementsStat.put("Pr", "\n" + "Atomic Number: 59" + "\n" +
                "Atomic Weight: 140.90766" + "\n" +
                "Melting Point: 1204 K (931�C or 1708�F)" + "\n" +
                "Boiling Point: 3793 K (3520�C or 6368�F)" + "\n" +
                "Density: 6.77 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 6    Group Number: none    Group Name: Lanthanide");
        ElementsStat.put("Nd", "\n" + "Atomic Number: 60" + "\n" +
                "Atomic Weight: 144.242" + "\n" +
                "Melting Point: 1294 K (1021�C or 1870�F)" + "\n" +
                "Boiling Point: 3347 K (3074�C or 5565�F)" + "\n" +
                "Density: 7.01 grams per cubic centimeter" + "\n" +
                "Phase at Room Temperature: Solid" + "\n" +
                "Element Classification: Metal" + "\n" +
                "Period Number: 6    Group Number: none    Group Name: Lanthanide");
        ElementsStat.put("Pm", "Atomic Number: 61 \n"
                + "Atomic Weight: 145 \n"
                + "Melting Point: 1315 K (1042°C or 1908°F) \n"
                + "Boiling Point: 3273 K (3000°C or 5432°F) \n"
                + "Density: 7.26 grams per cubic centimeter \n"
                + "Phase at Room Temperature: Solid \n"
                + "Element Classification: Metal \n"
                + "Period Number: 6    Group Number: none    Group Name: Lanthanide");
        ElementsStat.put("Sm", "Atomic Number: 62\n" +
                "Atomic Weight: 150.36\n" +
                "Melting Point: 1347 K (1074°C or 1965°F)\n" +
                "Boiling Point: 2067 K (1794°C or 3261°F)\n" +
                "Density: 7.52 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: none    Group Name: Lanthanide");

        ElementsStat.put("Eu", "Atomic Number: 63\n" +
                "Atomic Weight: 151.964\n" +
                "Melting Point: 1095 K (822°C or 1512°F)\n" +
                "Boiling Point: 1802 K (1529°C or 2784°F)\n" +
                "Density: 5.24 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: none    Group Name: Lanthanide");
        ElementsStat.put("Gd", "Atomic Number: 64\n" +
                "Atomic Weight: 157.25\n" +
                "Melting Point: 1586 K (1313°C or 2395°F)\n" +
                "Boiling Point: 3546 K (3273°C or 5923°F)\n" +
                "Density: 7.90 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: none    Group Name: Lanthanide");
        ElementsStat.put("Tb", "Atomic Number: 65\n" +
                "Atomic Weight: 158.92535\n" +
                "Melting Point: 1629 K (1356°C or 2473°F)\n" +
                "Boiling Point: 3503 K (3230°C or 5846°F)\n" +
                "Density: 8.23 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: none    Group Name: Lanthanide");
        ElementsStat.put("Dy", "Atomic Number: 66\n" +
                "Atomic Weight: 162.500\n" +
                "Melting Point: 1685 K (1412°C or 2574°F)\n" +
                "Boiling Point: 2840 K (2567°C or 4653°F)\n" +
                "Density: 8.55 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: none    Group Name: Lanthanide");
        ElementsStat.put("Ho", "Atomic Number: 67\n" +
                "Atomic Weight: 164.93033\n" +
                "Melting Point: 1747 K (1474°C or 2685°F)\n" +
                "Boiling Point: 2973 K (2700°C or 4892°F)\n" +
                "Density: 8.80 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: none    Group Name: Lanthanide");
        ElementsStat.put("Er", "Atomic Number: 68\n" +
                "Atomic Weight: 167.259\n" +
                "Melting Point: 1802 K (1529°C or 2784°F)\n" +
                "Boiling Point: 3141 K (2868°C or 5194°F)\n" +
                "Density: 9.07 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: none    Group Name: Lanthanide");
        ElementsStat.put("Tm", "Atomic Number: 69\n" +
                "Atomic Weight: 168.93422\n" +
                "Melting Point: 1818 K (1545°C or 2813°F)\n" +
                "Boiling Point: 2223 K (1950°C or 3542°F)\n" +
                "Density: 9.32 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: none    Group Name: Lanthanide");
        ElementsStat.put("Yb", "Atomic Number: 70\n" +
                "Atomic Weight: 173.045\n" +
                "Melting Point: 1092 K (819°C or 1506°F)\n" +
                "Boiling Point: 1469 K (1196°C or 2185°F)\n" +
                "Density: 6.90 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: none    Group Name: Lanthanide");
        ElementsStat.put("Lu", "Atomic Number: 71\n" +
                "Atomic Weight: 174.9668\n" +
                "Melting Point: 1936 K (1663°C or 3025°F)\n" +
                "Boiling Point: 3675 K (3402°C or 6156°F)\n" +
                "Density: 9.84 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: 3    Group Name: Lanthanide");
        ElementsStat.put("Hf", "Atomic Number: 72\n" +
                "Atomic Weight: 178.49\n" +
                "Melting Point: 2506 K (2233°C or 4051°F)\n" +
                "Boiling Point: 4876 K (4603°C or 8317°F)\n" +
                "Density: 13.3 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: 4    Group Name: none");
        ElementsStat.put("Ta", "Atomic Number: 73\n" +
                "Atomic Weight: 180.94788\n" +
                "Melting Point: 3290 K (3017°C or 5463°F)\n" +
                "Boiling Point: 5731 K (5458°C or 9856°F)\n" +
                "Density: 16.4 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: 5    Group Name: none");
        ElementsStat.put("W", "Atomic Number: 74\n" +
                "Atomic Weight: 183.84\n" +
                "Melting Point: 3695 K (3422°C or 6192°F)\n" +
                "Boiling Point: 5828 K (5555°C or 10031°F)\n" +
                "Density: 19.3 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: 6    Group Name: none");
        ElementsStat.put("Re", "Atomic Number: 75\n" +
                "Atomic Weight: 186.207\n" +
                "Melting Point: 3459 K (3186°C or 5767°F)\n" +
                "Boiling Point: 5869 K (5596°C or 10105°F)\n" +
                "Density: 20.8 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: 7    Group Name: none");
        ElementsStat.put("Os", "Atomic Number: 76\n" +
                "Atomic Weight: 190.23\n" +
                "Melting Point: 3306 K (3033°C or 5491°F)\n" +
                "Boiling Point: 5285 K (5012°C or 9054°F)\n" +
                "Density: 22.57 grams per cubic centim");
        ElementsStat.put("Ir", "Atomic Number: 77\n" +
                "Atomic Weight: 192.217\n" +
                "Melting Point: 2719 K (2446°C or 4435°F)\n" +
                "Boiling Point: 4701 K (4428°C or 8002°F)\n" +
                "Density: 22.42 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: 9    Group Name: none");
        ElementsStat.put("Pt", "Atomic Number: 78\n" +
                "Atomic Weight: 195.084\n" +
                "Melting Point: 2041.55 K (1768.4°C or 3215.1°F)\n" +
                "Boiling Point: 4098 K (3825°C or 6917°F)\n" +
                "Density: 21.46 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: 10    Group Name: none");
        ElementsStat.put("Au", "Atomic Number: 79\n" +
                "Atomic Weight: 196.966569\n" +
                "Melting Point: 1337.33 K (1064.18°C or 1947.52°F)\n" +
                "Boiling Point: 3129 K (2856°C or 5173°F)\n" +
                "Density: 19.282 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: 11    Group Name: none");
        ElementsStat.put("Hg", "Atomic Number: 80\n" +
                "Atomic Weight: 200.592\n" +
                "Melting Point: 234.32 K (-38.83°C or -37.89°F)\n" +
                "Boiling Point: 629.88 K (356.73°C or 674.11°F)\n" +
                "Density: 13.5336 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Liquid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: 12    Group Name: none");
        ElementsStat.put("Ti", "Atomic Number: 81\n" +
                "Atomic Weight: 204.3833\n" +
                "Melting Point: 577 K (304°C or 579°F)\n" +
                "Boiling Point: 1746 K (1473°C or 2683°F)\n" +
                "Density: 11.8 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: 13    Group Name: none");
        ElementsStat.put("Pb", "Atomic Number: 82\n" +
                "Atomic Weight: 207.2\n" +
                "Melting Point: 600.61 K (327.46°C or 621.43°F)\n" +
                "Boiling Point: 2022 K (1749°C or 3180°F)\n" +
                "Density: 11.342 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: 14    Group Name: none");
        ElementsStat.put("Bi", "Atomic Number: 83\n" +
                "Atomic Weight: 208.98040\n" +
                "Melting Point: 544.55 K (271.40°C or 520.52°F)\n" +
                "Boiling Point: 1837 K (1564°C or 2847°F)\n" +
                "Density: 9.807 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: 15    Group Name: Pnictogen\n" +
                "Radioactive");
        ElementsStat.put("Po", "Atomic Number: 84\n" +
                "Atomic Weight: 209\n" +
                "Melting Point: 527 K (254°C or 489°F)\n" +
                "Boiling Point: 1235 K (962°C or 1764°F)\n" +
                "Density: 9.32 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 6    Group Number: 16    Group Name: Chalcogen\n" +
                "Radioactive");
        ElementsStat.put("At", "Atomic Number: 85\n" +
                "Atomic Weight: 210\n" +
                "Melting Point: 575 K (302°C or 576°F)\n" +
                "Boiling Point: Unknown\n" +
                "Density: about 7 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Semi-metal\n" +
                "Period Number: 6    Group Number: 17    Group Name: Halogen\n" +
                "Radioactive");
        ElementsStat.put("Rn", "Atomic Number: 86\n" +
                "Atomic Weight: 222\n" +
                "Melting Point: 202 K (-71°C or -96°F)\n" +
                "Boiling Point: 211.45 K (-61.7°C or -79.1°F)\n" +
                "Density: 0.00973 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Gas\n" +
                "Element Classification: Non-metal\n" +
                "Period Number: 6    Group Number: 18    Group Name: Noble Gas\n" +
                "Radioactive");
        ElementsStat.put("Fr", "Atomic Number: 87\n" +
                "Atomic Weight: 223\n" +
                "Melting Point: 300 K (27°C or 81°F)\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: 1    Group Name: Alkali Metal\n" +
                "Radioactive");
        ElementsStat.put("Ra", "Atomic Number: 88\n" +
                "Atomic Weight: 226\n" +
                "Melting Point: 973 K (700°C or 1292°F)\n" +
                "Boiling Point: 1413 K (1140°C or 2084°F)\n" +
                "Density: 5 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: 2    Group Name: Alkaline Earth Metal\n" +
                "Radioactive");
        ElementsStat.put("Ac", "Atomic Number: 89\n" +
                "Atomic Weight: 227\n" +
                "Melting Point: 1324 K (1051°C or 1924°F)\n" +
                "Boiling Point: 3471 K (3198°C or 5788°F)\n" +
                "Density: 10.07 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: none    Group Name: Actinide\n" +
                "Radioactive");
        ElementsStat.put("Th", "Atomic Number: 90\n" +
                "Atomic Weight: 232.0377\n" +
                "Melting Point: 2023 K (1750°C or 3182°F)\n" +
                "Boiling Point: 5061 K (4788°C or 8650°F)\n" +
                "Density: 11.72 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: none    Group Name: Actinide\n" +
                "Radioactive");
        ElementsStat.put("Pa", "Atomic Number: 91\n" +
                "Atomic Weight: 231.03588\n" +
                "Melting Point: 1845 K (1572°C or 2862°F)\n" +
                "Boiling Point: Unknown\n" +
                "Density: 15.37 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: none    Group Name: Actinide\n" +
                "Radioactive");
        ElementsStat.put("U", "Atomic Number: 92\n" +
                "Atomic Weight: 238.02891\n" +
                "Melting Point: 1408 K (1135°C or 2075°F)\n" +
                "Boiling Point: 4404 K (4131°C or 7468°F)\n" +
                "Density: 18.95 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: none    Group Name: Actinide\n" +
                "Radioactive");
        ElementsStat.put("Np", "Atomic Number: 93\n" +
                "Atomic Weight: 237\n" +
                "Melting Point: 917 K (644°C or 1191°F)\n" +
                "Boiling Point: 4175 K (3902°C or 7056°F)\n" +
                "Density: 20.25 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: none    Group Name: Actinide\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Pu", "Atomic Number: 94\n" +
                "Atomic Weight: 244\n" +
                "Melting Point: 913 K (640°C or 1184°F)\n" +
                "Boiling Point: 3501 K (3228°C or 5842°F)\n" +
                "Density: 19.84 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: none    Group Name: Actinide\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Am", "Atomic Number: 95\n" +
                "Atomic Weight: 243\n" +
                "Melting Point: 1449 K (1176°C or 2149°F)\n" +
                "Boiling Point: 2284 K (2011°C or 3652°F)\n" +
                "Density: 13.69 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: none    Group Name: Actinide\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Cm", "Atomic Number: 96\n" +
                "Atomic Weight: 247\n" +
                "Melting Point: 1618 K (1345°C or 2453°F)\n" +
                "Boiling Point: ~3400 K (~3100°C or ~5600°F)\n" +
                "Density: 13.51 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: none    Group Name: Actinide\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Bk", "Atomic Number: 97\n" +
                "Atomic Weight: 247\n" +
                "Melting Point: 1323 K (1050°C or 1922°F)\n" +
                "Boiling Point: Unknown\n" +
                "Density: 14 grams per cubic centimeter\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: none    Group Name: Actinide\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Cf", "Atomic Number: 98\n" +
                "Atomic Weight: 251\n" +
                "Melting Point: 1173 K (900°C or 1652°F)\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: none    Group Name: Actinide\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Es", "Atomic Number: 99\n" +
                "Atomic Weight: 252\n" +
                "Melting Point: 1133 K (860°C or 1580°F)\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: none    Group Name: Actinide\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Fm", "Atomic Number: 100\n" +
                "Atomic Weight: 257\n" +
                "Melting Point: 1800 K (1527°C or 2781°F)\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: none    Group Name: Actinide\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Md", "Atomic Number: 101\n" +
                "Atomic Weight: 258\n" +
                "Melting Point: 1100 K (827°C or 1521°F)\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: none    Group Name: Actinide\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("No", "Atomic Number: 102\n" +
                "Atomic Weight: 259\n" +
                "Melting Point: 1100 K (827°C or 1520°F)\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: none    Group Name: Actinide\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Lr", "Atomic Number: 103\n" +
                "Atomic Weight: 262\n" +
                "Melting Point: 1900 K (1627°C or 2961°F)\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: 3    Group Name: Actinide\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Rf", "Atomic Number: 104\n" +
                "Atomic Weight: 263\n" +
                "Melting Point: Unknown\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: 4    Group Name: none\n" +
                "Radioactive and Artificially Produced");

        ElementsStat.put("Db", "Atomic Number: 105\n" +
                "Atomic Weight: 268\n" +
                "Melting Point: Unknown\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: 5    Group Name: none\n" +
                "Radioactive and Artificially Produced");

        ElementsStat.put("Sg", "Atomic Number: 106\n" +
                "Atomic Weight: 271\n" +
                "Melting Point: Unknown\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: 6    Group Name: none\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Bh", "Atomic Number: 107\n" +
                "Atomic Weight: 270\n" +
                "Melting Point: Unknown\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: 7    Group Name: none\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Hs", "Atomic Number: 108\n" +
                "Atomic Weight: 270\n" +
                "Melting Point: Unknown\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: 8    Group Name: none\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Mt", "Atomic Number: 109\n" +
                "Atomic Weight: 278\n" +
                "Melting Point: Unknown\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: 9    Group Name: none\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Ds", "Atomic Number: 110\n" +
                "Atomic Weight: 281\n" +
                "Melting Point: Unknown\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Expected to be a Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: 10    Group Name: none\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Rg", "Atomic Number: 111\n" +
                "Atomic Weight: 281\n" +
                "Melting Point: Unknown\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Expected to be a Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: 11    Group Name: none\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Cn", "Atomic Number: 112\n" +
                "Atomic Weight: 285\n" +
                "Melting Point: Unknown\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Expected to be a Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: 12    Group Name: none\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Nh", "Atomic Number: 113\n" +
                "Atomic Weight: 286\n" +
                "Melting Point: Unknown\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Expected to be a Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: 13    Group Name: none\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Fl", "Atomic Number: 114\n" +
                "Atomic Weight: 289\n" +
                "Melting Point: Unknown\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Expected to be a Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: 14    Group Name: none\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Mc", "Atomic Number: 115\n" +
                "Atomic Weight: 289\n" +
                "Melting Point: Unknown\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Expected to be a Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: 15    Group Name: Pnictogen\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Lv", "Atomic Number: 116\n" +
                "Atomic Weight: 293\n" +
                "Melting Point: Unknown\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Expected to be a Solid\n" +
                "Element Classification: Metal\n" +
                "Period Number: 7    Group Number: 16    Group Name: Chalcogen\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Ts", "Atomic Number: 117\n" +
                "Atomic Weight: 294\n" +
                "Melting Point: Unknown\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Expected to be a Solid\n" +
                "Element Classification: Unknown\n" +
                "Period Number: 7    Group Number: 17    Group Name: Halogen\n" +
                "Radioactive and Artificially Produced");
        ElementsStat.put("Og", "Atomic Number: 118\n" +
                "Atomic Weight: 294\n" +
                "Melting Point: Unknown\n" +
                "Boiling Point: Unknown\n" +
                "Density: Unknown\n" +
                "Phase at Room Temperature: Expected to be a Gas\n" +
                "Element Classification: Non-metal\n" +
                "Period Number: 7    Group Number: 18    Group Name: Noble Gas\n" +
                "Radioactive and Artificially Produced");



    }

    public static String lookup(String element) {
        if (ElementsStat == null) {
            System.err.println("Trying to lookup element before table is created");
        }
        String m = ElementsStat.get(element);
        if (m == null) {
            return null;
        } else {
            return m;
        }
    }

    public static String molecularWeight(String compound) {
        return lookup(compound);
    }

    public static String molecularWeight2(String compound) {
        return lookup(compound);
    }

}
