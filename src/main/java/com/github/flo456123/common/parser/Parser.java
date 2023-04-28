package com.github.flo456123.common.parser;

import com.github.flo456123.common.element.Element;
import com.github.flo456123.common.element.ElementFactory;
import com.github.flo456123.common.types.Substance;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The Parser class provides functionality to parse a given substance string
 */
public class Parser {
    /**
     * Parses a given substance string
     * @param substanceString the substance string to parse, must follow
     *                        the principles of the interpreter
     * @return the substance object of the parsed string
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

    public static int findFirstNonDigitIndex(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) {
                return i;
            }
        }
        return -1;
    }

    public static int countElements(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
        return count;
    }

    public static int parseAtoms(String s) {
        int subscriptIndex = s.indexOf('_');
        if (subscriptIndex == -1) {
            return 1;
        }
        return Integer.parseInt(s.substring(subscriptIndex + 1));
    }
}
