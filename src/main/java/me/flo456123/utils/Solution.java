package me.flo456123.utils;

import me.flo456123.substance.Substance;

public class Solution {
    private double amount;
    private Substance substance;
    private Unit unit;

    /**
     * Stores an amount of substance with a dedicated unit
     * @param amount the amount of the substance
     * @param substance the substance which is being stored
     * @param unit the unit that the amount is in
     */
    public Solution(double amount, Substance substance, Unit unit) {
        setAmount(amount);
        setSubstance(substance);
        setUnit(unit);
    }

    public Substance getSubstance() {
        return substance;
    }

    private void setSubstance(Substance substance) {
        this.substance = substance;
    }

    public double getAmount() {
        return amount;
    }

    private void setAmount(double amount) {
        if (amount < 0) {
            throw new UtilException("amount cannot be negative");
        }

        this.amount = amount;
    }

    public Unit getUnit() {
        return unit;
    }

    private void setUnit(Unit unit) {
        this.unit = unit;
    }

}