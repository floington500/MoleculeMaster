package me.flo456123.element.elements;

import me.flo456123.element.Element;
import me.flo456123.element.ElementType;

public class Hydrogen extends Element {

    public Hydrogen(int atoms) {
        super(1.01, (byte) 1, atoms, ElementType.IONIC, "H");
    }

}