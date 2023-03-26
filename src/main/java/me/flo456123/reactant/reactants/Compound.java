package me.flo456123.reactant.reactants;

import me.flo456123.element.Element;
import me.flo456123.reactant.Reactant;

public class Compound extends Reactant {

    public Compound(int n, Element e1, Element e2) {
        super(n, new Element[]{e1, e2});
    }

}