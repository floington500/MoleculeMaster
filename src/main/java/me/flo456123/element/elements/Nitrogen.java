package me.flo456123.element.elements;

import me.flo456123.element.Element;
import me.flo456123.element.ElementType;

public class Nitrogen extends Element {

    public Nitrogen(int atoms) {
        super(ElementType.COVALENT, (byte) 7, "N", 14.01, atoms);
    }

}