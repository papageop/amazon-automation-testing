package pages;

import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    private WebDriver driver;
    public CheckoutPage(WebDriver driver){
        this.driver = driver;
    }
    public boolean verifyOnShoppingCartReviewPage(){
        String url = driver.getCurrentUrl();
        System.out.println("Verifying that we are on cart review page.");
        return url.contains("view");

    }
}
