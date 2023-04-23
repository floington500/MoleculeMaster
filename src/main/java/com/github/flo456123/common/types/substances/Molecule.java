package com.github.flo456123.common.types.substances;

import com.github.flo456123.common.element.Element;
import com.github.flo456123.common.types.Substance;

/**
 * Represents a substance consisting of a single element in a molecule form
 */
public class Molecule extends Substance {
    /**
     Creates a molecule substance with the given number of moles and element

     @param n number of moles
     @param element the single element in the molecule
     */
    public Molecule(int n, Element element) {
        super(n, new Element[]{element});
    }
}
