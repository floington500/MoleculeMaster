package me.flo456123.element.elements;

import me.flo456123.element.Element;
import me.flo456123.element.ElementType;

public class Argon extends Element {

    public Argon(int atoms) {
        super(ElementType.COVALENT, (byte) 18, "Ar", 39.95, atoms);
    }

}