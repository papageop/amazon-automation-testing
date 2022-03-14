package navigation;

import base.BaseTest;
import org.testng.annotations.Test;
import utils.Common;

public class NavigationTest extends BaseTest {
    @Test
    public void testNavigator(){
        homePage.clickSignIn();

        try {
            Common.navigateBack(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Common.refreshPage(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Common.navigateForward(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Common.navigateBack(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Common.navigateToURL(driver,"https://google.com");

    }
}
