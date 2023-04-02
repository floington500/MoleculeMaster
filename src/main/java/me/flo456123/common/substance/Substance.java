package me.flo456123.common.substance;

import me.flo456123.common.element.ElementInstance;

import java.util.Arrays;
import java.util.stream.Stream;

abstract public class Substance
{
    private final double n;
    private final ElementInstance[] elements;

    /**
     * Stores a substance along with its number of moles
     * @param n number of moles
     * @param elements elements of the substance
     */
    protected Substance(double n, ElementInstance[] elements) {
        this.n = n;
        this.elements = elements;
    }

    public ElementInstance[] getElements() {
        return elements;
    }

    public double getN() {
        return n;
    }

    /**
     * Get conversion factor
     * @param unit the unit to get the conversion factor for
     * @return the conversion factor that can be used to cancel out a unit
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Substance substance = (Substance) obj;

        return n == substance.getN() &&
                Arrays.equals(elements, substance.getElements());
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
