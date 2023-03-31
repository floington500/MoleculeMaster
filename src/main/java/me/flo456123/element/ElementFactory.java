package me.flo456123.element;

import me.flo456123.config.Config;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElementFactory {
    private final static Map<String, Element> elements = new HashMap<>();

    static {
        try {
            List<Map<String, Object>> obj = Config.loadElementConfig();

            for (Map<String, Object> config : obj) {
                String symbol = (String) config.get("symbol");
                String name = (String) config.get("name");
                double atomicMass = (Double) config.get("atomicMass");
                int atomicNumber = (Integer) config.get("atomicNumber");
                ElementType elementType = ElementType.valueOf((String) config.get("elementType"));

                elements.put(symbol, new Element(symbol, name, atomicNumber, atomicMass, elementType));
            }
        } catch (IOException e) {
            System.out.println("Failed to load config: " + e);
        }
    }

    /**
     * Generate a new element to be created
     * @param symbol pass in the symbol that associates with the element
     * @param atoms number of atoms that the element will be created with
     * @return a fresh new atom of your specified desire
     */
    public static ElementInstance createElement(String symbol, int atoms) {
        if (symbol.length() > 2 || symbol.length() < 1) {
            throw new ElementException("invalid symbol - element symbol must be one or two characters");
        }

        Element element = elements.get(symbol);
        if (element == null) {
            throw new ElementException("element with symbol " + symbol + " does not exist");
        }

        return new ElementInstance(element, atoms);
    }

}