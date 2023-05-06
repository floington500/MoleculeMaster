package com.github.flo456123.common.element;

import com.github.flo456123.common.element.exceptions.ElementLoadingException;

/**
 * The ElementData class represents data about an element in the periodic table.
 */
public record ElementData (
        String symbol,
        String name,
        int atomicNumber,
        double atomicMass,
        ElementType elementType) {
    /**
     * Constructor that validates the atomic number and symbol of the element.
     *
     * @throws ElementLoadingException if the atomic number is not between 1 and 118, or if the symbol is longer than 2 characters
     */
    public ElementData {
        if (atomicNumber < 1 || atomicNumber > 118) {
            throw new ElementLoadingException("atomic number but be in the range of 1-118");
        }

        if (symbol.length() > 2) {
            throw new ElementLoadingException("element symbol cannot be longer than 2 characters");
        }

    }

    /**
     * Returns a string representation of this {@link ElementData} object.
     *
     * @return a string representation of this {@link ElementData} object
     */
    @Override
    public String toString() {
        return "ElementData {\n" +
                "    symbol = '" + symbol + "',\n" +
                "    name = '" + name + "',\n" +
                "    atomicNumber = " + atomicNumber + ",\n" +
                "    atomicMass = " + atomicMass + ",\n" +
                "    elementType = " + elementType + "\n" +
                "}";
    }
}
