package com.babamobileshop.helpers;

import android.content.Context;
import android.content.SharedPreferences;

public class SessionManager {
    
    private SharedPreferences pref;
    private SharedPreferences.Editor editor;
    private Context context;
    
    public SessionManager(Context context) {
        this.context = context;
        pref = context.getSharedPreferences(Constants.PREF_NAME, Context.MODE_PRIVATE);
        editor = pref.edit();
    }
    
    // Login Session
    public void createLoginSession(String userId, String name, String email, 
                                   String phone, String image, String referralCode) {
        editor.putBoolean(Constants.KEY_IS_LOGGED_IN, true);
        editor.putString(Constants.KEY_USER_ID, userId);
        editor.putString(Constants.KEY_USER_NAME, name);
        editor.putString(Constants.KEY_USER_EMAIL, email);
        editor.putString(Constants.KEY_USER_PHONE, phone);
        editor.putString(Constants.KEY_USER_IMAGE, image);
        editor.putString(Constants.KEY_REFERRAL_CODE, referralCode);
        editor.apply();
    }
    
    // Check Login
    public boolean isLoggedIn() {
        return pref.getBoolean(Constants.KEY_IS_LOGGED_IN, false);
    }
    
    // Get User ID
    public String getUserId() {
        return pref.getString(Constants.KEY_USER_ID, "");
    }
    
    // Get User Name
    public String getUserName() {
        return pref.getString(Constants.KEY_USER_NAME, "");
    }
    
    // Get User Email
    public String getUserEmail() {
        return pref.getString(Constants.KEY_USER_EMAIL, "");
    }
    
    // Get User Phone
    public String getUserPhone() {
        return pref.getString(Constants.KEY_USER_PHONE, "");
    }
    
    // Get User Image
    public String getUserImage() {
        return pref.getString(Constants.KEY_USER_IMAGE, "");
    }
    
    // Get Referral Code
    public String getReferralCode() {
        return pref.getString(Constants.KEY_REFERRAL_CODE, "");
    }
    
    // Update User Name
    public void updateUserName(String name) {
        editor.putString(Constants.KEY_USER_NAME, name);
        editor.apply();
    }
    
    // Update User Email
    public void updateUserEmail(String email) {
        editor.putString(Constants.KEY_USER_EMAIL, email);
        editor.apply();
    }
    
    // Update User Image
    public void updateUserImage(String image) {
        editor.putString(Constants.KEY_USER_IMAGE, image);
        editor.apply();
    }
    
