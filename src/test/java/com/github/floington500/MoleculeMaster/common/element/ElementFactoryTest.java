package com.github.floington500.MoleculeMaster.common.element;

import com.github.floington500.MoleculeMaster.common.element.exceptions.UnsupportedElementException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ElementFactoryTest {

    @Test
    public void equalElementTest1() {
        ElementData element = new ElementData("H", "Hydrogen", 1, 1.008, ElementType.COVALENT);
        Element expected = new Element(element, 2);

        Element actual = ElementFactory.createElement("H", 2);

        assertEquals(actual, expected);
    }

    @Test
    public void equalElementTest2() {
        ElementData element = new ElementData("He", "Helium", 2, 4.003, ElementType.COVALENT);
        Element expected = new Element(element, 1);

        Element actual = ElementFactory.createElement("He", 1);

        assertEquals(actual, expected);
    }

    @Test
    public void equalElementTest3() {
        ElementData element = new ElementData("Li", "Lithium", 3, 6.94, ElementType.IONIC);
        Element expected = new Element(element, 5);

        Element actual = ElementFactory.createElement("Li", 5);

        assertEquals(actual, expected);
    }

    @Test
    public void notEqualsElementTest1() {
        ElementData element = new ElementData("H", "Hydrogen", 1, 1.008, ElementType.COVALENT);
        Element expected = new Element(element, 2);

        Element actual = ElementFactory.createElement("Na", 2);

        assertNotEquals(actual, expected);
    }

    @Test
    public void notEqualElementTest2() {
        ElementData element = new ElementData("He", "Helium", 2, 4.003, ElementType.COVALENT);
        Element expected = new Element(element, 1);

        Element actual = ElementFactory.createElement("H", 1);

        assertNotEquals(actual, expected);
    }

    @Test
    public void notEqualElementTest3() {
        ElementData element = new ElementData("Li", "Lithium", 3, 6.94, ElementType.IONIC);
        Element expected = new Element(element, 5);

        Element actual = ElementFactory.createElement("P", 5);

        assertNotEquals(actual, expected);
    }

    @Test
    public void invalidStringTest1() {
        assertThrows(UnsupportedElementException.class, () -> ElementFactory.createElement("abc", 123));
    }

}