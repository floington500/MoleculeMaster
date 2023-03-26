package me.flo456123.element.elements;

import me.flo456123.element.Element;
import me.flo456123.element.ElementType;

public class Carbon extends Element {

    public Carbon(int atoms) {
        super(atoms);
        setElementType(ElementType.COVALENT);
        setElementSymbol("C");
        setAtomicMass(12.01);
        setAtomicNumber((byte) 6);
    }

}