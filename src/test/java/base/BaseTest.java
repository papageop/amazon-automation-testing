package base;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.SignInPage;
import utils.LoadProperties;

import java.io.File;
import java.io.IOException;

public class BaseTest {
    protected WebDriver driver;
    protected Homepage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(LoadProperties.getPropertyValue("src/main/resources/env.properties","base.url"));
        homePage = new Homepage(driver);

    }

    public void loginUser() {
        SignInPage signInPage = homePage.clickSignIn();
        signInPage.enterEmail(LoadProperties.getPropertyValue("src/main/resources/env.properties", "test.email"));
        //wait to avoid captcha
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        signInPage.clickContinue();
        signInPage.enterPassword(LoadProperties.getPropertyValue("src/main/resources/env.properties", "test.password"));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        signInPage.clickSignIn();
    }
    public void signOut(){
        homePage.clickSignout();
    }
    public void takeScreenshot(){
        TakesScreenshot camera = (TakesScreenshot)driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        System.out.println(screenshot.getAbsolutePath());
        try{
            Files.move(screenshot, new File("resources/screenshots/test.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    @AfterClass
    public void tearDown(){
        driver.quit();

    }
}
