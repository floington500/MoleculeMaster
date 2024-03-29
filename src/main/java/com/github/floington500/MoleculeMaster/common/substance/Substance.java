package com.github.floington500.MoleculeMaster.common.substance;

import com.github.floington500.MoleculeMaster.common.element.Element;

import java.util.Arrays;

/**
 * The {@link Substance} class represents a chemical substance that consists of a
 * number of elements and a number of moles.
 *
 * @param n the number of moles in the substance
 * @param elements the elements that make up the substance
 */
public record Substance(int n, Element... elements) {
    /**
     * Returns a string representation of this {@link Substance} object.
     *
     * @return a string representation of this {@link Substance} object
     */
    @Override
    public String toString() {
        return "Substance{" +
                "n=" + n +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}