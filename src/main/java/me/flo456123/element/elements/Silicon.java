package me.flo456123.element.elements;

import me.flo456123.element.Element;
import me.flo456123.element.ElementType;

public class Silicon extends Element {

    static {
        setElementType(ElementType.COVALENT);
        setElementSymbol("Si");
        setAtomicMass(28.09);
        setAtomicNumber((byte) 14);
    }

    public Silicon(int atoms) {
        super(atoms);
    }

}