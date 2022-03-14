package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Common;
import utils.LoadProperties;

public class Homepage {
    private WebDriver driver;
    private By gamingCategoryLink=By.id("desktop-grid-1");
    private By cartButton=By.id("nav-cart");
    private By signInButton = By.id("nav-link-accountList");
    private By signOutButton = By.xpath("//*[@id=\"nav-flyout-ya-newCust\"]/a");

    public Homepage(WebDriver driver){
        this.driver = driver;
    }


    public CartPage clickCart(){
        Common.clickAction(driver,cartButton);
        return new CartPage(driver);
    }
    public SignInPage clickSignIn(){
        Common.clickAction(driver,signInButton);
        return new SignInPage(driver);
    }
    public void clickSignout(){
        String base = LoadProperties.getPropertyValue("src/main/resources/env.properties","base.url");
        String signout = LoadProperties.getPropertyValue("src/main/resources/env.properties","signout.url");

        Common.navigateToURL(driver,base+signout);
    }
    public SignUpPage clickSignUp(){
        Common.clickAction(driver,signOutButton);
        return new SignUpPage(driver);
    }

}
