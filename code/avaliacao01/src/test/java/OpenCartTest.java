//package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenCartTest {

    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass
    public static void setupClass() {
        FirefoxDriverManager.getInstance().setup();
    }

    @Before
    public void setUp() throws Exception {

        driver = new FirefoxDriver();
        baseUrl = "https://www.google.com.br/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testOpenCart() throws Exception {

        driver.get("https://demo.opencart.com/");
        //driver.findElement(By.name("search")).clear();
        //driver.findElement(By.name("search")).sendKeys("hp");
        driver.get("https://demo.opencart.com/index.php?route=product/product&product_id=47&search=hp");
        //driver.findElement(By.cssSelector("div.image > a > img.img-responsive")).click();
        driver.findElement(By.id("button-cart")).click();
        Thread.sleep(2000);
        driver.get("https://demo.opencart.com/index.php?route=checkout/checkout");

        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value='guest']")).click();
        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (isElementPresent(By.id("button-account"))) break;
            } catch (Exception e) {
            }
            Thread.sleep(1000);
        }

        driver.findElement(By.id("button-account")).click();
        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (isElementPresent(By.id("account"))) break;
            } catch (Exception e) {
            }
            Thread.sleep(1000);
        }

        driver.findElement(By.id("input-payment-firstname")).clear();
        driver.findElement(By.id("input-payment-firstname")).sendKeys("");
        driver.findElement(By.id("button-guest")).click();

        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*First Name must be between 1 and 32 characters![\\s\\S]*$"))
                    break;
            } catch (Exception e) {
            }
            Thread.sleep(1000);
        }

        assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*First Name must be between 1 and 32 characters![\\s\\S]*$"));
        driver.findElement(By.id("input-payment-firstname")).clear();
        driver.findElement(By.id("input-payment-firstname")).sendKeys("Jonathan");
        driver.findElement(By.id("input-payment-lastname")).clear();
        driver.findElement(By.id("input-payment-lastname")).sendKeys("Barros");
        driver.findElement(By.id("input-payment-email")).clear();
        driver.findElement(By.id("input-payment-email")).sendKeys("a");
        driver.findElement(By.id("button-guest")).click();

        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*E-Mail address does not appear to be valid![\\s\\S]*$"))
                    break;
            } catch (Exception e) {
            }
            Thread.sleep(1000);
        }

        assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*E-Mail address does not appear to be valid![\\s\\S]*$"));
        driver.findElement(By.id("input-payment-email")).clear();
        driver.findElement(By.id("input-payment-email")).sendKeys("email@email.com");
        driver.findElement(By.id("input-payment-telephone")).clear();
        driver.findElement(By.id("input-payment-telephone")).sendKeys("99999999");
        driver.findElement(By.id("input-payment-city")).clear();
        driver.findElement(By.id("input-payment-city")).sendKeys("New York City");
        driver.findElement(By.id("input-payment-address-1")).clear();
        driver.findElement(By.id("input-payment-address-1")).sendKeys("1Broadway Avenue");
        driver.findElement(By.id("input-payment-postcode")).clear();
        driver.findElement(By.id("input-payment-postcode")).sendKeys("");
        driver.findElement(By.id("button-guest")).click();
        assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Postcode must be between 2 and 10 characters![\\s\\S]*$"));
        driver.findElement(By.id("input-payment-postcode")).clear();
        driver.findElement(By.id("input-payment-postcode")).sendKeys("14423");
        new Select(driver.findElement(By.id("input-payment-country"))).selectByValue("223");
        new Select(driver.findElement(By.id("input-payment-zone"))).selectByVisibleText("Alabama");
        driver.findElement(By.id("button-guest")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("button-shipping-method")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("agree")).click();
        driver.findElement(By.id("button-payment-method")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("button-confirm")).click();
        Thread.sleep(2000);
        assertTrue(driver.getCurrentUrl().matches("^https://demo\\.opencart\\.com/index\\.php[\\s\\S]route=checkout/success$"));
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
