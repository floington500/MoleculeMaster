package me.flo456123.substance;

import me.flo456123.substance.reactants.Reactant;

public class Substance {
    private final double   nMoles;
    private final Reactant reactant;
    private final double   mass;
    private final Unit     unit;

    /**
     * Substance stores a reactant along with its mass, unit, and moles
     * @param n number of moles
     * @param r the reactant of the substance
     * @param mass the amount of the substance
     * @param unit what unit the substance is
     */
    public Substance(double n, Reactant r, double mass, Unit unit) {
        if (mass < 0) {
            throw new RuntimeException("invalid mass - mass cannot be negative");
        }

        nMoles = n;
        reactant = r;
        this.mass = mass;
        this.unit = unit;
    }

    public double getMoles() {
        return nMoles;
    }

    public Reactant getReactant() {
        return reactant;
    }

    public double getMass() {
        return mass;
    }

    public Unit getUnit() {
        return unit;
    }

}