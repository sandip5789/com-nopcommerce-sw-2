package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Write down the following test into ‘TopMenuTest’
 * class
 * 1. userShouldNavigateToComputerPageSuccessfully
 * * click on the ‘Computers’ Tab
 * * Verify the text ‘Computers’
 * 2. userShouldNavigateToElectronicsPageSuccessfully
 * * click on the ‘Electronics’ Tab
 * * Verify the text ‘Electronics’
 * 3. userShouldNavigateToApparelPageSuccessfully
 * * click on the ‘Apparel’ Tab
 * * Verify the text ‘Apparel’ 4.
 * userShouldNavigateToDigitalDownloadsPageSuccessfully
 * * click on the ‘Digital downloads’ Tab
 * * Verify the text ‘Digital downloads’
 * 5. userShouldNavigateToBooksPageSuccessfully
 * * click on the ‘Books’ Tab
 * * Verify the text ‘Books’
 * 6. userShouldNavigateToJewelryPageSuccessfully
 * * click on the ‘Jewelry’ Tab
 * * Verify the text ‘Jewelry’
 * 7. userShouldNavigateToGiftCardsPageSuccessfully
 * * click on the ‘Gift Cards’ Tab
 * * Verify the text ‘Gift Cards’
 * Created By Sandip Patel
 */
public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    // Individual open and close
    @Before
    public void setUp() {
        openBrowser(baseUrl);

    }

    // 1 userShouldNavigateToComputerPageSuccessfully
    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        // Click on the ‘Computers’ Tab
        WebElement clickOnComputers = driver.findElement(By.partialLinkText("Computers"));
        clickOnComputers.click();
        // Verify the text ‘Computers’
        String expectedText = "Computers";
        String actualText = driver.findElement(By.xpath("//h1[text()='Computers']")).getText();
        Assert.assertEquals(expectedText, actualText);

    }

    // 2. userShouldNavigateToElectronicsPageSuccessfully
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        // click on the ‘Electronics’ Tab
        WebElement clickOnElectronics = driver.findElement(By.partialLinkText("Electronics"));
        clickOnElectronics.click();
        // Verify the text
        String expectedText = "Electronics";
        String actualText = driver.findElement(By.xpath("//h1[text()='Electronics']")).getText();
        Assert.assertEquals(expectedText, actualText);

    }

    // 3. userShouldNavigateToApparelPageSuccessfully
    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        // click on the ‘Apparel’ Tab
        WebElement clickOnApparel = driver.findElement(By.partialLinkText("Apparel"));
        clickOnApparel.click();
        // Verify the text
        String expectedText = "Apparel";
        String actualText = driver.findElement(By.xpath("//h1[text()='Apparel']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    // 4 userShouldNavigateToDigitalDownloadsPageSuccessfully
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        // click on the ‘Digital downloads’ Tab
        WebElement clickOnDigitalDownloads = driver.findElement(By.partialLinkText("Digital downloads"));
        clickOnDigitalDownloads.click();
        // Verify the text
        String expectedText = "Digital downloads";
        String actualText = driver.findElement(By.xpath("//h1[text()='Digital downloads']")).getText();
        Assert.assertEquals(expectedText, actualText);

    }

    // 5 userShouldNavigateToBooksPageSuccessfully
    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        //  click on the ‘Books’ Tab
        WebElement clickOnBook = driver.findElement(By.partialLinkText("Books"));
        clickOnBook.click();
        // Verify the text
        String expectedText = "Books";
        String actualText = driver.findElement(By.xpath("//h1[text()='Books']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    // 6 userShouldNavigateToJewelryPageSuccessfully
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        // click on the ‘Jewelry’ Tab
        WebElement clickOnBook = driver.findElement(By.partialLinkText("Jewelry"));
        clickOnBook.click();
        // Verify the text
        String expectedText = "Jewelry";
        String actualText = driver.findElement(By.xpath("//h1[text()='Jewelry']")).getText();
        Assert.assertEquals(expectedText, actualText);

    }

    // 7 userShouldNavigateToGiftCardsPageSuccessfully
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        // click on the ‘Gift Cards’ Tab
        WebElement clickOnBook = driver.findElement(By.partialLinkText("Gift Cards"));
        clickOnBook.click();
        // Verify the text
        String expectedText = "Gift Cards";
        String actualText = driver.findElement(By.xpath("//h1[text()='Gift Cards']")).getText();
        Assert.assertEquals(expectedText, actualText);

    }

    // Individual open and close
    @After
    public void tearDown() {
        closeBrowser();
    }

}