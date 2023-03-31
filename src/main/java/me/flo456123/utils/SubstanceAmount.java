package me.flo456123.utils;

import me.flo456123.substance.Substance;
import me.flo456123.substance.Unit;

public class SubstanceAmount {
    private final double amount;
    private final Substance substance;
    private final Unit unit;

    /**
     * Stores an amount of substance with a dedicated unit
     * @param amount the amount of the substance
     * @param substance the substance which is being stored
     * @param unit the unit that the amount is in
     */
    public SubstanceAmount(double amount, Substance substance, Unit unit) {
        this.amount = amount;
        this.substance = substance;
        this.unit = unit;
    }

    public Substance getSubstance() {
        return substance;
    }

    public double getAmount() {
        return amount;
    }

    public Unit getUnit() {
        return unit;
    }

}