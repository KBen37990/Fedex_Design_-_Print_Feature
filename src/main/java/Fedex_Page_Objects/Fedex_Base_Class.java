package Fedex_Page_Objects;

import ReusableLibrary.Abstract_Class;

public class Fedex_Base_Class extends Abstract_Class {

    public static Fedex_UploadDocument_Page Fedex_UploadDocument(){
        Fedex_UploadDocument_Page Fedex_UploadDocument = new Fedex_UploadDocument_Page(driver);
        return Fedex_UploadDocument;
    }//End of fedex start order method

    public static Fedex_AddDocumentToCart_Page Fedex_AddDocumentToCart(){
        Fedex_AddDocumentToCart_Page Fedex_AddDocumentToCart = new Fedex_AddDocumentToCart_Page(driver);
        return Fedex_AddDocumentToCart;
    }//End of fedex checkout method

    public static Fedex_Checkout_Procedure_Page Fedex_Checkout_Procedure(){
        Fedex_Checkout_Procedure_Page Fedex_Checkout_Procedure = new Fedex_Checkout_Procedure_Page(driver);
        return Fedex_Checkout_Procedure;
    }//End of fedex check out method

    public static Fedex_CustomerContactInfo_Page Fedex_CustomerContactInfo(){
        Fedex_CustomerContactInfo_Page Fedex_CustomerContactInfo = new Fedex_CustomerContactInfo_Page(driver);
        return Fedex_CustomerContactInfo;
    }//End of fedex customer data method

    public static Fedex_CustomerPaymentInfo_Page Fedex_CustomerPaymentInfo(){
        Fedex_CustomerPaymentInfo_Page Fedex_CustomerPaymentInfo = new Fedex_CustomerPaymentInfo_Page(driver);
        return Fedex_CustomerPaymentInfo;
    }//End of fedex customer data method

    public static Fedex_CustomerBillingAddressInfo_Page Fedex_CustomerBillingAddressInfo(){
        Fedex_CustomerBillingAddressInfo_Page Fedex_CustomerBillingAddressInfo = new Fedex_CustomerBillingAddressInfo_Page(driver);
        return Fedex_CustomerBillingAddressInfo;
    }//End of fedex customer billing data method

    public static Fedex_SubmitOrder_Page Fedex_SubmitOrder(){
        Fedex_SubmitOrder_Page Fedex_SubmitOrder = new Fedex_SubmitOrder_Page(driver);
        return Fedex_SubmitOrder;
    }//End of fedex submit order method

    public static Fedex_CaptureErrorMessage_Page Fedex_CaptureErrorMessage(){
        Fedex_CaptureErrorMessage_Page Fedex_CaptureErrorMessage = new Fedex_CaptureErrorMessage_Page(driver);
        return Fedex_CaptureErrorMessage;
    }//End of fedex error message method



}
