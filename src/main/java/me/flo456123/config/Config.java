package me.flo456123.config;

import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class Config {
    private static final String CONFIG_FILE_PATH = "./src/main/resources/elements.yaml";

    public static List<Map<String, Object>> loadElementConfig() throws IOException {
        Yaml yaml = new Yaml();
        InputStream inputStream = new FileInputStream(new File(CONFIG_FILE_PATH));
        return yaml.load(inputStream);
    }
}