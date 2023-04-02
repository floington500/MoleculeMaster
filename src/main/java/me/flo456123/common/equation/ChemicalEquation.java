package me.flo456123.common.equation;

import me.flo456123.common.substance.Substance;
import me.flo456123.common.utils.Parser;

import java.util.ArrayList;
import java.util.List;

public class ChemicalEquation {
    private final List<Substance> reactants;
    private final List<Substance> products;

    public ChemicalEquation(String equation) {
        reactants = new ArrayList<>();
        products = new ArrayList<>();

        String[] equationSides = equation.split(" -> ");

        // Check for invalid equation
        if (equationSides.length != 2) {
            throw new EquationException("invalid equation");
        }

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
