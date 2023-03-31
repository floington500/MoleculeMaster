package me.flo456123.element;

public class ElementInstance extends Element {
    private final int atoms;

    public ElementInstance(Element element, int atoms) {
        super(element.getSymbol(), element.getName(), element.getAtomicNumber(), element.getAtomicMass(), element.getElementType());
        this.atoms = atoms;
    }

    public int getAtoms() {
        return atoms;
    }

    @Override
    public String toString() {
        return new StringBuilder(super.toString())
                .append("\tAtoms:")
                .append(atoms)
                .toString();
    }
}
