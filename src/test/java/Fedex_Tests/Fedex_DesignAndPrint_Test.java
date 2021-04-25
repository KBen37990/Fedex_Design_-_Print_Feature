package Fedex_Tests;

import Fedex_Page_Objects.Fedex_Base_Class;
import ReusableLibrary.Abstract_Class;

import org.testng.annotations.Test;

public class Fedex_DesignAndPrint_Test extends Abstract_Class {

    @Test
    public void Fedex_DesignAndPrintFeature() throws InterruptedException {

        //Navigating to fedex page
        driver.navigate().to("https://www.fedex.com/en-us/home.html");
        Thread.sleep(2000);


        //Navigate to the upload image page
        Fedex_Base_Class.Fedex_UploadDocument().ClickOnDesignAndPrintMenu();
        Thread.sleep(1000);
        Fedex_Base_Class.Fedex_UploadDocument().ClickOnUploadAPrintReadyFile();
        Thread.sleep(7000);
        Fedex_Base_Class.Fedex_UploadDocument().ClickOnDocumentPrinting();
        Thread.sleep(2000);
        Fedex_Base_Class.Fedex_UploadDocument().AssertTitle();
        Fedex_Base_Class.Fedex_UploadDocument().ClickOnCopiesAndCustomProjects();
        Thread.sleep(5000);


        //Input the absolute path of the image to be uploaded to fedex below
        Fedex_Base_Class.Fedex_UploadDocument().SelectFIle("C:\\Users\\Bleron\\Desktop\\Bobby.png");
        Thread.sleep(3000);


        //Add customer image to cart and checkout
        Fedex_Base_Class.Fedex_AddDocumentToCart().CloseResolutionWarning();
        Thread.sleep(2000);
        Fedex_Base_Class.Fedex_AddDocumentToCart().ChangeQuantity("5");
        Thread.sleep(1000);
        Fedex_Base_Class.Fedex_AddDocumentToCart().AddPrintsToCart();
        Thread.sleep(3000);
        Fedex_Base_Class.Fedex_AddDocumentToCart().ClickOnCheckout();
        Fedex_Base_Class.Fedex_AddDocumentToCart().ClickOnContinueAsGuest();
        Thread.sleep(1000);
        Fedex_Base_Class.Fedex_Checkout_Procedure().SelectRange("5 Miles");
        Fedex_Base_Class.Fedex_Checkout_Procedure().EnterZipCode("11372");
        Fedex_Base_Class.Fedex_Checkout_Procedure().ContinueFromPickup();
        Thread.sleep(3000);
        Fedex_Base_Class.Fedex_Checkout_Procedure().ClickOnFirstOption();
        Thread.sleep(1000);
        Fedex_Base_Class.Fedex_Checkout_Procedure().ContinueFromLocationSelection();


        //Beginning of customer contact information
        Fedex_Base_Class.Fedex_CustomerContactInfo().InputCustomerFirstName("Bobby");
        Fedex_Base_Class.Fedex_CustomerContactInfo().InputCustomerLastName("Shmurda");
        Fedex_Base_Class.Fedex_CustomerContactInfo().InputCustomerEmail("BobbyShmurda@gmail.com");
        Fedex_Base_Class.Fedex_CustomerContactInfo().InputCustomerPhoneNumber("6789998212");
        Thread.sleep(1500);
        Fedex_Base_Class.Fedex_CustomerContactInfo().ContinueFromContactInformation();
        //End of customer contact information


        //Beginning of customer payment information section
        Fedex_Base_Class.Fedex_CustomerPaymentInfo().SelectCreditCardType("VISA");
        Thread.sleep(1000);
        Fedex_Base_Class.Fedex_CustomerPaymentInfo().InputCreditCardNumber("4532712026781780");
        Fedex_Base_Class.Fedex_CustomerPaymentInfo().InputSecurityCodeNumber("542");
        Fedex_Base_Class.Fedex_CustomerPaymentInfo().SelectExpirationMonth("09");
        Fedex_Base_Class.Fedex_CustomerPaymentInfo().SelectExpirationYear("2023");
        Fedex_Base_Class.Fedex_CustomerPaymentInfo().InputNameOnCreditCard("Bobby Shmurda");
        //End of customer payment information section


        //Beginning of customer billing address section
        //Fedex_Base_Class.Fedex_CustomerBillingAddressInfo().BillingName("Bobby Shmurda");
        Fedex_Base_Class.Fedex_CustomerBillingAddressInfo().BillingName("Bobby Shmurda");
        Fedex_Base_Class.Fedex_CustomerBillingAddressInfo().BillingAddress("3740  Bell Street");
        Fedex_Base_Class.Fedex_CustomerBillingAddressInfo().BillingCountry("United States");
        Fedex_Base_Class.Fedex_CustomerBillingAddressInfo().BillingCity("New York");
        Fedex_Base_Class.Fedex_CustomerBillingAddressInfo().BillingState("NY");
        Fedex_Base_Class.Fedex_CustomerBillingAddressInfo().BillingZipCode("10004");
        Thread.sleep(1000);
        Fedex_Base_Class.Fedex_CustomerBillingAddressInfo().ContinueFromBillingAddress();
        //End of customer billing address section


        //Beginning of submit order section
        Fedex_Base_Class.Fedex_SubmitOrder().AcceptTermsAndConditions();
        Fedex_Base_Class.Fedex_SubmitOrder().ClickOnSubmitOrder();
        Thread.sleep(3000);
        //End of submit order section


        //Beginning of capture error message section
        String errorMessage = Fedex_Base_Class.Fedex_CaptureErrorMessage().CaptureErrorMessage();
        System.out.println("Error message: " + errorMessage);


    }//End of fedex design and print test
}//End of java class











        //Fedex_Base_Class.Fedex_UploadDocument().VerifyTitle("FedEx Office Print Online");
        /*
        SoftAssert softAssertion = new SoftAssert();
        softAssertion.assertEquals("FedEx Office Print Online",driver.getTitle());
        softAssertion.assertAll();
        */

        //Fedex_Base_Class.Fedex_UploadCustomPrint().ClickOnCustomPrint();

