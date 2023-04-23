package com.github.flo456123.common.element;

/**
 * The Element class represents an element in the periodic table.
 * It contains the number of atoms of the element and its ElementData object.
 *
 * @param data  the data of the element
 * @param atoms the number of atoms of the element
 */
public record Element(ElementData data, int atoms) {
    /**
     * Returns the hashcode for this {@link Element} object.
     *
     * @return an int representing the hash code for this {@link Element} object.
     */
    @Override
    public int hashCode() {
        int result = data.hashCode();
        result = 31 * result + atoms;
        return result;
    }
    /**
     * Equals method used for testing
     *
     * @param obj object to test
     * @return if objects are equal
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Element other = (Element) obj;

        return hashCode() == other.hashCode();
    }

    /**
     * Returns a string representation of this {@link Element} object.
     *
     * @return a string representation of this {@link Element} object
     */
    @Override
    public String toString() {
        return "Element{" +
                "data=" + data +
                ", atoms=" + atoms +
                '}';
    }
}
