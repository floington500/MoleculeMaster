package me.flo456123.element.elements;

import me.flo456123.element.Element;
import me.flo456123.element.ElementType;

public class Chlorine extends Element {

    static {
        setElementType(ElementType.COVALENT);
        setElementSymbol("Cl");
        setAtomicMass(35.45);
        setAtomicNumber((byte) 17);
    }

    public Chlorine(int atoms) {
        super(atoms);
    }

}