package me.flo456123.element.elements;

import me.flo456123.element.Element;
import me.flo456123.element.ElementType;

public class Hydrogen extends Element {

    public Hydrogen(int atoms) {
        super(ElementType.IONIC, (byte) 1, "H", 1.01, atoms);
    }

}