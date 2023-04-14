package me.flo456123.common.substance;

import me.flo456123.common.element.Element;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * This abstract class represents a substance with a given number of moles and elements.
 */
abstract public class Substance
{
    private final double n;
    private final Element[] elements;

    /**
     * Constructs a new {@link Substance} object with the given number of moles and elements.
     *
     * @param n        the number of moles
     * @param elements the elements of the substance
     */
    protected Substance(double n, Element[] elements) {
        this.n = n;
        this.elements = elements;
    }

    public Element[] getElements() {
        return elements;
    }

    public double getN() {
        return n;
    }

    /**
     * Returns the conversion factor for the given unit.
     *
     * @param unit the {@link Unit} for which to retrieve the conversion factor
     * @return a double representing the conversion factor for the given unit
     */
    public double getConversionFactor(Unit unit) {
        return switch (unit) {
            case ATOMS, MOLECULES, PARTICLES -> 6.02 * Math.pow(10, 23);
            case MOLES -> 1;
            case LITERS -> 22.4;
            case GRAMS -> Arrays.stream(getElements())
                    .mapToDouble(element -> element.atoms() * element.data().atomicMass())
                    .sum();
        };
    }

    /**
     * Returns the hash code for this Substance object.
     *
     * @return an int representing the hash code for this Substance object
     */
    @Override
    public int hashCode() {
        int result = 17;
        long nBits = Double.doubleToLongBits(n);
        result = 31 * result + (int) (nBits ^ (nBits >>> 32));
        result = 31 * result + Arrays.hashCode(elements);
        return result;
    }

    /**
     * Returns true if this {@link Substance} object is equal to the specified object.
     *
     * @param obj the object to compare this Substance object against
     * @return true if this {@link Substance} object is equal to the specified object, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Substance other = (Substance) obj;

        return hashCode() == other.hashCode();
    }

    /**
     * Returns a string representation of this {@link Substance} object.
     *
     * @return a string representation of this {@link Substance} object
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Moles: ")
                .append(n)
                .append("\n")
                .append("ElementData data: ")
                .append("\n");

        Stream.of(elements)
                .forEach(element -> sb.append(element)
                        .append("\n"));

        return sb.toString();
    }
}
