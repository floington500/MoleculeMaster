package me.flo456123.element.elements;

import me.flo456123.element.Element;
import me.flo456123.element.ElementType;

public class Helium extends Element {

    public Helium(int atoms) {
        super(atoms);
        setElementType(ElementType.COVALENT);
        setElementSymbol("He");
        setAtomicMass(4.00);
        setAtomicNumber((byte) 2);
    }

}