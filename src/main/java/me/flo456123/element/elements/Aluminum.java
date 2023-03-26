package me.flo456123.element.elements;

import me.flo456123.element.ElementType;
import me.flo456123.element.Element;

public class Aluminum extends Element {

    public Aluminum(int atoms) {
        super(atoms);
        setElementType(ElementType.IONIC);
        setElementSymbol("Al");
        setAtomicMass(26.98);
        setAtomicNumber((byte) 13);
    }

}