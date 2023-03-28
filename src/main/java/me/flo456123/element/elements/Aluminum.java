package me.flo456123.element.elements;

import me.flo456123.element.ElementType;
import me.flo456123.element.Element;

public class Aluminum extends Element {

    public Aluminum(int atoms) {
        super(26.98, (byte) 13, atoms, ElementType.IONIC, "Al");
    }

}