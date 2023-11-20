package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

/**
 * Write down the following test into ‘RegisterTest’
 * class
 * 1. userShouldNavigateToRegisterPageSuccessful
 * ly
 * * click on the ‘Register’ link
 * * Verify the text ‘Register’
 * 2. userSholdRegisterAccountSuccessfully *
 * click on the ‘Register’ link
 * * Select gender radio button
 * * Enter First name
 * * Enter Last name
 * * Select Day Month and Year
 * * Enter Email address
 * * Enter Password
 * * Enter Confirm password
 * * Click on REGISTER button
 * * Verify the text 'Your registration
 * completed’
 * Created by Sandip Patel
 */

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    // Individual open and close
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    // 1. userShouldNavigateToRegisterPageSuccessfully
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        // click on the ‘Register’ link
        WebElement loginLink = driver.findElement(By.linkText("Register"));
        loginLink.click();
    }

    // 2. userSholdRegisterAccountSuccessfully * click on the ‘Register’ link
    @Test
    public void userSholdRegisterAccountSuccessfully() {

        Random random = new Random();
        String email = "shane" + random.nextInt() + "@gmail.com";
        // click on the ‘Register’ link
        driver.findElement(By.linkText("Register")).click();
        // Select gender radio button
        driver.findElement(By.id("gender-male")).click();
        // Enter First name
        driver.findElement(By.id("FirstName")).sendKeys("Shane");
        // Enter Last name
        driver.findElement(By.id("LastName")).sendKeys("Warne");
        // Select Day Month and Year
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("1");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("April");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1978");
        // Enter Email address
        driver.findElement(By.id("Email")).sendKeys(email);
        // Enter Password
        driver.findElement(By.id("Password")).sendKeys("Shane1234");
        // Enter Confirm Password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Shane1234");
        // Click on REGISTER button
        driver.findElement(By.id("register-button")).click();
        // Verify the text 'Your registration completed’
        String expectedText = "Your registration completed";
        String actualText = driver.findElement(By.xpath("//div[@class='result']")).getText();
        Assert.assertEquals(expectedText, actualText);

    }

    // Individual open and close
    @After
    public void tearDown() {
        closeBrowser();
    }
}
