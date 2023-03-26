package me.flo456123.utils;

import me.flo456123.element.Element;
import me.flo456123.element.ElementFactory;
import me.flo456123.reactant.reactants.Compound;
import me.flo456123.reactant.reactants.Molecule;
import me.flo456123.reactant.Reactant;

import java.util.List;
import java.util.stream.Stream;

public class Parser {
    /**
     * parses a given substance string and returns a substance
     * @param substanceString the substance string to parse
     * @return the substance object
     */
    public static Reactant parseSubstanceString(String substanceString) {
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

            return new Compound(moles, elements1.get(0), elements1.get(1));
        }
        else {
            String elementString = substanceString.split("_")[0];
            int atoms = parseAtoms(substanceString);
            Element element = ElementFactory.createElement(elementString, atoms);
            return new Molecule(moles, element);
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