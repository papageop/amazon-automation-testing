package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Common;
import utils.LoadProperties;

public class ProductPage {
    private WebDriver driver;
    private By addToCart= By.id("add-to-cart-button");
    private By price = By.cssSelector(".a-size-medium.a-color-price.offer-price.a-text-normal");
    private By goToCart = By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input");
    private By title = By.cssSelector("#productTitle");
    private By author = By.cssSelector(".a-link-normal.contributorNameID");

    public ProductPage(WebDriver driver){
        this.driver=driver;
    }
    public void navigateToProductPage(){
        String baseUrl = LoadProperties.getPropertyValue("src/main/resources/env.properties","base.url");
        String productSection = LoadProperties.getPropertyValue("src/main/resources/env.properties","product.section.url");
        String productId = LoadProperties.getPropertyValue("src/main/resources/env.properties","product.id");
        String url = baseUrl + productSection + productId;
        Common.navigateToURL(driver,url);
        System.out.println("Navigated to " + url);
    }

    public boolean verifyProductTitle(String expectedTitle){
        String actualTitle = getProductTitle();
        System.out.println("PRODUCT_PAGE: Verifying that the product title is '" + actualTitle + "'");
        return expectedTitle.equals(actualTitle);

    }

    public String getProductTitle(){
        return Common.getText(driver,title);
    }

    public String getAuthor(){
        return Common.getText(driver,author);
    }

    public String getPrice(){
        return Common.getText(driver,price);
    }

    public void clickAddToCart(){
        Common.clickAction(driver,addToCart);
    }
}
