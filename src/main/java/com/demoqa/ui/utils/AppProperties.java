package com.demoqa.ui.utils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@AllArgsConstructor
@NoArgsConstructor
public class AppProperties {

    private ThreadLocal<Properties> _properties = new ThreadLocal<Properties>();

    @SneakyThrows
    public ThreadLocal<Properties> getAppProperties() {

        Properties properties = new Properties();
        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("application.properties");
            properties.load(inputStream);
            _properties.set(properties);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return _properties;
    }
}