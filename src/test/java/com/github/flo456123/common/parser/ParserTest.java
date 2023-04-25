package com.github.flo456123.common.parser;

import com.github.flo456123.common.element.Element;
import com.github.flo456123.common.element.ElementFactory;
import com.github.flo456123.common.types.Substance;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParserTest {

    @Test
    public void validSubstanceTest1() {
        Substance test = Parser.parseSubstanceString("2HCl");

        Element elementReactant1 = ElementFactory.createElement("H", 1);
        Element elementReactant2 = ElementFactory.createElement("Cl", 1);
        Substance expected = new Substance(2, elementReactant1, elementReactant2);

        assertEquals(test, expected);
    }

    @Test
    public void validSubstanceTest2() {
        Substance test = Parser.parseSubstanceString("2NaCl_2");

        Element elementReactant1 = ElementFactory.createElement("Na", 1);
        Element elementReactant2 = ElementFactory.createElement("Cl", 2);
        Substance expected = new Substance(2, elementReactant1, elementReactant2);

        assertEquals(test, expected);
    }

    @Test
    public void validSubstanceTest3() {
        Substance test = Parser.parseSubstanceString("HS_4");

        Element elementProduct3 = ElementFactory.createElement("H", 1);
        Element elementProduct4 = ElementFactory.createElement("S", 4);
        Substance expected = new Substance(1, elementProduct3, elementProduct4);

        assertEquals(test, expected);
    }

}