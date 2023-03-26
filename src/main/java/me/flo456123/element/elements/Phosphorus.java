package me.flo456123.element.elements;

import me.flo456123.element.Element;
import me.flo456123.element.ElementType;

public class Phosphorus extends Element {

    public Phosphorus(int atoms) {
        super(atoms);
        setElementType(ElementType.COVALENT);
        setElementSymbol("P");
        setAtomicMass(30.97);
        setAtomicNumber((byte) 15);
    }

}