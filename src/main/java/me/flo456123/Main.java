package me.flo456123;

import me.flo456123.substance.Substance;
import me.flo456123.equation.ChemicalEquation;

public class Main {
    public static void main(String[] args) {
        ChemicalEquation equation = new ChemicalEquation("NaH_2 -> 6O_3Cl_4 + H_2");

        System.out.println("Reactants:\n");
        for (Substance s : equation.getReactants()) {
            System.out.println(s);
        }

        System.out.println("Products:\n");
        for (Substance s : equation.getProducts()) {
            System.out.println(s);
        }

    }
}