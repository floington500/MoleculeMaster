package me.flo456123.element.elements;

import me.flo456123.element.Element;
import me.flo456123.element.ElementType;

public class Sulfur extends Element {

    public Sulfur(int atoms) {
        super(atoms);
        setElementType(ElementType.COVALENT);
        setElementSymbol("S");
        setAtomicMass(32.07);
        setAtomicNumber((byte) 16);
    }

}