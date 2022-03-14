package utils;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

public class CookieManager {

    public static void addCookie(WebDriver driver,Cookie cookie){
        driver.manage().addCookie(cookie);
    }

    public static void deleteCookie(WebDriver driver, Cookie cookie){
        driver.manage().deleteCookie(cookie);
    }

    public static boolean isCookiePresent(WebDriver driver, Cookie cookie){
        return driver.manage().getCookieNamed(cookie.getName()) != null;
    }

    public static Cookie buildCookie(String name, String value){
        Cookie cookie = new Cookie.Builder(name, value)
                .domain(LoadProperties.getPropertyValue("src/main/resources/env.properties","base.url"))
                .build();
        return cookie;
    }
}
