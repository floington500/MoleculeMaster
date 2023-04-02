package me.flo456123.common.substance.substances;

import me.flo456123.common.element.ElementInstance;
import me.flo456123.common.substance.Substance;

public class Molecule extends Substance {

    public Molecule(int n, ElementInstance element) {
        super(n, new ElementInstance[]{element});
    }

}