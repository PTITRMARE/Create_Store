package Page;

import Utilities.BaseLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StorePage extends BaseLibrary {
    WebDriver driver;

    @FindBy(xpath = "//input[@name='userName']")
    private WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    @FindBy(xpath="//button[@id='dropdownBasic1']")
    private WebElement dropdownUserName;

    @FindBy(xpath = "//input[@role='combobox']")
    private WebElement CompanyField;

    @FindBy(xpath = "//span[normalize-space()='Store']")
    private WebElement store;

    @FindBy(xpath = "//button[contains(text(),'Add Store')]")
    private WebElement addStore;

    @FindBy(xpath = "//input[@placeholder='Store Name']")
    private WebElement storename;

    @FindBy(xpath = "//input[@id='storeAddressLine1']")
    private WebElement storeaddress;

    @FindBy(xpath = "//input[@id='phoneNo']")
    private WebElement storePhoneNumber;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement storeEmail;

    @FindBy(xpath = "//select[@id='posSystem']")
    private WebElement BackOfficeInterface;

    @FindBy(xpath = "//input[@placeholder='POS']")
    private WebElement posDropDown;

    @FindBy(xpath = "//div[@class='row']//div[@class='col-sm-4']")
    private WebElement Storesave;

    public StorePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getUsernameField() {
        return username;
    }

    public WebElement getPasswordField() {
        return password;
    }
    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getCompanyUser(){
        return dropdownUserName;
    }
    public WebElement getCompanyField() {
        return CompanyField;
    }

    public WebElement getStore() {
        return store;
    }
    public WebElement getaddStore() {return addStore;}
    public WebElement getStoreName() {
        return storename;
    }
    public WebElement getStoreAddress() {
        return storeaddress;
    }
    public WebElement getStorePhoneNumber() {
        return storePhoneNumber;
    }
    public WebElement getStoreEmail() {
        return storeEmail;
    }
    public WebElement getposDropDown() {
        return posDropDown;
    }
    public WebElement getStoresave() {
        return Storesave;
    }

}
