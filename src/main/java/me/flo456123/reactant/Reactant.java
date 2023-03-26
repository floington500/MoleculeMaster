package me.flo456123.reactant;

import me.flo456123.element.Element;

import java.util.Arrays;
import java.util.stream.Stream;

abstract public class Reactant
{
    private double nMoles;
    private Element[] elements;

    protected Reactant(double n, Element[] elements) {
        setElements(elements);
        setnMoles(n);
    }

    public Element[] getElements() {
        return elements;
    }

    private void setElements(Element[] elements) {
        this.elements = elements;
    }

    public double getnMoles() {
        return nMoles;
    }

    private void setnMoles(double n) {
        if (nMoles < 0) {
            throw new ReactantException("invalid number of moles - moles cannot be negatives");
        }

        nMoles = n;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Moles: ")
                .append(nMoles)
                .append("\n")
                .append("Element data: ")
                .append("\n");

        Stream.of(elements)
                .forEach(element -> sb.append(element)
                        .append("\n"));

        return sb.toString();
    }

}