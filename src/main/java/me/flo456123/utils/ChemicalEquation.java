package me.flo456123.utils;

import me.flo456123.substance.Substance;

import java.util.List;

public class ChemicalEquation {
    private List<Substance> reactants;
    private List<Substance> products;

    public ChemicalEquation(String equation) {
        String[] equationSides = equation.split(" -> ");
        String[] reactantStrings = equationSides[0].split(" \\+ ");
        String[] productStrings = equationSides[1].split(" \\+ ");

        for (String reactantString : reactantStrings) {
            reactants.add(Parser.parseSubstanceString(reactantString));
        }

        for (String productString : productStrings) {
            products.add(Parser.parseSubstanceString(productString));
        }

    }

    public List<Substance> getReactants() {
        return reactants;
    }

    public List<Substance> getProducts() {
        return products;
    }

}