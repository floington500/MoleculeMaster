package me.flo456123.reactant.reactants;

import me.flo456123.element.Element;
import me.flo456123.reactant.Reactant;

public class Molecule extends Reactant {

    public Molecule(int n, Element element) {
        super(n, new Element[]{element});
    }

}