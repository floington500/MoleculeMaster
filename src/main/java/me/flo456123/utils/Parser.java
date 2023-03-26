package me.flo456123.utils;

import me.flo456123.element.Element;
import me.flo456123.element.ElementFactory;
import me.flo456123.substance.Substance;
import me.flo456123.substance.Unit;
import me.flo456123.reactant.Compound;
import me.flo456123.reactant.Molecule;

import java.util.List;
import java.util.stream.Stream;

public class Parser {
    /**
     * parses a given substance string and returns a substance
     * @param substanceString the substance string to parse
     * @return the substance object
     */
    public static Substance parseSubstanceString(String substanceString) {
        if (substanceString.isEmpty()) {
            throw new IllegalArgumentException("substance string cannot be empty");
        }

        int moles = 1;
        if (Character.isDigit(substanceString.charAt(0))) {
            moles = Integer.parseInt(substanceString.substring(0, 1));
            substanceString = substanceString.substring(1);
        }

        if (isCompound(substanceString)) {
            String[] elements = splitCompound(substanceString);
            List<Element> elements1 = Stream.of(elements)
                    .map(element -> {
                        String elementString = element.split("_")[0];
                        int atoms = parseAtoms(element);
                        return ElementFactory.createElement(elementString, atoms);
                    })
                    .toList();

            return new Substance(moles, new Compound(elements1.get(0), elements1.get(1)), Unit.GRAMS);
        }
        else {
            String elementString = substanceString.split("_")[0];
            int atoms = parseAtoms(substanceString);
            Element element = ElementFactory.createElement(elementString, atoms);
            return new Substance(moles, new Molecule(element), Unit.GRAMS);
        }

    }

    /**
     * returns if the given string represents a compound
     * @param str the string to check
     * @return true if the string represents a compound
     */
    public static boolean isCompound(String str) {
        return str.matches("^(?=.*[A-Z].*[A-Z]).+$");
    }

    /**
     * splits a compound string into an array of element strings
     * @param s the compound string to split
     * @return the array of element strings
     */
    public static String[] splitCompound(String s) {
        return s.split("(?=[A-Z])");
    }

    /**
     * returns the number of atoms in the given element or compound string
     * @param s the element or compound string
     * @return the number of atoms
     */
    private static int parseAtoms(String s) {
        try {
            return Integer.parseInt(s.substring(s.length() - 1));
        } catch (NumberFormatException e) {
            return 1;
        }
    }

}