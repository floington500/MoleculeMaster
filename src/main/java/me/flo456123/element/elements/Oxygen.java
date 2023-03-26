package me.flo456123.element.elements;

import me.flo456123.element.Element;
import me.flo456123.element.ElementType;

public class Oxygen extends Element {

    public Oxygen(int atoms) {
        super(ElementType.COVALENT, (byte) 8, "O", 16.00, atoms);
    }

}