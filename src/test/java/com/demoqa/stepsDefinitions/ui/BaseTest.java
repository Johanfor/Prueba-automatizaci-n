package com.demoqa.stepsDefinitions.ui;

import com.demoqa.ui.driverFactory.DriverManager;
import com.demoqa.ui.utils.AppProperties;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public abstract class BaseTest {

    protected DriverManager driverManager;
    protected static WebDriver webDriver;
    protected static ThreadLocal<Properties> _properties = new AppProperties().getAppProperties();


}
