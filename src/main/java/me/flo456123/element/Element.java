package me.flo456123.element;

public abstract class Element {
    private ElementType elementType;
    private byte        atomicNumber;
    private String      elementSymbol;
    private double      atomicMass;
    private int         atoms;

    public Element(ElementType type, byte atomicNumber, String symbol, double mass, int atoms) {
        setElementType(type);
        setAtomicNumber(atomicNumber);
        setElementSymbol(symbol);
        setAtomicMass(mass);
        setAtoms(atoms);
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

    protected void setElementType(ElementType type) {
        elementType = type;
    }

    public byte getAtomicNumber() {
        return atomicNumber;
    }

    protected void setAtomicNumber(byte number) {
        if (number < 1 || number > 118) {
            throw new ElementException("invalid atomic number - atomic number has to be in the range of 1-122");
        }

        atomicNumber = number;
    }

    public String getElementSymbol() {
        return elementSymbol;
    }

    protected void setElementSymbol(String symbol) {
        if (symbol.length() > 2) {
            throw new ElementException("invalid element symbol - element symbol cannot be longer than two characters");
        }

        elementSymbol = symbol;
    }

    public double getAtomicMass() {
        return atomicMass;
    }

    protected void setAtomicMass(double mass) {
        atomicMass = mass;
    }

    @Override
    public String toString() {
        return new StringBuilder(getElementType() + " ")
                .append(getAtomicNumber())
                .append(" ")
                .append(getElementSymbol())
                .append(" ")
                .append(getAtomicMass())
                .append(" ")
                .append(getAtoms())
                .toString();
    }

}