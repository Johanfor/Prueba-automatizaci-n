package com.demoqa.stepsDefinitions.ui;

import com.demoqa.TestRunner;
import com.demoqa.ui.driverFactory.DriverManagerFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseTest {

    @Before(value = "@PRACTICE_FORM")
    public void setUp() {
        driverManager = DriverManagerFactory.getDriver(TestRunner.BROWSER.get());
        webDriver = driverManager.getWebDriver();
    }

    @After
    public void tearDown() {
        driverManager.quitDriver();
    }
}
