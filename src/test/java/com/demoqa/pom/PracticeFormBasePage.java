package com.demoqa.pom;

import com.demoqa.stepsDefinitions.ui.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeFormBasePage extends BaseTest {

    @FindBy(id = "firstName")
    WebElement firstNameLbl;
    @FindBy(id = "lastName")
    WebElement lastNameLbl;
    @FindBy(xpath = "//*[@placeholder='name@example.com']")
    WebElement emailLbl;
    @FindBy(xpath = "//*[@placeholder='Mobile Number']")
    WebElement phoneNumberLbl;
    @FindBy(id = "dateOfBirthInput")
    WebElement dateBirthLbl;
    @FindBy(css = "div[class*='i css-1hwfws3']")
    WebElement subjectsLbl;
    @FindBy(id = "currentAddress")
    WebElement addressLbl;
    @FindBy(id = "submit")
    WebElement submitBtn;


    public PracticeFormBasePage() {
        PageFactory.initElements(webDriver, this);
    }

}
