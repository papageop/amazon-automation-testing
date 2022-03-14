package login_register;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.SignInPage;
import utils.LoadProperties;

public class SignInPageTest extends BaseTest {
    @Test
    public void signInUser(){

        loginUser();

        signOut();
     //   System.out.println(signInPage.getAlertHeading());
      //  System.out.println(signInPage.getAlertContent());

    }

    @Test
    public void load(){
        System.out.println(LoadProperties.getPropertyValue("src/main/resources/env.properties","test.email"));

    }
}
