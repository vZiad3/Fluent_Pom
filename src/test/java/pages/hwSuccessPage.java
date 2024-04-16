package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class hwSuccessPage {

    By textVerify = By.xpath("//*[text()='Your Account Has Been Created!']");
    WebDriver ldriver;

    public hwSuccessPage(WebDriver gdrvier){
        ldriver = gdrvier;
    }
    public void verifyText(){
        WebElement textVerifyEle = ldriver.findElement(textVerify);
        Assert.assertTrue(textVerifyEle.isDisplayed());
    }
}
