package Fedex_Page_Objects;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions_PageObjects;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fedex_SubmitOrder_Page extends Abstract_Class {

    ExtentTest logger;
    public Fedex_SubmitOrder_Page(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//End of constructor

    @FindBy(xpath = "//*[@id='terms-and-conditions']")
    WebElement AcceptTermsAndConditions;

    @FindBy(xpath = "//*[@id='submit-order-button']")
    WebElement ClickOnSubmitOrder;


    public void AcceptTermsAndConditions(){
        Reusable_Actions_PageObjects.clickOnElement(driver, AcceptTermsAndConditions, logger, "accept terms and conditions.");
    }

    public void ClickOnSubmitOrder(){
        Reusable_Actions_PageObjects.clickOnElement(driver, ClickOnSubmitOrder, logger, "submit order.");
    }






}//End of java class
