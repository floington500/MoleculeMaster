package me.flo456123.element;

import me.flo456123.element.elements.*;

public class ElementFactory {
    public static Element createElement(String symbol, int atoms) {
        if (symbol.length() > 2 || symbol.length() < 1) {
            throw new ElementException("invalid symbol - element symbol must be two characters");
        }

        return switch (symbol) {
            case "Al" -> new Aluminum(atoms);
            case "Ar" -> new Argon(atoms);
            case "Be" -> new Beryllium(atoms);
            case "B" -> new Boron(atoms);
            case "C" -> new Carbon(atoms);
            case "Cl" -> new Chlorine(atoms);
            case "F" -> new Fluorine(atoms);
            case "He" -> new Helium(atoms);
            case "H" -> new Hydrogen(atoms);
            case "Li" -> new Lithium(atoms);
            case "Mg" -> new Magnesium(atoms);
            case "Ne" -> new Neon(atoms);
            case "N" -> new Nitrogen(atoms);
            case "O" -> new Oxygen(atoms);
            case "P" -> new Phosphorus(atoms);
            case "Si" -> new Silicon(atoms);
            case "Na" -> new Sodium(atoms);
            case "S" -> new Sulfur(atoms);
            default -> throw new ElementException("invalid element symbol");
        };
    }
}
