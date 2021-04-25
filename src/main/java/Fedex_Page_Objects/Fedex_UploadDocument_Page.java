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
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.awt.datatransfer.StringSelection;

public class Fedex_UploadDocument_Page extends Abstract_Class {

    ExtentTest logger;
    public Fedex_UploadDocument_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Abstract_Class.logger;
    }//End of constructor class

    @FindBy(xpath = "//*[@aria-label='Open Design & Print menu']")
    WebElement ClickOnDesignAndPrintMenu;

    @FindBy(xpath = "//*[@aria-label='Upload a Print-Ready File']")
    WebElement ClickOnUploadAPrintReadyFile;

    @FindBy(xpath = "//*[text()='Document Printing']")
    WebElement ClickOnDocumentPrinting;

    @FindBy(xpath = "//*[@title='Copies & Custom Projects']")
    WebElement ClickOnCopiesAndCustomProjects;


    public void ClickOnDesignAndPrintMenu(){
        Reusable_Actions_PageObjects.clickOnElement(driver, ClickOnDesignAndPrintMenu, logger, "design and print.");
    }

    public void ClickOnUploadAPrintReadyFile(){
        Reusable_Actions_PageObjects.clickOnElement(driver, ClickOnUploadAPrintReadyFile, logger, "explore print products");
    }

    public void ClickOnDocumentPrinting(){
        Reusable_Actions_PageObjects.clickOnElement(driver, ClickOnDocumentPrinting, logger, "document printing");
    }
    public void ClickOnCopiesAndCustomProjects(){
        Reusable_Actions_PageObjects.clickOnElement(driver, ClickOnCopiesAndCustomProjects, logger, "copies and custom projects");
    }


    public void AssertTitle(){
        String actualTitle = driver.getTitle();
        SoftAssert softAssertion = new SoftAssert();
        try {
            softAssertion.assertEquals("FedEx Office Print Online", driver.getTitle());
            logger.log(LogStatus.PASS, "Page title matches: "+ actualTitle);
        }catch (Exception e){
            logger.log(LogStatus.FAIL, "Title does not match with: " + actualTitle + e);
            Reusable_Actions_PageObjects.getScreenShot(driver, "Page title", logger);
        }
        softAssertion.assertAll();
    }



    //Method for selecting size
    public void SelectFIle(String fileLocation){
        StringSelection stringSelection = new StringSelection(fileLocation);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        WebDriverWait wait = new WebDriverWait (driver, 8);
        try{
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name='upload-files-button']"))).click();
            Reusable_Actions_PageObjects.uploadFile(fileLocation);
            logger.log(LogStatus.PASS, "Successfully uploaded file: " + fileLocation);
        } catch (Exception e) {
            logger.log(LogStatus.FAIL, "Unable to upload file: " + fileLocation + e);
            Reusable_Actions_PageObjects.getScreenShot(driver, "Size", logger);
        }
    }//End of select size method








}//End of java class
