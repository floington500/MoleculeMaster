package me.flo456123.element.elements;

import me.flo456123.element.Element;
import me.flo456123.element.ElementType;

public class Boron extends Element {

    static {
        setElementType(ElementType.COVALENT);
        setElementSymbol("B");
        setAtomicMass(10.81);
        setAtomicNumber((byte) 5);
    }

    public Boron(int atoms) {
        super(atoms);
    }

}