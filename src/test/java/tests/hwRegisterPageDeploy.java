package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.hwRegisterPage;

import java.time.Duration;

public class hwRegisterPageDeploy {


    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();  // the L driver will be Chrome now
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
        hwRegisterPage registerPage = new hwRegisterPage(driver);


        registerPage
                .enterName("Ziad","alsh")
                .enterEmail("s25522@gmail.com")
                .enterTelePhone("333233")
                .enterPassword("12324" , "12324")
                .agreeAndSubmit();      //here there's we will be on the next page and there will be assert

    }
}
