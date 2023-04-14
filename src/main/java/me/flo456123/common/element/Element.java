package me.flo456123.common.element;

/**
 * The Element class represents an element in the periodic table.
 * It contains the number of atoms of the element and its ElementData object.
 */
public class Element {
    private final int atoms;
    public final ElementData data;

    /**
     * Constructor that sets the number of atoms and the element data.
     *
     * @param data the data of the element
     * @param atoms the number of atoms of the element
     */
    public Element(ElementData data, int atoms) {
        this.atoms = atoms;
        this.data = data;
    }

    public int getAtoms() {
        return atoms;
    }

    /**
     * Returns the hash code for this Substance object.
     *
     * @return an int representing the hash code for this Substance object
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + atoms;
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        return result;
    }

    /**
     * Equals method used for testing
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
        return data.toString() +
                "\tAtoms:" +
                atoms;
    }
}
