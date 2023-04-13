package me.flo456123.common.element;

public record ElementData (
        String symbol,
        String name,
        int atomicNumber,
        double atomicMass,
        ElementType elementType) {

    public ElementData {
        if (atomicNumber < 1 || atomicNumber > 118) {
            throw new ElementException("invalid atomic number - atomic number has to be in the range of 1-122");
        }

        if (symbol.length() > 2) {
            throw new ElementException("invalid element symbol - element symbol cannot be longer than two characters");
        }

    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + symbol.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + atomicNumber;
        long atomicMassBits = Double.doubleToLongBits(atomicMass);
        result = 31 * result + (int) (atomicMassBits ^ (atomicMassBits >>> 32));
        result = 31 * result + elementType.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Atomic number: " +
                atomicNumber +
                "\tElementData symbol: " +
                symbol +
                "\tAtomic mass: " +
                atomicMass +
                "\tElementData type: " +
                elementType;
    }
}
