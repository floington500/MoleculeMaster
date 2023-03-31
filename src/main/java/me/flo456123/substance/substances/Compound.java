package me.flo456123.substance.substances;

import me.flo456123.element.ElementInstance;
import me.flo456123.substance.Substance;

public class Compound extends Substance {

    public Compound(int n, ElementInstance e1, ElementInstance e2) {
        super(n, new ElementInstance[]{e1, e2});
    }

}