package com.demoqa.pom;

import java.time.Duration;
import java.util.List;
import java.util.Locale;

import com.demoqa.ui.utils.RandomGender;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeFormPage extends PracticeFormBasePage {

    Faker faker = new Faker(Locale.US);
    String name = faker.name().firstName();
    String lastName = faker.name().lastName();
    String randomGender = new RandomGender().getGender();

    WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(30));

    public void fillStudentRegistrationForm() {
        wait.until(ExpectedConditions.visibilityOf(firstNameLbl));
        firstNameLbl.sendKeys(name);
        lastNameLbl.sendKeys(lastName);
        emailLbl.sendKeys(name + "." + lastName + "@mailtest.com");
        WebElement genderRadio = webDriver.findElement(By.id("genterWrapper"));
        List<WebElement> gender = genderRadio.findElements(By.name("gender"));
        for (WebElement e : gender) {
            if (e.getText().contains(randomGender)) {
                e.click();
                break;
            }
        }
        phoneNumberLbl.sendKeys(faker.number().digits(10));
        dateBirthLbl.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), "20 Feb 1986", Keys.ENTER);
        subjectsLbl.sendKeys(faker.lorem().sentence(5));
        WebElement hobbiesCheck = webDriver.findElement(By.id("hobbiesWrapper"));
        List<WebElement> hobbies = hobbiesCheck.findElements(By.className("custom-control custom-checkbox custom-control-inline"));
        for (WebElement e : hobbies) {
            if (e.getText().contains("Music")) {
                e.click();
                break;
            }
        }
        addressLbl.sendKeys(faker.address().fullAddress());
        WebElement stateList = webDriver.findElement(By.id("state"));
        List<WebElement> state = stateList.findElements(By.className("custom-control custom-checkbox custom-control-inline"));
        for (WebElement e : state) {
            if (e.getText().contains("NCR")) {
                e.click();
                break;
            }
        }
        WebElement cityList = webDriver.findElement(By.id("city"));
        List<WebElement> city = cityList.findElements(By.className("custom-control custom-checkbox custom-control-inline"));
        for (WebElement e : city) {
            if (e.getText().contains("Delhi")) {
                e.click();
                break;
            }
        }
    }

    public void clickSubmitButton() {
        submitBtn.click();
    }

}