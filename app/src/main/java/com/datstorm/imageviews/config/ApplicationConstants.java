package com.datstorm.imageviews.config;

public interface ApplicationConstants {
    //13/04/2021...sai first push
    //19/04/2021...mahesh first push
    String BASE_URL = "http://52.172.28.161:5150/";
    String IMAGE_BASE_URL = "http://52.172.28.161:5150/ImageStorage/Load/";
    int TIMEOUT_VALUE = 60000;
    int PIN_TYPE_CONFIRM = 1;
    int PIN_TYPE_CREATE = 2;
    String MOBILE_NO = "mobileNo";
    String APPLICATION_DATA = "applicationData";
    String LOGGED_STATUS = "loggedStatus";
    String TITLE = "title";
    String CONTENT = "content";
    String OK_TEXT = "okText";
    String ACTION_TYPE = "actionType";
    String POSITIVE_TEXT = "positiveText";
    String NEGATIVE_TEXT = "negativeText";
    int FINISH_KEY = 1;
    /**
     * Confirm alert actions
     */
    int ACTION_IMEI_ALREADY_EXISTS = 1;
    int ACTION_VERIFY_MOBILE = 2;

    int USER_TYPE = 24;
    int DOMAIN_ID = 1;
    int COMPANY_ID = 1;
    int BRANCH_ID = 1;
    int STATUS = 6;
    int MY_PERMISSIONS_REQUEST_CAMERA = 100;
    int MY_PERMISSIONS_REQUEST_READ_EXTERNAL = 104;
    String LOGIN_TYPE = "3";
    String LOGIN_TYPE_PHONE = "1";

    float CORNER_RADIUS_BUTTON = 25f;
    float CORNER_RADIUS_CARD = 15f;
    float CORNER_RADIUS_NULL = 0f;

    /**
     * App Theme
     */
    String SPLASH_LOGO = "SplashLogo";
    String SPLASH_BG = "SplashBg";
    String GRADIENT_START_COLOR = "GradientStartColor";
    String GRADIENT_END_COLOR = "GradientEndColor";
    String WELCOME = "Welcome";
    String ITEM_SECTION_COLOR = "Color";
    String ITEM_SECTION_BUTTON = "Button";
    String SIGN_UP = "SignUp";
    String REGISTRATION = "Registration";
    String RESET_PASSWORD = "ResetPassword";
    String LOGIN = "Login";

    String REGISTRATION_SETTINGS = "registrationSettings";
    String COMP_ID = "compId";

    String DIRECTION = "Direction";
    String GRADIENT_DIRECTION = "GradientDirection";

    String BUTTON_DIRECTION = "Direction";
    String BUTTON_GRADIENT_DIRECTION = "GradientDirection";

    String ITEM_BUTTON_COLOR = "GradientStartColor";

    String ITEM_PRIMARY_COLOR = "GradientStartColor";
    String ITEM_SECTION_PRIMARY = "Color";

    String SECONDARY_COLOR = "GradientStartColor";
    String ITEM_SECTION_SECONDARY = "Color";

    String HEADER_BEAN = "headerBean";
    String DESC = "desc";
    String JSON1 = "json1";
    String JSON2 = "json2";
    String JSON3 = "json3";
    String HEADER_ARRAY_LIST = "headerArrayList";
    String LEVEL_ID = "levelId";
    String SEARCH_KEY_WORD = "searchKeyWord";
    String PREV_LEVEL_ID = "prevLevelId";
    String CATEGORY_ID = "categoryId";
    String WIDGET_TRANSITION_ID = "widgetTransitionId";
    String ADDRESS_ID = "addressId";

    String DOMAIN_ID_KEY = "domainIdKey";
    String COMP_ID_KEY = "compIdKey";
    String BRANCH_ID_KEY = "branchIdKey";
    String QR_SCAN_TYPE = "qrScanType";

    int DEFAULT_WISH_LIST_ID = 1;
    int GPS_REQUEST = 1001;
    int LOCATION_REQUEST = 1000;

    int COD_PAYMENT_STATUS = 4;
    int PAYMENT_GATEWAY_ID_COD = 1;
    int STAY_ALERT_KEY = 2;
    String ID_KEY = "idKey";
}
