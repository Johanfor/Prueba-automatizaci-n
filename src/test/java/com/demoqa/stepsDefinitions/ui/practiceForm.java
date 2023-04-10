package com.demoqa.stepsDefinitions.ui;

import com.demoqa.pom.PracticeFormPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class practiceForm extends BaseTest {

    private final PracticeFormPage _practiceFormPage = new PracticeFormPage();

    @Given("The user is on the practice form page")
    public void theUserIsOnThePracticeFormPage() {
        webDriver.get(this._properties.get().getProperty("FormUrl"));
    }

    @When("The user fills all the information")
    public void theUserFillsAllTheInformation() {
        _practiceFormPage.fillStudentRegistrationForm();
    }

    @Then("The user clicks on submit button")
    public void theUserClicksOnSubmitButton() {
        _practiceFormPage.clickSubmitButton();

    }

}
