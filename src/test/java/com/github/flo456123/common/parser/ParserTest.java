package com.github.flo456123.common.parser;

import com.github.flo456123.common.element.Element;
import com.github.flo456123.common.element.ElementFactory;
import com.github.flo456123.common.types.Substance;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParserTest {

    @Test
    public void validSubstanceTest1() {
        Element elementReactant1 = ElementFactory.createElement("H", 1);
        Element elementReactant2 = ElementFactory.createElement("Cl", 1);
        Substance expected = new Substance(2, elementReactant1, elementReactant2);

        Substance actual = Parser.parseSubstanceString("2HCl");

        assertEquals(expected.n(), actual.n());
        assertArrayEquals(expected.elements(), actual.elements());
    }

    @Test
    public void validSubstanceTest2() {
        Element elementReactant1 = ElementFactory.createElement("Na", 1);
        Element elementReactant2 = ElementFactory.createElement("Cl", 2);
        Substance expected = new Substance(2, elementReactant1, elementReactant2);

        Substance actual = Parser.parseSubstanceString("2NaCl_2");

        assertEquals(expected.n(), actual.n());
        assertArrayEquals(expected.elements(), actual.elements());
    }

    @Test
    public void validSubstanceTest3() {
        Element elementProduct3 = ElementFactory.createElement("H", 1);
        Element elementProduct4 = ElementFactory.createElement("S", 4);
        Substance expected = new Substance(1, elementProduct3, elementProduct4);

        Substance actual = Parser.parseSubstanceString("HS_4");

        assertEquals(expected.n(), actual.n());
        assertArrayEquals(expected.elements(), actual.elements());
    }

    // Count element tests
    @Test
    public void countElementTest1() {
        int expected = 3;

        String elementString = "HClO_3";
        int actual = Parser.countElements(elementString);

        assertEquals(expected, actual);
    }

    @Test
    public void countElementTest2() {
        int expected = 2;

        String elementString = "HCl";
        int actual = Parser.countElements(elementString);

        assertEquals(expected, actual);
    }

    @Test
    public void countElementTest3() {
        int expected = 2;

        String elementString = "H_2O";
        int actual = Parser.countElements(elementString);

        assertEquals(expected, actual);
    }

    @Test
    public void countInvalidElementTest1() {
        int expected = 0;

        String elementString = "";
        int actual = Parser.countElements(elementString);

        assertEquals(expected, actual);
    }

    @Test
    public void parseAtomsTest1() {
        int expected = 2;

        String elementString = "H_2";
        int actual = Parser.parseAtoms(elementString);

        assertEquals(expected, actual);
    }

    @Test
    public void parseAtomsTest2() {
        int expected = 5;

        String elementString = "Na_5";
        int actual = Parser.parseAtoms(elementString);

        assertEquals(expected, actual);
    }

    @Test
    public void parseAtomsTest3() {
        int expected = 7;

        String elementString = "Cl_7";
        int actual = Parser.parseAtoms(elementString);

        assertEquals(actual, expected);
    }

    final int notFound = 1;

    @Test
    public void parseInvalidElementTest1() {
        String elementString = "Cl";
        int actual = Parser.parseAtoms(elementString);
        assertEquals(notFound, actual);
    }

    @Test
    public void parseInvalidElementTest2() {
        String elementString = "Al";
        int actual = Parser.parseAtoms(elementString);
        assertEquals(notFound, actual);
    }

}