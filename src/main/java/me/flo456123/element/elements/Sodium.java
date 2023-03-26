package me.flo456123.element.elements;

import me.flo456123.element.Element;
import me.flo456123.element.ElementType;

public class Sodium extends Element {

    public Sodium(int atoms) {
        super(ElementType.IONIC, (byte) 11, "Na", 22.99, atoms);
    }

}