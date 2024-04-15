package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class hwRegisterPage {
    WebDriver ldriver;

    By firstNameField = By.id("input-firstname");
    By lastNameField = By.id("input-lastname");
    By emailFiled = By.id("input-email");
    By telePhoneField = By.id("input-telephone");
    By passwordField = By.id("input-password");
    By passwordConfirmField = By.id("input-confirm");
    By agreeField = By.xpath("//*[@class='custom-control-label'][@for='input-agree']");
    By submitButton = By.xpath("//input[@type='submit']");

    public hwRegisterPage(WebDriver griver){
        ldriver = griver;
    }

    public hwRegisterPage enterName(String fName , String lName){
        ldriver.findElement(firstNameField).sendKeys(fName);
        ldriver.findElement(lastNameField).sendKeys(lName);
        return this;
    }

    public hwRegisterPage enterEmail(String email){
        ldriver.findElement(emailFiled).sendKeys(email);
        return this;
    }
    public hwRegisterPage enterTelePhone(String telePHone){
        ldriver.findElement(telePhoneField).sendKeys(telePHone);
        return this;
    }

    public hwRegisterPage enterPassword(String pass , String passCheck){
        ldriver.findElement(passwordField).sendKeys(pass);
        ldriver.findElement(passwordConfirmField).sendKeys(passCheck);
        return this;
    }
    public hwRegisterPage  agreeAndSubmit(){
        ldriver.findElement(agreeField).click();
        ldriver.findElement(submitButton).click();
        return this;
    }

}
