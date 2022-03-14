package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public abstract class Common {
    public Actions actions;
    public Select select;
    public static void navigateToURL(WebDriver driver,String URL) {
        try {
            driver.navigate().to(URL);
        } catch (Exception e) {
            System.out.println("FAILURE: URL did not load: " + URL);
            try {
                throw new Exception("URL did not load");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    public static void navigateBack(WebDriver driver) throws Exception {
        try {
            driver.navigate().back();
        } catch (Exception e) {
            System.out.println("FAILURE: Cannot go back");
            throw new Exception("Cannot go back");
        }
    }
    public static void navigateForward(WebDriver driver) throws Exception {
        try {
            driver.navigate().forward();
        } catch (Exception e) {
            System.out.println("FAILURE: Cannot go forward");
            throw new Exception("Cannot go forward");
        }
    }
    public static void refreshPage(WebDriver driver) throws Exception {
        try {
            driver.navigate().refresh();
        } catch (Exception e) {
            System.out.println("FAILURE: Cannot refresh");
            throw new Exception("Cannot go refresh");
        }
    }
    public static void clickAction(WebDriver driver,By identifier){
        driver.findElement(identifier).click();
    }

    public static String getText(WebDriver driver,By identifier){
        return driver.findElement(identifier).getText();
    }


}
