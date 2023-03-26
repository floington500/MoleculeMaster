package me.flo456123.utils;

import me.flo456123.substance.Substance;

import java.util.ArrayList;
import java.util.List;

public class ChemicalEquation {
    private final List<Substance> reactants;
    private final List<Substance> products;

    public ChemicalEquation(String equation) {
        reactants = new ArrayList<>();
        products = new ArrayList<>();

        String[] equationSides = equation.split(" -> ");
        String[] reactantStrings = equationSides[0].split(" \\+ ");
        String[] productStrings = equationSides[1].split(" \\+ ");

        for (String reactantString : reactantStrings) {
            addReactant(Parser.parseSubstanceString(reactantString));
        }

        for (String productString : productStrings) {
            addProduct(Parser.parseSubstanceString(productString));
        }

    }

    public List<Substance> getReactants() {
        return reactants;
    }

    private void addReactant(Substance r) {
        reactants.add(r);
    }

    public List<Substance> getProducts() {
        return products;
    }

    private void addProduct(Substance r) {
        products.add(r);
    }

}