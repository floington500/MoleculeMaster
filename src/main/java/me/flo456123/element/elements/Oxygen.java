package me.flo456123.element.elements;

import me.flo456123.element.Element;
import me.flo456123.element.ElementType;

public class Oxygen extends Element {

    static {
        setElementType(ElementType.COVALENT);
        setElementSymbol("O");
        setAtomicMass(16.00);
        setAtomicNumber((byte) 8);
    }

    public Oxygen(int atoms) {
        super(atoms);
    }

}