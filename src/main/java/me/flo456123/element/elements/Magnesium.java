package me.flo456123.element.elements;

import me.flo456123.element.Element;
import me.flo456123.element.ElementType;

public class Magnesium extends Element {

    static {
        setElementType(ElementType.IONIC);
        setElementSymbol("Mg");
        setAtomicMass(24.31);
        setAtomicNumber((byte) 12);
    }

    public Magnesium(int atoms) {
        super(atoms);
    }

}