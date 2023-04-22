package com.github.flo456123.common.element;

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
     * Populates the elements map by loading data from a YAML config file.
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
            System.out.println("Failed to load config: " + e);
        }
    }

    /**
     * Generate a new {@link Element} to be created
     * @param symbol pass in the symbol that associates with the element
     * @param atoms number of atoms that the element will be created with
     * @return a fresh new atom of your specified desire
     */
    public static Element createElement(String symbol, int atoms) {
        if (symbol.length() > 2 || symbol.length() < 1) {
            throw new ElementException("invalid symbol - element symbol must be one or two characters");
        }

        ElementData data = elements.get(symbol);
        if (data == null) {
            throw new ElementException("element with symbol " + symbol + " does not exist");
        }

        return new Element(data, atoms);
    }
}
