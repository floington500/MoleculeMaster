package me.flo456123.element;

import me.flo456123.substance.SubstanceException;

public abstract class Element {
    private double      atomicMass;
    private int         atoms;
    private byte        atomicNumber;
    private ElementType elementType;
    private String      elementSymbol;

    /**
     * Constructor for an element - all parameters will be passed in by default except for atoms
     * @param atomicMass the grams/mole of the element
     * @param atomicNumber atomic number of the element
     * @param atoms the number of atoms in the element
     * @param elementType if element is ionic or covalent
     * @param elementSymbol symbol associated with the element
     */
    public Element(double atomicMass, byte atomicNumber, int atoms, ElementType elementType, String elementSymbol) {
        setAtomicMass(atomicMass);
        setAtomicNumber(atomicNumber);
        setAtoms(atoms);
        setElementType(elementType);
        setElementSymbol(elementSymbol);
    }

    public double getAtomicMass() {
        return atomicMass;
    }

    private void setAtomicMass(double mass) {
        atomicMass = mass;
    }

    public byte getAtomicNumber() {
        return atomicNumber;
    }

    private void setAtomicNumber(byte number) {
        if (number < 1 || number > 118) {
            throw new ElementException("invalid atomic number - atomic number has to be in the range of 1-122");
        }

        atomicNumber = number;
    }

    public int getAtoms() {
        return atoms;
    }

    private void setAtoms(int atoms) {
        if (atoms < 1) {
            throw new SubstanceException("atoms cannot be less than 1");
        }

        this.atoms = atoms;
    }

    public ElementType getElementType() {
        return elementType;
    }

    private void setElementType(ElementType type) {
        elementType = type;
    }

    public String getElementSymbol() {
        return elementSymbol;
    }

    private void setElementSymbol(String symbol) {
        if (symbol.length() > 2) {
            throw new ElementException("invalid element symbol - element symbol cannot be longer than two characters");
        }

        elementSymbol = symbol;
    }

    @Override
    public String toString() {
        return new StringBuilder("Atomic number: ")
                .append(getAtomicNumber())
                .append("\tElement symbol: ")
                .append(getElementSymbol())
                .append("\tAtomic mass: ")
                .append(getAtomicMass())
                .append("\tElement type: ")
                .append(getElementType())
                .append("\tAtoms: ")
                .append(getAtoms())
                .toString();
    }

}