package me.flo456123.common.substance.substances;

import me.flo456123.common.element.Element;
import me.flo456123.common.substance.Substance;

/**
 * Represents a compound substance made up of two elements.
 */
public class Compound extends Substance {
    /**
     Creates a compound substance with the given number of moles and two elements

     @param n number of moles
     @param e1 first element of the compound
     @param e2 second element of the compound
     */
    public Compound(int n, Element e1, Element e2) {
        super(n, new Element[]{e1, e2});
    }
}
