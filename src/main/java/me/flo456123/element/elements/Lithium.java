package me.flo456123.element.elements;

import me.flo456123.element.Element;
import me.flo456123.element.ElementType;

public class Lithium extends Element {

    static {
        setElementType(ElementType.IONIC);
        setElementSymbol("Li");
        setAtomicMass(6.94);
        setAtomicNumber((byte) 3);
    }

    public Lithium(int atoms) {
        super(atoms);
    }

}