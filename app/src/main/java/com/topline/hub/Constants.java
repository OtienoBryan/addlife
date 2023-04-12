package com.topline.hub;

/**
 * Created by Otieno Bryan on 23/07/21.
 */

public class Constants {

   // e64a4f78be2256a38de080744dd5b117

    //private static final String ROOT_URL = "http://geojakltd.co.ke/impulse/mobile/v1/"; // this for live server
    private static final String ROOT_URL = "https://geojakltd.co.ke/caregivers/mobile/v1/";
    //private static final String ROOT_URL = "http://192.168.1.251:8080/Topline_project/topline/mobile/v1/";

    //public static final String URL_CATIMAGE = "http://boschsafarini.geojakltd.co.ke/mobile/v1/categories/";
    //public static final String URL_SUBCATIMAGE = "http://boschsafarini.geojakltd.co.ke/mobile/v1/sub_categories/";
    public static final String URL_IMAGE_UPLOAD = "https://geojakltd.co.ke/caregivers/admin/mobile_images.php?user_id=";
    public static final String URL_IMAGE_UPLOAD_REPORT = "https://geojakltd.co.ke/caregivers/admin/report_images.php";
    //public static final String URL_IMAGE_POSM_REPORT = "http://curlycare.co.ke/topline/admin/report_posm_images.php";

    public static final String URL_GETAPPOINTMENT = ROOT_URL+"getAppointment.php?clickeditem=";
    public static final String URL_TASK = ROOT_URL+"Tasks.php?clickeditem=";
    public static final String URL_TERMINATE_TASK = ROOT_URL+"terminateTask.php";
    public static final String URL_OUTLETS = ROOT_URL+"Outlets.php?clickeditem=";
    public static final String URL_MENTAL = ROOT_URL+"Mental.php?clickeditem=";
    public static final String URL_NUTRITION = ROOT_URL+"Nutrition.php?clickeditem=";
    public static final String URL_LIFE = ROOT_URL+"Life.php?clickeditem=";
    public static final String URL_OUTLETS_VISITED = ROOT_URL+"outletsVisited.php?clickeditem=";
    public static final String URL_CHECKIN = ROOT_URL+"checkin.php";
    public static final String URL_CANCEL = ROOT_URL+"cancelAppoint.php";
    public static final String URL_CHECKOUT = ROOT_URL+"checkout.php";
    public static final String URL_IMAGE_VALIDATION = ROOT_URL+"imageValidation.php";
    public static final String URL_VISIT_VALIDATION = ROOT_URL+"visitValidation.php";

    public static final String URL_ABOUT = ROOT_URL+"About.php?clickeditem=";
    public static final String URL_TERMS = ROOT_URL+"Terms.php?clickeditem=";
    public static final String URL_PRIVACY = ROOT_URL+"Privacy.php?clickeditem=";
    public static final String URL_TESTIMONIALS = ROOT_URL+"Testimonials.php?clickeditem=";

    public static final String URL_NOTICE = ROOT_URL+"Notice.php?clickeditem=";
    public static final String URL_PAY = ROOT_URL+"Pay.php?clickeditem=";
    public static final String URL_DAILY_REPORT = ROOT_URL+"clientDaily_report.php?clickeditem=";

    public static final String URL_RECURRING_UPDATE = ROOT_URL+"recurring_update.php";
    public static final String URL_ADD_APPOINTMENT = ROOT_URL+"appointment.php";


    public static final String URL_REGISTER = ROOT_URL+"registerUser.php";
    public static final String URL_LOGIN = ROOT_URL+"userLogin.php";


    public static final String URL_ACTIVATION = ROOT_URL+"userActivation.php";

    public static final String URL_NEW_DEALER = ROOT_URL+"newDealer.php";
    public static final String URL_NEW_USER = ROOT_URL+"newUser.php";

    public static final String URL_APPOINTMENT = ROOT_URL+"appointment.php";
    public static final String URL_LOCATION = ROOT_URL+"userLocation.php";

//    public static final String URL_NEW_DEALERQUESTION = ROOT_URL+"dealersQuestion.php";
//    public static final String URL_NEW_USERQUESTION = ROOT_URL+"usersQuestion.php";
//    public static final String URL_UPDATE_USERQUESTION = ROOT_URL+"updateUsersQuestion.php";
//    public static final String URL_UPDATE_DEALERQUESTION = ROOT_URL+"updateDealersQuestion.php";

    //public static final String URL_GET_DEALERS = ROOT_URL+"getDealers.php";
//    public static final String URL_ADDTOCART = ROOT_URL+"addCart.php";
//    public static final String URL_CART = ROOT_URL+"Cart.php?userId=";
//    public static final String URL_ORDERS = ROOT_URL+"Orders.php";
//    public static final String URL_DEALER_ORDERS = ROOT_URL+"DealerOrders.php";
//    public static final String URL_DELETECART = ROOT_URL+"DeleteCart.php";
//
//    public static final String URL_CONFIRM_ORDER = ROOT_URL+"confirmOrder.php";

