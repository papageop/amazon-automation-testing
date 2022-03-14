package cart;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CartPage;
import utils.Common;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CartPageTest extends BaseTest {
    @Test
    public void goToCartPage(){
        loginUser();
        CartPage cartPage = homePage.clickCart();
       // takeScreenshot();
        assertTrue(cartPage.verifyOnShoppingCartPage(),"Not on shopping cart");
        assertFalse(cartPage.checkIfShoppingCartHeaderListsEmptyMessage(),"Not empty cart");
        System.out.println(cartPage.getShoppingCartMessage());
        if(!cartPage.checkIfShoppingCartHeaderListsEmptyMessage()) {
            cartPage.proceedToCheckout();
            try {
                Common.navigateBack(driver);
            } catch (Exception e) {
                e.printStackTrace();
            }
            cartPage.deleteAllItemsInCart();
        }

    }
}
