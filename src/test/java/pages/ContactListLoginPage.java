package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ContactListLoginPage {
    //WebDriver driver;       // for the all class
    WebDriver ldriver;       // for the all class
    By emailById = By.id("email");
    By passwordById = By.id("password");
    By submitdById = By.id("submit");
    public ContactListLoginPage(WebDriver gdriver){     //gfriver = global
      //  this.driver = driver;
        ldriver = gdriver;
    }

    public ContactListLoginPage enterEmail(String email){
        ldriver.findElement(emailById).sendKeys(email);
        return  this;

    }
    public ContactListLoginPage enterPassword(String password){

        ldriver.findElement(passwordById).sendKeys(password);
        return  this;

    }
    public ContactListLoginPage clickSubmit(){

        ldriver.findElement(submitdById).click();
        return  this;


    }

    public ContactListHomePage clickSubmit2(){

        ldriver.findElement(submitdById).click();
        return  new ContactListHomePage(ldriver);       // we didnt write name because we are not gonna use it again


    }



}

//Fleunent POM