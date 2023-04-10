package com.demoqa.ui.driverFactory;

import org.testng.Assert;

public class DriverManagerFactory {

    public static DriverManager getDriver( DriverType type) {
        DriverManager driverManager = null;
        switch (type) {
            case CHROME:
                driverManager = new ChromeWebDriver();
                break;
            case FIREFOX:
                driverManager = new FirefoxWebDriver();
                break;
            case SAFARI:
                // driverManager = new SafariWebDriver();
                break;
            case EDGE:
                driverManager = new EdgeWebDriver();
                break;
            default:
                Assert.fail("The Browser: " + type.getText() + " does not exist.");
        }
        return driverManager;
    }

}
