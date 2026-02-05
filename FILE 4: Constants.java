package com.babamobileshop.helpers;

public class Constants {
    
    // API Base URL - अपना URL डालें
    public static final String BASE_URL = "https://yourdomain.com/api/";
    
    // App Settings
    public static final String APP_NAME = "Baba Mobile Shop";
    public static final String CURRENCY_SYMBOL = "₹";
    public static final String COUNTRY_CODE = "+91";
    
    // API Endpoints
    public static final String LOGIN = "login.php";
    public static final String REGISTER = "register.php";
    public static final String VERIFY_OTP = "verify_otp.php";
    public static final String RESEND_OTP = "resend_otp.php";
    public static final String GET_BANNERS = "get_banners.php";
    public static final String GET_CATEGORIES = "get_categories.php";
    public static final String GET_PRODUCTS = "get_products.php";
    public static final String GET_PRODUCT_DETAIL = "get_product_detail.php";
    public static final String ADD_TO_CART = "add_to_cart.php";
    public static final String GET_CART = "get_cart.php";
    public static final String UPDATE_CART = "update_cart.php";
    public static final String DELETE_CART = "delete_cart.php";
    public static final String ADD_TO_WISHLIST = "add_to_wishlist.php";
    public static final String GET_WISHLIST = "get_wishlist.php";
    public static final String REMOVE_WISHLIST = "remove_wishlist.php";
    public static final String PLACE_ORDER = "place_order.php";
    public static final String GET_ORDERS = "get_orders.php";
    public static final String GET_ORDER_DETAIL = "get_order_detail.php";
    public static final String TRACK_ORDER = "track_order.php";
    public static final String UPDATE_PROFILE = "update_profile.php";
    public static final String GET_PROFILE = "get_profile.php";
    public static final String GET_ADDRESS = "get_address.php";
    public static final String ADD_ADDRESS = "add_address.php";
    public static final String UPDATE_ADDRESS = "update_address.php";
    public static final String DELETE_ADDRESS = "delete_address.php";
    public static final String GET_NOTIFICATIONS = "get_notifications.php";
    public static final String SEARCH_PRODUCTS = "search_products.php";
    public static final String APPLY_COUPON = "apply_coupon.php";
    public static final String GET_COUPONS = "get_coupons.php";
    public static final String UPLOAD_PAYMENT_SCREENSHOT = "upload_payment.php";
    public static final String GET_APP_SETTINGS = "get_settings.php";
    public static final String SUBMIT_REFERRAL = "submit_referral.php";
    public static final String SEND_MESSAGE = "send_message.php";
    public static final String GET_MESSAGES = "get_messages.php";
    public static final String FORGOT_PASSWORD = "forgot_password.php";
    public static final String CHANGE_PASSWORD = "change_password.php";
    
    // SharedPreferences Keys
    public static final String PREF_NAME = "BabaMobileShopPref";
    public static final String KEY_IS_LOGGED_IN = "isLoggedIn";
    public static final String KEY_USER_ID = "userId";
    public static final String KEY_USER_NAME = "userName";
    public static final String KEY_USER_EMAIL = "userEmail";
    public static final String KEY_USER_PHONE = "userPhone";
    public static final String KEY_USER_IMAGE = "userImage";
    public static final String KEY_FCM_TOKEN = "fcmToken";
    public static final String KEY_DARK_MODE = "darkMode";
    public static final String KEY_LANGUAGE = "language";
    public static final String KEY_REFERRAL_CODE = "referralCode";
    public static final String KEY_CART_COUNT = "cartCount";
    public static final String KEY_WISHLIST_COUNT = "wishlistCount";
    
    // Order Status
    public static final String ORDER_PENDING = "pending";
    public static final String ORDER_CONFIRMED = "confirmed";
    public static final String ORDER_SHIPPED = "shipped";
    public static final String ORDER_DELIVERED = "delivered";
    public static final String ORDER_CANCELLED = "cancelled";
    
    // Payment Methods
    public static final String PAYMENT_COD = "cod";
    public static final String PAYMENT_UPI = "upi";
    public static final String PAYMENT_QR = "qr";
    
    // Intent Keys
    public static final String PRODUCT_ID = "product_id";
    public static final String CATEGORY_ID = "category_id";
    public static final String CATEGORY_NAME = "category_name";
    public static final String ORDER_ID = "order_id";
    public static final String ADDRESS_ID = "address_id";
    public static final String IMAGE_URL = "image_url";
    public static final String IMAGE_LIST = "image_list";
    public static final String POSITION = "position";
    
    // WhatsApp Number - अपना नंबर डालें
    public static final String WHATSAPP_NUMBER = "919999999999";
    public static final String SUPPORT_EMAIL = "support@babamobileshop.com";
    public static final String SUPPORT_PHONE = "+91 9999999999";
    
    // UPI Details - अपनी UPI ID डालें
    public static final String UPI_ID = "yourupi@paytm";
    public static final String UPI_NAME = "Baba Mobile Shop";
    
    // Pagination
    public static final int PAGE_SIZE = 20;
    
    // Request Codes
    public static final int REQUEST_PICK_IMAGE = 100;
    public static final int REQUEST_CAMERA = 101;
    public static final int REQUEST_LOCATION = 102;
    public static final int REQUEST_PAYMENT_SCREENSHOT = 103;
}
