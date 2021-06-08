package com.datstorm.imageviews.config;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Constant {
    @IntDef(value = {SortType.PHONE_VERIFICATION_PENDING, SortType.SAME_DEVICE_ID_EXISTS, SortType.API_SUCCESS, SortType.CREATED, SortType.LOGIN_SUCCESS, SortType.UPDATED})
    @Retention(RetentionPolicy.SOURCE)
    public @interface SortType {
        int PHONE_VERIFICATION_PENDING = 409;
        int SAME_DEVICE_ID_EXISTS = 402;
        int LOGIN_SUCCESS = 403;
        int SUCCESS = 200;
        int NO_DATA = 204;
        int API_SUCCESS = 0;
        int CREATED = 6001;
        int REMOVED = 6004;
        int ADDED_TO_CART = 6001;
        int UPDATED = 6003;
        int PHONE_VERIFICATION_PENDING_IN_MAIL_AND_PASSWORD_SIGN_IN = 6009;
    }

    @IntDef(value = {QR_SCAN_TYPE.PRE_REGISTER, QR_SCAN_TYPE.POST_REGISTER, QR_SCAN_TYPE.UPDATE_PRIVILEGE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface QR_SCAN_TYPE {
        int PRE_REGISTER = 1;
        int POST_REGISTER = 2;
        int UPDATE_PRIVILEGE = 3;
    }

    @IntDef(value = {REGISTRATION_TYPE.NOT_REGISTERED_QR_SCANNING_COMPLETED, REGISTRATION_TYPE.REGISTERED_SETTING_NOT_COMPLETED, REGISTRATION_TYPE.REGISTERED})
    @Retention(RetentionPolicy.SOURCE)
    public @interface REGISTRATION_TYPE {
        int NOT_REGISTERED_QR_SCANNING_COMPLETED = 1;
        int REGISTERED_SETTING_NOT_COMPLETED = 2;
        int REGISTERED = 3;
        int SKIPPED_QR = 4;
    }
}