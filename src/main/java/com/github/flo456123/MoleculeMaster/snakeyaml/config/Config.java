package com.github.flo456123.MoleculeMaster.snakeyaml.config;

import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * Class that parses the yaml file containing all the element data.
 */
public class Config {
    private static final String PATH_TO_CONFIG = "/elements.yaml";

    /**
     * Loads the element configuration data from the elements.yaml file.
     * <p>
     * This method reads the elements.yaml file located in the resources folder,
     * parses it using SnakeYAML, and returns a list of maps representing the
     * configuration data for each element.
     *
     * @return A List of Maps, where each Map contains the properties (keys and values)
     *         of an element from the elements.yaml file.
     * @throws IOException If an error occurs while reading the elements.yaml file.
     * @throws RuntimeException If the elements.yaml file is not found in the classpath.
     * </p>
     */
    public static List<Map<String, Object>> loadElementConfig() throws IOException {
        Yaml yaml = new Yaml();
        InputStream inputStream = Config.class.getResourceAsStream(PATH_TO_CONFIG);

        if (inputStream == null) {
            throw new RuntimeException("failed to load elements config file");
        }

        try (inputStream) {
            return yaml.load(inputStream);
        }
    }
}
