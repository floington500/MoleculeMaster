package me.flo456123.substance.substances;

import me.flo456123.element.ElementInstance;
import me.flo456123.substance.Substance;

public class Molecule extends Substance {

    public Molecule(int n, ElementInstance element) {
        super(n, new ElementInstance[]{element});
    }

}