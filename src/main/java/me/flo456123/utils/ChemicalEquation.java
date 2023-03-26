package me.flo456123.utils;

import me.flo456123.reactant.Reactant;

import java.util.List;

public class ChemicalEquation {
    private List<Reactant> reactants;
    private List<Reactant> products;

    public ChemicalEquation(String equation) {
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

    public List<Reactant> getReactants() {
        return reactants;
    }

    private void addReactant(Reactant r) {
        reactants.add(r);
    }

    public List<Reactant> getProducts() {
        return products;
    }

    private void addProduct(Reactant r) {
        products.add(r);
    }

}