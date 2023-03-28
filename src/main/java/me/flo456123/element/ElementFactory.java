package me.flo456123.element;

import me.flo456123.element.elements.*;

public class ElementFactory {
    public static Element createElement(String symbol, int atoms) {
        if (symbol.length() > 2 || symbol.length() < 1) {
            throw new ElementException("invalid symbol - element symbol must be two characters");
        }

        return switch (symbol) {
            case "Al" -> new Aluminum();
            case "Ar" -> new Argon();
            case "Be" -> new Beryllium();
            case "B" -> new Boron();
            case "C" -> new Carbon();
            case "Cl" -> new Chlorine();
            case "F" -> new Fluorine();
            case "He" -> new Helium();
            case "H" -> new Hydrogen();
            case "Li" -> new Lithium();
            case "Mg" -> new Magnesium();
            case "Ne" -> new Neon();
            case "N" -> new Nitrogen();
            case "O" -> new Oxygen();
            case "P" -> new Phosphorus();
            case "Si" -> new Silicon();
            case "Na" -> new Sodium();
            case "S" -> new Sulfur();
            default -> throw new ElementException("invalid element symbol");
        };
    }
}
