package dev.madner.Configs;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

import java.io.File;
import java.util.Properties;

public class Configurer {

    public static void ReadConfigs() {
        Configurations configs = new Configurations();

        try {
            Configuration configuration = configs.properties( new File("database.properties"));
            Properties properties = configuration.getProperties("database.host");
            System.out.println(properties);

        } catch (ConfigurationException e) {
            throw new RuntimeException(e);
        }
    }
}
