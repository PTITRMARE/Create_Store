package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import Page.StorePage;

import Utilities.BaseLibrary;  // create this helper
public class StoreSteps {

    WebDriver driver = BaseLibrary.getDriver();  // centralized management
    StorePage storePage = new StorePage(driver);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//login
    @Given("User opens the CStoreIQ website")
    public void user_opens_the_c_store_iq_website() {
        driver.get("https://devcsiqbo.cstoreiq.com/#/login");
    }

    @Then("User enters username as {string}")
    public void user_enters_username_as(String username) {
        wait.until(ExpectedConditions.visibilityOf(storePage.getUsernameField()))
                .sendKeys(username);
    }

    @Then("User enters password as {string}")
    public void user_enters_password_as(String password) {
        storePage.getPasswordField().sendKeys(password);
    }

    @Then("User clicks on login button")
    public void user_clicks_on_login_button() {
        storePage.getLoginButton().click();
    }
  // select Company
    @Given("User is able to select a company")
    public void selectCompany() throws InterruptedException {
        Thread.sleep(3000);
        storePage.getCompanyUser().click();
    }
    @Then("User enters the company name as {string}")
    public void companyName(String user) throws InterruptedException {
        Thread.sleep(3000);
        storePage.getCompanyField().click();
        storePage.getCompanyField().sendKeys(user + Keys.ENTER);
    }
    // select the store
    @And("User clicks on the store module")
    public void store() throws InterruptedException {
        Thread.sleep(5000);
        storePage.getStore().click();
    }
    @Then("User clicks on the AddStore button")
    public void addStore() throws InterruptedException {
        Thread.sleep(8000);
        storePage.getaddStore().click();
    }
    @Then("User enters the store name")
    public void storeName() throws InterruptedException {
        Thread.sleep(8000);
        String storeName = "rantmart";// Unique name
        System.out.println(storeName);
        storePage.getStoreName().sendKeys(storeName);
    }
    @And("User enters the store address")
    public void storeAddress() throws InterruptedException {
        Thread.sleep(3000);
        WebElement addressInput = driver.findElement(By.name("storeAddressLine1"));
        addressInput.sendKeys("USAA");
        Thread.sleep(2000);
        addressInput.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(500);
        addressInput.sendKeys(Keys.ENTER);
    }
    @Then("User enters the store phone number as {string} and store email as {string}")
    public void storeDetails(String storeNumber, String storeEmail) throws InterruptedException {
        Thread.sleep(5000);
        storePage.getStorePhoneNumber().sendKeys(storeNumber);
        storePage.getStoreEmail().sendKeys(storeEmail);
    }
    @And("User is able to select the Company Back Office Interface")
    public void companyBackOfficeInterfaceDropdown() throws InterruptedException {
        Thread.sleep(3000);
        WebElement dropdown = driver.findElement(By.id("posSystem"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Back Office");
    }
    @Then("User is able to select POS and MNSP device")
    public void selectPOSSystemConfig() throws InterruptedException {
        Thread.sleep(4000);
        WebElement POS = driver.findElement(By.xpath("//ng-select[@placeholder='POS']//div[@class='ng-input']"));
        POS.click();
        Thread.sleep(4000);
        WebElement verifonRuby2dropdown = driver.findElement(By.xpath("//span[contains(text(), 'Verifone Ruby2')]"));
        verifonRuby2dropdown.click();
        Thread.sleep(4000);
        WebElement MNSP = driver.findElement(By.xpath("//ng-select[@placeholder='Mnsp device']//div[@class='ng-select-container']"));
        MNSP.click();
        Thread.sleep(4000);
        WebElement MNSPdropdown = driver.findElement(By.xpath("//span[contains(text(), 'TNSI')]"));
        MNSPdropdown.click();
    }
    @And("User clicks on the StoreSave button")
    public void storeSave() throws InterruptedException {
        Thread.sleep(4000);
        storePage.getStoresave().click();
    }
}