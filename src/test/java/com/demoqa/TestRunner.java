package com.demoqa;

import com.demoqa.ui.driverFactory.DriverType;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

@CucumberOptions(features = "src/test/resources/features",
        glue = {"com.demoqa.stepsDefinitions.ui"},
        plugin = {"pretty", "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"
                , "html:target/cucumber/events/cucumber-html-report"
                , "html:target/cucumber/events/cucumber_pretty.html"
                , "json:target/cucumber/events/cucumberTestReport.json"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
    // static thread-safe container to keep the browser value
    public final static ThreadLocal<DriverType> BROWSER = new ThreadLocal<>();

    @BeforeTest
    @Parameters({"browser"})
    public void setup(@Optional String browser) {
        TestRunner.BROWSER.set(DriverType.fromString(browser));
    }
}
