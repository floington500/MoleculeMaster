package me.flo456123.substance;

import me.flo456123.element.Element;
import me.flo456123.utils.Unit;

import java.util.Arrays;
import java.util.stream.Stream;

abstract public class Substance
{
    private double n;
    private Element[] elements;

    /**
     * Stores a substance along with its number of moles
     * @param n number of moles
     * @param elements elements of the substance
     */
    protected Substance(double n, Element[] elements) {
        setElements(elements);
        setN(n);
    }

    public Element[] getElements() {
        return elements;
    }

    private void setElements(Element[] elements) {
        this.elements = elements;
    }

    public double getN() {
        return n;
    }

    private void setN(double n) {
        if (this.n < 0) {
            throw new SubstanceException("moles cannot be negative");
        }

        this.n = n;
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
                .append(n)
                .append("\n")
                .append("Element data: ")
                .append("\n");

        Stream.of(elements)
                .forEach(element -> sb.append(element)
                        .append("\n"));

        return sb.toString();
    }

}