 /// This URL FOR THE PUSH NOTIFICATION

 //public static final String URL_REGISTER_DEVICE = "http://192.168.0.15/FcmExample/RegisterDevice.php";
 public static final String URL_SEND_SINGLE_PUSH = ROOT_URL+"sendSinglePush.php";
    public static final String URL_SEND_RANGER_PUSH = ROOT_URL+"sendRangerPush.php";
 public static final String URL_SEND_MULTIPLE_PUSH = ROOT_URL+"sendMultiplePush.php";
 public static final String URL_FETCH_DEVICES = ROOT_URL+"GetRegisteredDevices.php";

 public static final String URL_FETCH_PRODUCT_CATEGORIES = ROOT_URL+"GetProductCategory.php?selecteditem=";
    public static final String URL_BRANDS = ROOT_URL+"GetProductBrands.php?selecteditem=";
    public static final String URL_SERVICE = ROOT_URL+"services.php?selecteditem=";
 public static final String URL_FETCH_PRODUCT_COMPETITOR = ROOT_URL+"GetProductCompetitor.php?selecteditem=";
    public static final String URL_FETCH_PROMOTIONS = ROOT_URL+"GetRegisteredPromotion.php";
    public static final String URL_COMPETITIVE_ACTIVITY = ROOT_URL+"competitiveActivity.php";
    public static final String URL_BIDCO_ACTIVITY = ROOT_URL+"bidcoActivity.php";
    public static final String URL_CLIENT_INQUIRY = ROOT_URL+"clientInquiry.php";
    public static final String URL_COMPE_ACTIVITY = ROOT_URL+"compeActivity.php";
    public static final String URL_POSM_REPORT = ROOT_URL+"posmReport.php";
    public static final String URL_PRODUCT_EXPIRY_REPORT = ROOT_URL+"product_expiryReport.php";
    public static final String URL_PRICE_WATCH_REPORT = ROOT_URL+"price_watchReport.php";
    public static final String URL_QUALITY_REPORT = ROOT_URL+"qualityReport.php";
    public static final String URL_MARKET_REPORT = ROOT_URL+"marketReport.php";
    public static final String URL_PROMOTION_ACTIVITY = ROOT_URL+"promotionReport.php";
    public static final String URL_STOCK_ACTIVITY = ROOT_URL+"stockReport.php";
    public static final String URL_SOSNEW_REPORT = ROOT_URL+"newSosReport.php";
    public static final String URL_SOS_REPORT = ROOT_URL+"sosReport.php";
    public static final String URL_PRODUCT_EXPIRY_REPORT_UPDATE = ROOT_URL+"product_expiryReport_update.php";
    public static final String URL_NEW_EXPIRY_REPORT_UPDATE = ROOT_URL+"new_expiryReport_update.php";

// public static final String URL_ORDER_HISTORY = ROOT_URL+"getOrders.php?clickeditem=";
// public static final String URL_ORDER_INFO = ROOT_URL+"getDealerOrders.php?clickeditem=";
// public static final String URL_USERFEEDBACK = ROOT_URL+"getUserFeedback.php?clickeditem=";
//    public static final String URL_DEALERFEEDBACK = ROOT_URL+"getDealerFeedback.php?clickeditem=";

////// FOR QUESTIONNAIRES
    public static final String URL_PRODUCT_CATEGORY = ROOT_URL+"productCategory.php?clickeditem=";
    public static final String URL_PRODUCTS = ROOT_URL+"Products.php?clickeditem=";
    public static final String URL_ASSETS = ROOT_URL+"Assets.php?clickeditem=";
    public static final String URL_STOCKS = ROOT_URL+"getStockCount.php?clickeditem=";
    public static final String URL_GET_APPROVAL = ROOT_URL+"getApproval.php?team=";
    public static final String URL_POST_APPROVAL = ROOT_URL+"postApproval.php";


    //APis by Bryan Otieno
    public static final String URL_ORDER = ROOT_URL+"postOrder.php";
    public static final String URL_DELIVERY = ROOT_URL+"postDelivery.php";
    public static final String URL_FOLLOWUP = ROOT_URL+"postFollowupAppointment.php";
    public static final String URL_OBJECTIVE = ROOT_URL+"postObjective.php";
    public static final String URL_COACHING= ROOT_URL+"postCoaching.php";
    public static final String URL_MPA_PRODUCTS = ROOT_URL+"getMpa.php";
    public static final String URL_MPA = ROOT_URL+"postMpa.php";
    public static final String URL_NPL = ROOT_URL+"postNPL.php";
    public static final String URL_AVAILABILITY = ROOT_URL+"postAvailability.php";
    public static final String URL_REPORT_ORDER = ROOT_URL+"postTeamleaderOrder.php";
    public static final String URL_REPORT_DELIVERY = ROOT_URL+"postTeamleaderDelivery.php";
    public static final String URL_REPORT_BA = ROOT_URL+"postBa.php";
    public static final String URL_MY_PRODUCTS = ROOT_URL+"Products.php?clickeditem=";






}
