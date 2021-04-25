package Fedex_Page_Objects;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions_PageObjects;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fedex_CaptureErrorMessage_Page extends Abstract_Class {

    ExtentTest logger;
    public Fedex_CaptureErrorMessage_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Abstract_Class.logger;
    }//End of constructor

    @FindBy(xpath = "//div[@class='notice__text notice__text_error']")
    WebElement CaptureErrorMessage;

    public String CaptureErrorMessage(){
        String result = Reusable_Actions_PageObjects.captureText(driver, CaptureErrorMessage, 0,  logger, "error message");
        logger.log(LogStatus.INFO, "Error Message", result);
        return result;
    }


}//End of java class
