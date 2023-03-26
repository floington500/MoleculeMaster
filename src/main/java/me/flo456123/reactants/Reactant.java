package me.flo456123.substance.reactants;

import me.flo456123.element.Element;
import me.flo456123.substance.Unit;

import java.util.Arrays;

abstract public class Reactant
{
    protected Element[] elements;

    public Element[] getElements() {
        return elements;
    }

    /**
     * Pass in the unit to get the conversion factor for
     * @param unit what unit you want to get the conversion factor for
     * @return conversion factor of the Compound
     */
    public double getConversionFactor(Unit unit) {
        return switch (unit) {
            case ATOMS, MOLECULES, PARTICLES -> 6.02 * Math.pow(10, 23);
            case MOLES -> 1;
            case LITERS -> 22.4;
            case GRAMS -> Arrays.stream(getElements())
                    .mapToDouble(element -> element.getAtoms() * element.getAtomicMass())
                    .sum();
        };
    }

}