package me.flo456123.element.elements;

import me.flo456123.element.Element;
import me.flo456123.element.ElementType;

public class Silicon extends Element {

    public Silicon(int atoms) {
        super(ElementType.COVALENT, (byte) 14, "Si", 28.09, atoms);
    }

}