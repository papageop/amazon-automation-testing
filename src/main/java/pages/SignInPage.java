package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Common;

public class SignInPage {
    private WebDriver driver;
    private By emailInput = By.id("ap_email");
    private By passwordInput = By.id("ap_password");
    private By continueButton = By.id("continue");
    private By alertHeading = By.className("a-alert-heading");
    private By alertBody = By.className("a-alert-content");
    private By signInButton = By.id("signInSubmit");

    public SignInPage(WebDriver driver){
        this.driver = driver;
    }
    public void enterEmail(String email){
        driver.findElement(emailInput).sendKeys(email);
    }
    public void clickContinue(){
        Common.clickAction(driver,continueButton);
    }
    public void enterPassword(String password){
        driver.findElement(passwordInput).sendKeys(password);
    }
    public void clickSignIn(){
        Common.clickAction(driver,signInButton);
    }
    public String getAlertHeading(){
        if(driver.findElement(alertHeading)!=null) {
            return Common.getText(driver,alertHeading);
        }
        else{
            return "";
        }
    }
    public String getAlertContent(){
        if(driver.findElement(alertBody)!=null) {
            return Common.getText(driver,alertBody);
        }
        else{
            return "";
        }    }
}
