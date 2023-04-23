package com.github.flo456123.common.element;

/**
 * The ElementData class represents data about an element in the periodic table.
 */
public record ElementData (
        String symbol,
        String name,
        int atomicNumber,
        double atomicMass,
        ElementType elementType) {

    /**
     * Constructor that validates the atomic number and symbol of the element.
     *
     * @throws ElementException if the atomic number is not between 1 and 118, or if the symbol is longer than 2 characters
     */
    public ElementData {
        if (atomicNumber < 1 || atomicNumber > 118) {
            throw new ElementException("invalid atomic number - atomic number has to be in the range of 1-122");
        }

        if (symbol.length() > 2) {
            throw new ElementException("invalid element symbol - element symbol cannot be longer than two characters");
        }

    }

    /**
     * Returns the hash code for this {@link ElementData} object.
     *
     * @return an int representing the hash code for this {@link ElementData} object
     */
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

    /**
     * Returns a string representation of this {@link ElementData} object.
     *
     * @return a string representation of this {@link ElementData} object
     */
    @Override
    public String toString() {
        return "ElementData{" +
                "symbol='" + symbol + '\'' +
                ", name='" + name + '\'' +
                ", atomicNumber=" + atomicNumber +
                ", atomicMass=" + atomicMass +
                ", elementType=" + elementType +
                '}';
    }
}
