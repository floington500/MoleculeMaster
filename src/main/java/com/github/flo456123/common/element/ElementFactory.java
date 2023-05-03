package com.github.flo456123.common.element;

import com.github.flo456123.common.element.exceptions.UnsupportedElementException;
import com.github.flo456123.snakeyaml.config.Config;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The ElementFactory class is responsible for creating new instances of {@link Element} by using
 * the {@link ElementData} and loading data from a YAML config file.
 */
public class ElementFactory {
    private final static Map<String, ElementData> elements = new HashMap<>();

    /*
     * Populates the elements map by loading data from a YAML configuration file.
     */
    static {
        try {
            List<Map<String, Object>> obj = Config.loadElementConfig();

            for (Map<String, Object> config : obj) {
                String symbol = (String) config.get("symbol");
                String name = (String) config.get("name");
                double atomicMass = (Double) config.get("atomicMass");
                int atomicNumber = (Integer) config.get("atomicNumber");
                ElementType elementType = ElementType.valueOf((String) config.get("elementType"));

                elements.put(symbol, new ElementData(symbol, name, atomicNumber, atomicMass, elementType));
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to load config: " + e);
        }
    }

    /**
     * Creates a new element instance with a given symbol and number of atoms.
     *
     * @param symbol the symbol of the element to create
     * @param atoms  the number of atoms for the element to be created with
     * @return a new {@link Element} instance
     * @throws UnsupportedElementException if element symbol is not in range of 1-2,
     * or if the element symbol is not present in the datafile
     */
    public static Element createElement(String symbol, int atoms) {
        if (symbol.length() < 1 || symbol.length() > 2) {
            throw new UnsupportedElementException("element symbol must be one or two characters");
        }

        ElementData data = elements.get(symbol);
        if (data == null) {
            throw new UnsupportedElementException("element with symbol " + symbol + " does not exist");
        }

        return new Element(data, atoms);
    }
}
