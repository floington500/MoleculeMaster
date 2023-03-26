package me.flo456123.substance.substances;

import me.flo456123.element.Element;
import me.flo456123.substance.Substance;

public class Molecule extends Substance {

    public Molecule(int n, Element element) {
        super(n, new Element[]{element});
    }

}