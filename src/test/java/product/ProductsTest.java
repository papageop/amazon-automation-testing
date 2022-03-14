package product;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ProductPage;

import static org.testng.Assert.assertTrue;

public class ProductsTest extends BaseTest {
    @Test
    public void productTest(){
        loginUser();
        ProductPage productPage = new ProductPage(driver);
        productPage.navigateToProductPage();
        System.out.println(productPage.getProductTitle());
        assertTrue(productPage.verifyProductTitle("1984"),"Not the expected product title");
        productPage.clickAddToCart();
    }
}
