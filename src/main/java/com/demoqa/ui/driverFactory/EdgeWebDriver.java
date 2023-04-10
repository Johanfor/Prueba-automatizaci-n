package com.demoqa.ui.driverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class EdgeWebDriver extends DriverManager {

    @Override
    public void setWebDriver() {
        WebDriverManager.edgedriver().setup();
        this.webDriver = new EdgeDriver();
        this.webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        this.webDriver.manage().window().maximize();
    }
}
