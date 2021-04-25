package Fedex_Page_Objects;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions_PageObjects;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fedex_Checkout_Procedure_Page extends Abstract_Class{

    ExtentTest logger;
    public Fedex_Checkout_Procedure_Page(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//End of constructor

    @FindBy(xpath = "//*[@id='radiusSelect']")
    WebElement SelectRange;

    @FindBy(xpath = "//*[@id='loc_seacrh_text']")
    WebElement EnterZipCode;

    @FindBy(xpath = "//*[@id='saveNContBtn']")
    WebElement ContinueFromPickup;

    @FindBy(xpath = "//*[@id='1122']")
    WebElement ClickOnFirstOption;

    @FindBy(xpath = "//*[@id='checkout-show-location']")
    WebElement ContinueFromLocationSelection;

    public void SelectRange(String userValue){
        Reusable_Actions_PageObjects.dropdownByText(driver, SelectRange, userValue ,logger, "range." );
    }

    public void EnterZipCode(String userValue){
        Reusable_Actions_PageObjects.sendKeysMethod(driver, EnterZipCode, userValue, logger, "zipcode.");
    }

    public void ContinueFromPickup(){
        Reusable_Actions_PageObjects.clickOnElement(driver, ContinueFromPickup, logger, "continue from pickup");
    }

    public void ClickOnFirstOption(){
        Reusable_Actions_PageObjects.clickOnElement(driver, ClickOnFirstOption, logger, "continue from pickup");
    }

    public void ContinueFromLocationSelection(){
        Reusable_Actions_PageObjects.clickOnElement(driver, ContinueFromLocationSelection, logger, "continue from location selection");
    }






}
