package com.github.flo456123.common.types;

import com.github.flo456123.common.element.Element;

import java.util.Arrays;

/**
 * This class represents a substance with a given number of moles and elements.
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
