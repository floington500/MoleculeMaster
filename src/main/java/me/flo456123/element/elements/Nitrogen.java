package me.flo456123.element.elements;

import me.flo456123.element.Element;
import me.flo456123.element.ElementType;

public class Nitrogen extends Element {

    public Nitrogen(int atoms) {
        super(atoms);
        setElementType(ElementType.COVALENT);
        setElementSymbol("N");
        setAtomicMass(14.01);
        setAtomicNumber((byte) 7);
    }

}