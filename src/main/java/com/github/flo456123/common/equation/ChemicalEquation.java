package com.github.flo456123.common.equation;

import com.github.flo456123.common.types.Substance;
import com.github.flo456123.common.parser.Parser;

import java.util.List;
import java.util.stream.Stream;

/**
 * Represents a chemical equation in the form of reactants and products.
 */
public class ChemicalEquation {
    private final List<Substance> reactants;
    private final List<Substance> products;

    /**
     * Constructs a new {@link ChemicalEquation} from the given string representation.
     * @param equation a string representation of the {@link ChemicalEquation} in the format of "reactants -> products"
     * @throws InvalidEquationException if the equation is invalid or cannot be parsed
     */
    public ChemicalEquation(String equation) {
        String[] equationSides = equation.split(" -> ");

        // check for invalid equation
        if (equationSides.length != 2) {
            throw new InvalidEquationException("invalid equation");
        }

        String[] reactantStrings = equationSides[0].split(" \\+ ");
        String[] productStrings = equationSides[1].split(" \\+ ");

        reactants = parseSubstances(reactantStrings);
        products = parseSubstances(productStrings);
    }

    /**
     * Parses an array of substance strings into a list of {@link Substance} objects.
     * @param substanceStrings an array of substance strings
     * @return a list of {@link Substance} objects
     * @throws InvalidEquationException if any of the substance strings are invalid or cannot be parsed
     */
    private List<Substance> parseSubstances(String[] substanceStrings) {
        return Stream.of(substanceStrings)
                .map(Parser::parseSubstanceString)
                .toList();
    }

    public List<Substance> getReactants() {
        return reactants;
    }

    public List<Substance> getProducts() {
        return products;
    }
}
