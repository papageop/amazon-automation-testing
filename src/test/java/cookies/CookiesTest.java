package cookies;

import base.BaseTest;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;
import utils.CookieManager;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CookiesTest extends BaseTest {
    @Test
    public void cookiesTest(){
        Cookie cookie = CookieManager.buildCookie("optimizelyBuckets", "%7B%TD");
        System.out.println("Cookie "+cookie.getName());
        CookieManager.deleteCookie(driver,cookie);
        assertFalse(CookieManager.isCookiePresent(driver,cookie), "Cookie was not deleted");
    }
}
