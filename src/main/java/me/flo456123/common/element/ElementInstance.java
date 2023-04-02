package me.flo456123.common.element;

public class ElementInstance extends Element {
    private final int atoms;

    public ElementInstance(Element element, int atoms) {
        super(element.getSymbol(), element.getName(), element.getAtomicNumber(), element.getAtomicMass(), element.getElementType());
        this.atoms = atoms;
    }

    public int getAtoms() {
        return atoms;
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
        ElementInstance element = (ElementInstance) obj;

        return atoms == element.getAtoms() &&
                super.equals(obj);
     }

    @Override
    public String toString() {
        return new StringBuilder(super.toString())
                .append("\tAtoms:")
                .append(atoms)
                .toString();
    }
}
