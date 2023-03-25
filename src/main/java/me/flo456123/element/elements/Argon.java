package me.flo456123.element.elements;

import me.flo456123.element.Element;
import me.flo456123.element.ElementType;

public class Argon extends Element {

    static {
        setElementType(ElementType.COVALENT);
        setElementSymbol("Ar");
        setAtomicMass(39.95);
        setAtomicNumber((byte) 18);
    }

    public Argon(int atoms) {
        super(atoms);
    }

}