package me.flo456123.common.element;

public class Element {
    private final int atoms;
    public final ElementData data;

    public Element(ElementData data, int atoms) {
        this.atoms = atoms;
        this.data = data;
    }

    public int getAtoms() {
        return atoms;
    }

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

    @Override
    public String toString() {
        return super.toString() +
                "\tAtoms:" +
                atoms;
    }
}
