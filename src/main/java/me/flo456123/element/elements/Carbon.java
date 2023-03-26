package me.flo456123.element.elements;

import me.flo456123.element.Element;
import me.flo456123.element.ElementType;

public class Carbon extends Element {

    public Carbon(int atoms) {
        super(ElementType.COVALENT, (byte) 6, "C", 12.01, atoms);
    }

}