package me.flo456123.element.elements;

import me.flo456123.element.Element;
import me.flo456123.element.ElementType;

public class Beryllium extends Element {

    static {
        setElementType(ElementType.IONIC);
        setElementSymbol("Be");
        setAtomicMass(9.01);
        setAtomicNumber((byte) 4);
    }

    public Beryllium(int atoms) {
        super(atoms);
    }

}