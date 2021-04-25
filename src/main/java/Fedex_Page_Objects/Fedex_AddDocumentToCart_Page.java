package Fedex_Page_Objects;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions_PageObjects;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fedex_AddDocumentToCart_Page extends Abstract_Class {

    ExtentTest logger;
    public Fedex_AddDocumentToCart_Page(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//End of constructor class

    @FindBy(xpath = "//*[@class='button__ok']")
    WebElement CloseResolutionWarning;

    @FindBy(xpath = "//*[@class='quantity-field']")
    WebElement ChangeQuantity;

    @FindBy(xpath = "//button[text()='Add to cart']")
    WebElement AddPrintsToCart;

    @FindBy(xpath = "//*[@id='cartToCheckoutBtn']")
    WebElement ClickOnCheckout;

    @FindBy(xpath = "//*[@id='continueAsGuest']")
    WebElement ClickOnContinueAsGuest;

    public void CloseResolutionWarning(){
        Reusable_Actions_PageObjects.clickOnElement(driver, CloseResolutionWarning, logger, "continue with existing");
    }

    public void ChangeQuantity(String userValue){
        Reusable_Actions_PageObjects.sendKeysMethod(driver, ChangeQuantity, userValue ,logger, "Quantity has been updated.");
    }

    public void AddPrintsToCart(){
        Reusable_Actions_PageObjects.clickOnElement(driver, AddPrintsToCart, logger, "add to cart");
    }

    public void ClickOnCheckout(){
        Reusable_Actions_PageObjects.clickOnElement(driver, ClickOnCheckout, logger, "checkout");
    }

    public void ClickOnContinueAsGuest(){
        Reusable_Actions_PageObjects.clickOnElement(driver, ClickOnContinueAsGuest, logger, "continue as guest");
    }



}//End of java class
