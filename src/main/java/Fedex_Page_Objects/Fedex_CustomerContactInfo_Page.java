package Fedex_Page_Objects;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions_PageObjects;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fedex_CustomerContactInfo_Page extends Abstract_Class {

    ExtentTest logger;
    public Fedex_CustomerContactInfo_Page(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//End of java class

    @FindBy(xpath = "//input[@name='CustFirstName']")
    WebElement InputCustomerFirstName;

    @FindBy(xpath = "//input[@name='CustLastName']")
    WebElement InputCustomerLastName;

    @FindBy(xpath = "//input[@name='CustPhone']")
    WebElement InputCustomerPhoneNumber;

    @FindBy(xpath = "//input[@name='CustEmail']")
    WebElement InputCustomerEmail;

    @FindBy(xpath = "//*[@id='checkout-show-payment']")
    WebElement ContinueFromContactInformation;

    public void InputCustomerFirstName(String userValue){
        Reusable_Actions_PageObjects.sendKeysMethod(driver, InputCustomerFirstName, userValue, logger, "first name");
    }

    public void InputCustomerLastName(String userValue){
        Reusable_Actions_PageObjects.sendKeysMethod(driver, InputCustomerLastName, userValue, logger, "first name");
    }

    public void InputCustomerPhoneNumber(String userValue){
        Reusable_Actions_PageObjects.sendKeysMethod(driver, InputCustomerPhoneNumber, userValue, logger, "first name");
    }

    public void InputCustomerEmail(String userValue){
        Reusable_Actions_PageObjects.sendKeysMethod(driver, InputCustomerEmail, userValue, logger, "first name");
    }

    public void ContinueFromContactInformation(){
        Reusable_Actions_PageObjects.clickOnElement(driver, ContinueFromContactInformation, logger, "continue from contact information");
    }






}
