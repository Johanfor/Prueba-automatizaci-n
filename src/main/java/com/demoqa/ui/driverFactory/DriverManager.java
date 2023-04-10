package com.demoqa.ui.driverFactory;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {

    protected WebDriver webDriver;
    protected abstract void setWebDriver();

    public void quitDriver(){
        if(webDriver != null){
            webDriver.quit();
            webDriver = null;
        }
    }

    public WebDriver getWebDriver(){
        if(webDriver == null){
            setWebDriver();
        }
        return webDriver;
    }

}
