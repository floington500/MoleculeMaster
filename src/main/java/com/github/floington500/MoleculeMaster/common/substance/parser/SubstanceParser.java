package com.github.floington500.MoleculeMaster.common.substance.parser;

import com.github.floington500.MoleculeMaster.common.element.Element;
import com.github.floington500.MoleculeMaster.common.element.ElementFactory;
import com.github.floington500.MoleculeMaster.common.element.exceptions.UnsupportedElementException;
import com.github.floington500.MoleculeMaster.common.substance.Substance;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The Parser class provides the base functionality for parsing substance
 * strings into a {@link Substance} object. A substance string has the
 * following format:
 * <p>
 *     {@code [moles] [element]_[atoms] [element2]_[atoms2]...}
 * </p>
 *
 * <p>
 *     The integer seen before a substance is interpreted as the number of moles.
 *     An integer after an underscore is interpreted as the number of atoms for a
 *     corresponding element. If no number of atoms or moles are specified, they
 *     will by default be parsed to one.
 * </p>
 *
 * <p>
 *     Example substance string: {@code 2H_2O}
 * </p>
 */
public class SubstanceParser {
    /**
     * Main function used to parse substance strings into {@link Substance}
     * objects.
     *
     * @param substanceString the substance string to parse, must follow
     *                        the principles of the interpreter
     * @return the {@link Substance} object of the parsed string
     * @throws UnsupportedElementException if there is a formatting issue
     * with the given substance string
     */
    public static Substance parseSubstanceString(String substanceString) {
        int moles = 1;

        int firstNonDigitIndex = findFirstNonDigitIndex(substanceString);
        if (firstNonDigitIndex > 0) {
            moles = Integer.parseInt(substanceString.substring(0, firstNonDigitIndex));
            substanceString = substanceString.substring(firstNonDigitIndex);
        }

        final int numElements = countElements(substanceString);
        Element[] elements = new Element[numElements];

        Pattern elementPattern = Pattern.compile("([A-Z][a-z]*)(?:_(\\d+))?");
        Matcher matcher = elementPattern.matcher(substanceString);
        int elementIndex = 0;
        while (matcher.find()) {
            String elementString = matcher.group(1);
            int atoms = matcher.group(2) == null ? 1 : Integer.parseInt(matcher.group(2));
            elements[elementIndex++] = ElementFactory.createElement(elementString, atoms);
        }

        return new Substance(moles, elements);
    }

    /**
     * Searches for the first non-digit character in a given string.
     *
     * @param s the string to search from
     * @return the index of the first non-digit index, or -1 if nothing is found
     */
    public static int findFirstNonDigitIndex(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Counts the number of elements for a given substance string.
     *
     * @param s the substance string to count from
     * @return the number of elements in the substance string
     */
    public static int countElements(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Parses the number of atoms in a substance string.
     *
     * @param s the element string to parse
     * @return the number of atoms in an element string,
     * or 1 if no atoms are specified
     */
    public static int parseAtoms(String s) {
        int subscriptIndex = s.indexOf('_');
        if (subscriptIndex == -1) {
            return 1;
        }
        return Integer.parseInt(s.substring(subscriptIndex + 1));
    }
}