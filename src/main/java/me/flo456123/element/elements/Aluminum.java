package me.flo456123.element.elements;

import me.flo456123.element.ElementType;
import me.flo456123.element.Element;

public class Aluminum extends Element {

    public Aluminum(int atoms) {
        super(ElementType.IONIC, (byte) 13, "Al", 26.98, atoms);
    }

}