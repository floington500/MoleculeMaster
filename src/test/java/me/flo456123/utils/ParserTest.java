package me.flo456123.utils;

import me.flo456123.reactant.Reactant;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void atomsParserTest1() {
        Reactant reactant = Parser.parseSubstanceString("Na_2");
        assertEquals(2, reactant.getElements()[0].getAtoms());
    }

    @Test
    public void atomsParserTest2() {
        Reactant reactant = Parser.parseSubstanceString("Na_2Cl_2");
        assertEquals(2, reactant.getElements()[0].getAtoms());
    }

    @Test
    public void atomsParserTest3() {
        Reactant reactant = Parser.parseSubstanceString("Na_2Cl_2");
        assertEquals(2, reactant.getElements()[1].getAtoms());
    }

    @Test
    public void substanceRegexCheck1() {
        assertTrue(Parser.isCompound("NaH"));
    }

    @Test
    public void substanceRegexCheck2() {
        assertFalse(Parser.isCompound("H_2"));
    }

    @Test
    public void substanceRegexCheck3() {
        assertTrue(Parser.isCompound("2Cl_2O"));
    }

    @Test
    public void parseAtomsTest1() {
        assertEquals(2, Parser.parseAtoms("Na_2"));
    }
    @Test
    public void parseAtomsTest2() {
        assertEquals(2, Parser.parseAtoms("S_2"));
    }
    @Test
    public void parseAtomsTest3() {
        assertEquals(2, Parser.parseAtoms("3Cl_2"));
    }

    @Test
    public void parseAtomsTest4() {
        assertEquals(1, Parser.parseAtoms("Na"));
    }

    @Test
    public void parseAtomsTest5() {
        assertEquals(1, Parser.parseAtoms("S"));
    }

    @Test
    public void parseAtomsTest6() {
        assertEquals(1, Parser.parseAtoms("Cl"));
    }

}