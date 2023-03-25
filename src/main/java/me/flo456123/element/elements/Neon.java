package me.flo456123.element.elements;

import me.flo456123.element.Element;
import me.flo456123.element.ElementType;

public class Neon extends Element {

    static {
        setElementType(ElementType.COVALENT);
        setElementSymbol("Ne");
        setAtomicMass(20.18);
        setAtomicNumber((byte) 10);
    }

    public Neon(int atoms) {
        super(atoms);
    }

}