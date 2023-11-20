package testsuite;
/**
 * Write down the following test into ‘LoginTest’ class
 * 1. userShouldNavigateToLoginPageSuccessfully *
 * click on the ‘Login’ link
 * * Verify the text ‘Welcome, Please Sign
 * In!’
 * 2. userShouldLoginSuccessfullyWithValidCredentials
 * * click on the ‘Login’ link
 * * Enter valid username
 * * Enter valid password
 * * Click on ‘LOGIN’ button
 * * Verify the ‘Log out’ text is display
 * 3. verifyTheErrorMessage
 * * click on the ‘Login’ link
 * * Enter invalid username
 * * Enter invalid password
 * * Click on Login button
 * * Verify the error message ‘Login was unsuccessful.
 * Please correct the errors and try again. No customer account found’
 * Created By Sandip Patel
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    // Individual open and close
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    // 1. userShouldNavigateToLoginPageSuccessfully click on the ‘Login’ link
    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        // Click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        // Verify that text ‘Welcome, Please Sign In!’
        String expectedDisplayMessage = "Welcome, Please Sign In!";
        String actualDisplayMessage = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]")).getText();
        // xpath method use Contains and Text() - //tagName[contains(text(),'partialvalue')]
        Assert.assertEquals(expectedDisplayMessage, actualDisplayMessage);
    }

    //2.  Declare userShouldLoginSuccessfullyWithValidCredentials method
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
       // Random random = new Random();
       // String email = "shane" + random.nextInt() + "@gmail.com";
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        // Enter valid username
        driver.findElement(By.id("Email")).sendKeys("shanewarne1978@gmail.com");
        // Enter valid password
        driver.findElement(By.id("Password")).sendKeys("Shane1234");
        // Click on 'LOGIN' button
        driver.findElement(By.cssSelector(".login-button")).click();
        // Verify the ‘Log out’ text is display
        String expectedText = "Log out";
        WebElement actualTextElement = driver.findElement(By.linkText("Log out"));
        String actualText = actualTextElement.getText();
        // Verify expected and actual text
        Assert.assertEquals(expectedText, actualText);
        // driver.findElement(By.linkText("Log out")); // not required in this just for reference

    }

    // 3. Declare verifyTheErrorMessage
    @Test
    public void verifyTheErrorMessage() {
        // Click on login link
        Random random = new Random();
        String email = "shane" + random.nextInt() + "@gmail.com";
        WebElement loginLink = driver.findElement((By.linkText("Log in")));
        loginLink.click();
        // Enter invalid  username
        WebElement emailFiled = driver.findElement(By.id("Email"));
        emailFiled.sendKeys("markjackson1234@gmail.com");
        // Enter invalid password
        WebElement passwordFiled = driver.findElement(By.name("Password"));
        passwordFiled.sendKeys("Mark1234");
        // Click on Login button
        driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();
        // Verify the error message ‘Login was unsuccessful.
        // Please correct the errors and try again. No customer account found’
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        //String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
        // "No customer account found";
        // Find the error message element and get the text

        String actualErrorMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    // Individual open and close
    @After
    public void tearDown() {
        closeBrowser();
    }

}
