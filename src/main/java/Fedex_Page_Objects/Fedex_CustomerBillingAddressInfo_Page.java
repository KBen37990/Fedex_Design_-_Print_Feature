package Fedex_Page_Objects;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions_PageObjects;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fedex_CustomerBillingAddressInfo_Page extends Abstract_Class {

    ExtentTest logger;
    public Fedex_CustomerBillingAddressInfo_Page(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//End of constructor


    @FindBy(xpath = "//input[@name='billingName']")
    WebElement BillingName;

    @FindBy(xpath = "//input[@name='addressBilling1']")
    WebElement BillingAddress;

    @FindBy(xpath = "//select[@id='Country']")
    WebElement BillingCountry;

    @FindBy(xpath = "//input[@name='cityBilling']")
    WebElement BillingCity;

    @FindBy(xpath = "//select[@id='state_billing']")
    WebElement BillingState;

    @FindBy(xpath = "//input[@name='zipCode']")
    WebElement BillingZipCode;

    @FindBy(xpath = "//*[@id='checkout-show-rewiew']")
    WebElement ContinueFromBillingAddress;



    public void BillingName(String userValue){
        Reusable_Actions_PageObjects.sendKeysMethod(driver, BillingName, userValue, logger, "billing name.");
    }

    public void BillingAddress(String userValue){
        Reusable_Actions_PageObjects.sendKeysMethod(driver, BillingAddress, userValue, logger, "billing address.");
    }

    public void BillingCountry(String userValue){
        Reusable_Actions_PageObjects.dropdownByText(driver, BillingCountry, userValue, logger, "billing country.");
    }

    public void BillingCity(String userValue){
        Reusable_Actions_PageObjects.sendKeysMethod(driver, BillingCity, userValue, logger, "billing city.");
    }

    public void BillingState(String userValue){
        Reusable_Actions_PageObjects.dropdownByText(driver, BillingState, userValue, logger, "billing state.");
    }

    public void BillingZipCode(String userValue){
        Reusable_Actions_PageObjects.sendKeysMethod(driver, BillingZipCode, userValue, logger, "billing zip code.");
    }

    public void ContinueFromBillingAddress(){
        Reusable_Actions_PageObjects.clickOnElement(driver, ContinueFromBillingAddress, logger, "continue from billing address");
    }







}//End of java class
