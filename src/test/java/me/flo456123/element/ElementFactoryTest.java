package me.flo456123.element;

import me.flo456123.common.element.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElementFactoryTest {

    @Test
    public void equalElementTest1() {
        ElementInstance element1 = ElementFactory.createElement("H", 2);

        Element element = new Element("H", "Hydrogen", 1, 1.008, ElementType.COVALENT);
        ElementInstance element2 = new ElementInstance(element, 2);
        assertEquals(element1, element2);
    }

    @Test
    public void equalElementTest2() {
        ElementInstance element1 = ElementFactory.createElement("He", 1);

        Element element = new Element("He", "Helium", 2, 4.003, ElementType.INERT_GAS);
        ElementInstance element2 = new ElementInstance(element, 1);
        assertEquals(element1, element2);
    }

    @Test
    public void equalElementTest3() {
        ElementInstance element1 = ElementFactory.createElement("Li", 5);

        Element element = new Element("Li", "Lithium", 3, 6.94, ElementType.METALLIC);
        ElementInstance element2 = new ElementInstance(element, 5);
        assertEquals(element1, element2);
    }

    @Test
    public void notEqualsElementTest1() {
        ElementInstance element1 = ElementFactory.createElement("Na", 2);

        Element element = new Element("H", "Hydrogen", 1, 1.008, ElementType.COVALENT);
        ElementInstance element2 = new ElementInstance(element, 2);
        assertNotEquals(element1, element2);
    }

    @Test
    public void notEqualElementTest2() {
        ElementInstance element1 = ElementFactory.createElement("H", 1);

        Element element = new Element("He", "Helium", 2, 4.003, ElementType.INERT_GAS);
        ElementInstance element2 = new ElementInstance(element, 1);
        assertNotEquals(element1, element2);
    }

    @Test
    public void notEqualElementTest3() {
        ElementInstance element1 = ElementFactory.createElement("P", 5);

        Element element = new Element("Li", "Lithium", 3, 6.94, ElementType.METALLIC);
        ElementInstance element2 = new ElementInstance(element, 5);
        assertNotEquals(element1, element2);
    }

    @Test (expected = ElementException.class)
    public void invalidStringTest1() {
        ElementInstance element1 = ElementFactory.createElement("abc", 2);
    }

}