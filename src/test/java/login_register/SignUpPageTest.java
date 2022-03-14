package login_register;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.SignUpPage;

public class SignUpPageTest extends BaseTest {
    @Test
    public void signUp(){
        SignUpPage signUpPage = homePage.clickSignUp();
    }
}
