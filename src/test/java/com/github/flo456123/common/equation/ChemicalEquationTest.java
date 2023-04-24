package com.github.flo456123.common.equation;

import com.github.flo456123.common.element.Element;
import com.github.flo456123.common.element.ElementFactory;
import com.github.flo456123.common.types.Substance;
import com.github.flo456123.common.types.substances.Compound;
import com.github.flo456123.common.types.substances.Molecule;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class ChemicalEquationTest {

    @Test
    public void validEquationTest1() {
        ChemicalEquation equation = new ChemicalEquation("2NaCl_2 -> Na + Cl_2");

        // make compound to test reactants
        Element elementReactant1 = ElementFactory.createElement("Na", 1);
        Element elementReactant2 = ElementFactory.createElement("Cl", 2);
        Compound compound = new Compound(2, elementReactant1, elementReactant2);

        // make list so comparison can be made
        List<Substance> reactants = List.of(compound);

        // test reactants
        assertEquals(equation.getReactants(), reactants);

        // make first molecule product
        Molecule molecule1 = new Molecule(1, elementReactant1);

        // make second molecule product
        Molecule molecule2 = new Molecule(1, elementReactant2);

        // merge substances
        List<Substance> products = Arrays.asList(molecule1, molecule2);

        // test products
        assertEquals(equation.getProducts(), products);
    }

    @Test
    public void validEquationTest2() {
        ChemicalEquation equation = new ChemicalEquation("2HCl + 2O_3 -> 2HO_3 + Cl_2");

        // create first compound reactant
        Element elementReactant1 = ElementFactory.createElement("H", 1);
        Element elementReactant2 = ElementFactory.createElement("Cl", 1);
        Compound compoundReactant1 = new Compound(2, elementReactant1, elementReactant2);

        // create second compound reactant
        Element elementReactant3 = ElementFactory.createElement("O", 3);
        Molecule moleculeReactant1 = new Molecule(2, elementReactant3);

        // merge reactants into a list
        List<Substance> reactants = Arrays.asList(compoundReactant1, moleculeReactant1);

        // test reactants
        Assert.assertEquals(equation.getReactants().get(0), reactants.get(0));

        // create compound
        Element elementProduct1 = ElementFactory.createElement("H", 1);
        Element elementProduct2 = ElementFactory.createElement("O", 3);
        Compound compoundProduct1 = new Compound(2, elementProduct1, elementProduct2);

        // create molecule
        Element elementProduct3 = ElementFactory.createElement("Cl", 2);
        Molecule moleculeProduct1 = new Molecule(1, elementProduct3);

        // merge substances into a list
        List<Substance> products = Arrays.asList(compoundProduct1, moleculeProduct1);

        // test products
        assertEquals(equation.getProducts(), products);
    }

    @Test
    public void validEquationTest3() {
        ChemicalEquation equation = new ChemicalEquation("BeS_4 + HP_4 -> BeP_4 + HS_4");

        // make first compound reactant
        Element elementReactant1 = ElementFactory.createElement("Be", 1);
        Element elementReactant2 = ElementFactory.createElement("S", 4);
        Compound compoundReactant1 = new Compound(1, elementReactant1, elementReactant2);

        // make second compound reactant
        Element elementReactant3 = ElementFactory.createElement("H", 1);
        Element elementReactant4 = ElementFactory.createElement("P", 4);
        Compound compoundReactant2 = new Compound(1, elementReactant3, elementReactant4);

        // merge substances
        List<Substance> reactants = List.of(compoundReactant1, compoundReactant2);

        // test reactants
        assertEquals(equation.getReactants(), reactants);

        // make first compound product
        Element elementProduct1 = ElementFactory.createElement("Be", 1);
        Element elementProduct2 = ElementFactory.createElement("P", 4);
        Compound compoundProduct1 = new Compound(1, elementProduct1, elementProduct2);

        // make second compound product
        Element elementProduct3 = ElementFactory.createElement("H", 1);
        Element elementProduct4 = ElementFactory.createElement("S", 4);
        Compound compoundProduct2 = new Compound(1, elementProduct3, elementProduct4);

        // merge substances
        List<Substance> products = Arrays.asList(compoundProduct1, compoundProduct2);

        // test products
        assertEquals(equation.getProducts(), products);
    }

    public void invalidEquationTest1() {
        assertThrows(InvalidEquationException.class, () -> new ChemicalEquation("NaCl_2 ->"));
    }

    public void invalidEquationTest2() {
        assertThrows(InvalidEquationException.class, () -> new ChemicalEquation("-> NaCl_2"));
    }

    public void invalidEquationTest3() {
        assertThrows(InvalidEquationException.class, () ->  new ChemicalEquation(" -> "));
    }

}