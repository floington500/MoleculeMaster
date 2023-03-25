package me.flo456123.element;

import me.flo456123.element.elements.Chlorine;
import me.flo456123.element.elements.Sodium;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class ElementFactoryTest {

    @Test
    public void validElementFactoryTest1() {
        Element e1 = ElementFactory.createElement("Na", 5);
        Element e2 = new Sodium(5);
        // im just going to compare the element symbols because i
        // dont feel like creating my own Object::equals method in
        // the element class xD
        assertEquals(e1.getElementSymbol(), e2.getElementSymbol());
    }

    @Test
    public void validElementFactoryTest2() {
        Element e1 = ElementFactory.createElement("Cl", 2);
        Element e2 = new Chlorine(2);
        assertEquals(e1.getElementSymbol(), e2.getElementSymbol());
    }

    @Test
    public void invalidElementFactoryTest1() {
        Element e1 = ElementFactory.createElement("Na", 2);
        Element e2 = new Sodium(5);
        assertNotSame(e1, e2);
    }

    @Test
    public void invalidElementFactoryTest2() {
        Element e1 = ElementFactory.createElement("Cl", 5);
        Element e2 = new Chlorine(2);
        assertNotSame(e1, e2);
    }

    @Test(expected = ElementException.class)
    public void invalidElementFactoryTest3() {
        Element e = ElementFactory.createElement("noooo", 3);
    }

    @Test(expected = ElementException.class)
    public void invalidElementFactoryTest4() {
        Element e = ElementFactory.createElement("baka", 5);
    }

}