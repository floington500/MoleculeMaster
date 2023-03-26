package me.flo456123.element.elements;

import me.flo456123.element.Element;
import me.flo456123.element.ElementType;

public class Helium extends Element {

    public Helium(int atoms) {
        super(ElementType.COVALENT, (byte) 2, "He", 4.00, atoms);
    }

}