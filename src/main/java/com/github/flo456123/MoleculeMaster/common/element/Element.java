package com.github.flo456123.MoleculeMaster.common.element;

import com.github.flo456123.MoleculeMaster.common.element.exceptions.ElementLoadingException;

/**
 * The Element class represents an element in the
 * periodic table. It contains the number of atoms
 * of the element and its {@link ElementData} object.
 *
 * @param data  the element data of the element
 * @param atoms the number of atoms of the element
 */
public record Element(ElementData data, int atoms) {
    /**
     * Constructor that validates that there are a valid number of atoms
     * passed in.
     *
     * @throws ElementLoadingException if the number of atoms are <= 0
     */
    public Element {
        if (atoms <= 0) {
            throw new ElementLoadingException("number of atoms cannot be <= 0");
        }

    }

    /**
     * Returns a string representation of this {@link Element} object.
     *
     * @return a string representation of this {@link Element} object
     */
    @Override
    public String toString() {
        return "Element {\n" +
                "    data = " + data.toString().replace("\n", "\n    ") + ",\n" +
                "    atoms = " + atoms + "\n" +
                "}";
    }
}
