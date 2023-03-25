package me.flo456123.element;

public abstract class Element {
    private static ElementType elementType;
    private static byte        atomicNumber;
    private static String      elementSymbol;
    private static double      atomicMass;
    private int                atoms;

    public Element(int atoms) {
        this.setAtoms(atoms);
    }

    public int getAtoms() {
        return atoms;
    }

    protected void setAtoms(int atoms) {
        this.atoms = atoms;
    }

    public ElementType getElementType() {
        return elementType;
    }

    protected static void setElementType(ElementType type) {
        elementType = type;
    }

    public byte getAtomicNumber() {
        return atomicNumber;
    }

    protected static void setAtomicNumber(byte number) {
        if (number < 1 || number > 118) {
            throw new ElementException("invalid atomic number - atomic number has to be in the range of 1-122");
        }

        atomicNumber = number;
    }

    public String getElementSymbol() {
        return elementSymbol;
    }

    protected static void setElementSymbol(String symbol) {
        if (symbol.length() > 2) {
            throw new ElementException("invalid element symbol - element symbol cannot be longer than two characters");
        }

        elementSymbol = symbol;
    }

    public double getAtomicMass() {
        return atomicMass;
    }

    protected static void setAtomicMass(double mass) {
        atomicMass = mass;
    }

    @Override
    public String toString() {
        return new StringBuilder(getElementSymbol() + " ")
                .append(getAtoms())
                .append(" ")
                .append(getAtomicMass())
                .append(" ")
                .append(getElementType())
                .append(" ")
                .append(getAtomicNumber())
                .append(" ")
                .append(getAtomicMass())
                .toString();
    }

}