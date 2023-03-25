package me.flo456123.element.elements;

import me.flo456123.element.Element;
import me.flo456123.element.ElementType;

public class Hydrogen extends Element {

    static {
        setElementType(ElementType.IONIC);
        setElementSymbol("H");
        setAtomicMass(1.01);
        setAtomicNumber((byte) 1);
    }

    public Hydrogen(int atoms) {
        super(atoms);
    }

}