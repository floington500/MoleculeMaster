package me.flo456123.substance.substances;

import me.flo456123.element.Element;
import me.flo456123.substance.Substance;

public class Compound extends Substance {

    public Compound(int n, Element e1, Element e2) {
        super(n, new Element[]{e1, e2});
    }

}