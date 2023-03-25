package me.flo456123.element.elements;

import me.flo456123.element.Element;
import me.flo456123.element.ElementType;

public class Fluorine extends Element {

    static {
        setElementType(ElementType.COVALENT);
        setElementSymbol("F");
        setAtomicMass(19.00);
        setAtomicNumber((byte) 9);
    }

    public Fluorine(int atoms) {
        super(atoms);
    }

}