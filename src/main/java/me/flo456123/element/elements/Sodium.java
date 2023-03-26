package me.flo456123.element.elements;

import me.flo456123.element.Element;
import me.flo456123.element.ElementType;

public class Sodium extends Element {

    public Sodium(int atoms) {
        super(atoms);
        setElementType(ElementType.IONIC);
        setElementSymbol("Na");
        setAtomicMass(22.99);
        setAtomicNumber((byte) 11);
    }

}