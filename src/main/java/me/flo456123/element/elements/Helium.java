package me.flo456123.element.elements;

import me.flo456123.element.Element;
import me.flo456123.element.ElementType;

public class Helium extends Element {

    static {
        setElementType(ElementType.COVALENT);
        setElementSymbol("He");
        setAtomicMass(4.00);
        setAtomicNumber((byte) 2);
    }

    public Helium(int atoms) {
        super(atoms);
    }

}