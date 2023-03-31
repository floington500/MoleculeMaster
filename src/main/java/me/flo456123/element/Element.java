package me.flo456123.element;

public class Element {
    private final String symbol;
    private final String name;
    private final int atomicNumber;
    private final double atomicMass;
    private final ElementType elementType;

    public Element(String symbol, String name, int atomicNumber, double atomicMass, ElementType elementType) {
        if (atomicNumber < 1 || atomicNumber > 118) {
            throw new ElementException("invalid atomic number - atomic number has to be in the range of 1-122");
        }

        if (symbol.length() > 2) {
            throw new ElementException("invalid element symbol - element symbol cannot be longer than two characters");
        }

        this.symbol = symbol;
        this.name = name;
        this.atomicNumber = atomicNumber;
        this.atomicMass = atomicMass;
        this.elementType = elementType;
    }

    public double getAtomicMass() {
        return atomicMass;
    }

    public String getName() {
        return name;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public ElementType getElementType() {
        return elementType;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return new StringBuilder("Atomic number: ")
                .append(getAtomicNumber())
                .append("\tElement symbol: ")
                .append(getSymbol())
                .append("\tAtomic mass: ")
                .append(getAtomicMass())
                .append("\tElement type: ")
                .append(getElementType())
                .toString();
    }

}