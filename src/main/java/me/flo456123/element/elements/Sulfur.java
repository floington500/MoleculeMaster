package me.flo456123.element.elements;

import me.flo456123.element.Element;
import me.flo456123.element.ElementType;

public class Sulfur extends Element {

    static {
        setElementType(ElementType.COVALENT);
        setElementSymbol("S");
        setAtomicMass(32.07);
        setAtomicNumber((byte) 16);
    }

    public Sulfur(int atoms) {
        super(atoms);
    }

}