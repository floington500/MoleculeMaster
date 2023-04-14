package me.flo456123.element;

import me.flo456123.common.element.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElementFactoryTest {

    @Test
    public void equalElementTest1() {
        Element element1 = ElementFactory.createElement("H", 2);

        ElementData element = new ElementData("H", "Hydrogen", 1, 1.008, ElementType.COVALENT);
        Element element2 = new Element(element, 2);
        assertEquals(element1, element2);
    }

    @Test
    public void equalElementTest2() {
        Element element1 = ElementFactory.createElement("He", 1);

        ElementData element = new ElementData("He", "Helium", 2, 4.003, ElementType.INERT_GAS);
        Element element2 = new Element(element, 1);
        assertEquals(element1, element2);
    }

    @Test
    public void equalElementTest3() {
        Element element1 = ElementFactory.createElement("Li", 5);

        ElementData element = new ElementData("Li", "Lithium", 3, 6.94, ElementType.METALLIC);
        Element element2 = new Element(element, 5);
        assertEquals(element1, element2);
    }

    @Test
    public void notEqualsElementTest1() {
        Element element1 = ElementFactory.createElement("Na", 2);

        ElementData element = new ElementData("H", "Hydrogen", 1, 1.008, ElementType.COVALENT);
        Element element2 = new Element(element, 2);
        assertNotEquals(element1, element2);
    }

    @Test
    public void notEqualElementTest2() {
        Element element1 = ElementFactory.createElement("H", 1);

        ElementData element = new ElementData("He", "Helium", 2, 4.003, ElementType.INERT_GAS);
        Element element2 = new Element(element, 1);
        assertNotEquals(element1, element2);
    }

    @Test
    public void notEqualElementTest3() {
        Element element1 = ElementFactory.createElement("P", 5);

        ElementData element = new ElementData("Li", "Lithium", 3, 6.94, ElementType.METALLIC);
        Element element2 = new Element(element, 5);
        assertNotEquals(element1, element2);
    }

    @Test (expected = ElementException.class)
    public void invalidStringTest1() {
        Element element1 = ElementFactory.createElement("abc", 2);
    }

}