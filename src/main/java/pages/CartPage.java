package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Common;

import java.util.List;

public class CartPage {
    private WebDriver driver;
    private By cartNav = By.id("nav-cart");
    private final By cartHeader = By.cssSelector("h1");
    private By deleteButton = By.cssSelector("input[value='Delete']");
    private By checkoutButton = By.cssSelector("input[value='Proceed to checkout']");
    private String emptyCart = "Your Amazon Cart is empty.";

    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public void deleteFirstItemInCart(){
        WebElement deleteItemButton = this.driver.findElement(deleteButton);
        deleteItemButton.click();
    }
    public boolean verifyOnShoppingCartPage(){
        String url = driver.getCurrentUrl();
        System.out.println("Verifying that we are on cart page.");
        return url.contains("cart");
    }

    public void deleteAllItemsInCart(){
        List<WebElement> deleteButtons = this.driver.findElements(deleteButton);
        for ( WebElement button : deleteButtons ){
            button.click();
        }
    }
    public String getShoppingCartMessage(){

        return Common.getText(driver,cartHeader);
    }

    public CheckoutPage proceedToCheckout(){
        this.driver.findElement(checkoutButton).click();
        return new CheckoutPage(driver);
    }
    public boolean checkIfShoppingCartHeaderListsEmptyMessage(){
        String actualMessage = getShoppingCartMessage();
        return (actualMessage.contains(emptyCart));
    }

}
