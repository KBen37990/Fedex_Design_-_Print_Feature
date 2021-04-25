package Fedex_Page_Objects;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions_PageObjects;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.RunnableScheduledFuture;

public class Fedex_CustomerPaymentInfo_Page extends Abstract_Class {

    ExtentTest logger;
    public Fedex_CustomerPaymentInfo_Page(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//End of constructor

    @FindBy(xpath = "//select[@id='pol-select-card']")
    WebElement SelectCreditCardType;

    @FindBy(xpath = "//input[@id='frmCCNum']")
    WebElement InputCreditCardNumber;

    @FindBy(xpath = "//input[@id='csv_number']")
    WebElement InputSecurityCodeNumber;

    @FindBy(xpath = "//select[@id='selected_Month']")
    WebElement SelectExpirationMonth;

    @FindBy(xpath = "//select[@id='selected_Year']")
    WebElement SelectExpirationYear;

    @FindBy(xpath = "//input[@name='nameOnCard']")
    WebElement InputNameOnCreditCard;



    public void SelectCreditCardType(String userValue){
        Reusable_Actions_PageObjects.dropdownByText(driver, SelectCreditCardType, userValue, logger, "credit card type.");
    }

    public void InputCreditCardNumber(String userValue){
        Reusable_Actions_PageObjects.sendKeysMethod(driver, InputCreditCardNumber,userValue, logger, "credit card number.");
    }

    public void InputSecurityCodeNumber(String userValue){
        Reusable_Actions_PageObjects.sendKeysMethod(driver, InputSecurityCodeNumber,userValue, logger, "security code number.");
    }

    public void SelectExpirationMonth(String userValue){
        Reusable_Actions_PageObjects.dropdownByText(driver, SelectExpirationMonth, userValue, logger, "expiration month.");
    }

    public void SelectExpirationYear(String userValue){
        Reusable_Actions_PageObjects.dropdownByText(driver, SelectExpirationYear, userValue, logger, "expiration year.");
    }

    public void InputNameOnCreditCard(String userValue){
        Reusable_Actions_PageObjects.sendKeysMethod(driver, InputNameOnCreditCard, userValue, logger, "name on credit card");
    }













}
