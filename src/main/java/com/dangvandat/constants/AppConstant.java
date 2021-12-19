package com.dangvandat.constants;

public interface AppConstant {

    interface O2Constants {
        String CLIENT_ID = "client_id";
        String CLIENT_SECRET = "client_secret";
        String GRANT_TYPE_PASSWORD = "password";
        String AUTHORIZATION_CODE = "authorization_code";
        String REFRESH_TOKEN = "refresh_token";
        String IMPLICIT = "implicit";
        String SCOPE_READ = "read";
        String SCOPE_WRITE = "write";
        String TRUST = "openid";
        int ACCESS_TOKEN_VALIDITY_SECONDS = 8 * 60 * 60;
        int REFRESH_TOKEN_VALIDITY_SECONDS = 48 * 60 * 60;
        String HEADER_STRING = "Authorization";
        String TOKEN_PREFIX = "Bearer ";
        String USER_NAME = "user_name";
        String PHONE_NUMBER = "phone_number";
    }

    interface TOKEN {
        String USER_ID = "userId";
        String FULL_NAME = "fullName";
        String USER_NAME = "username";
        String EMAIL = "email";
    }

    interface ResourceServer {
        String RESOURCE_ID = "resource_id";
    }

    interface ACTIVE {
        int ACTIVE_STATUS = 1;
        int INACTIVE_STATUS = 0;
    }

    interface typePriceLevel {
        String TRIAL = "TRAIL";
        String CHARGE = "CHARGE";
    }

    interface statusSendFile {
        Integer SUCCESS = 1;
        Integer ERROR = 0;
    }

    interface deletedStatus {
        Integer ACTIVE = 1;
        Integer INACTIVE = 0;
    }

    interface MAIL {
        String user = "aeantsoftcu@gmail.com";
    }

    interface principalKey {
        String USER_NAME = "username";
        String USER_ID = "userId";
        String FULL_NAME = "fullName";
        String HEADER_TENANT_ID = "X-TenantId";
    }

    interface sendMail {
        String successPayPal = "success";
    }

    interface role {
        String ROLE_ADMIN = "ROLE_ADMIN";
        String ROLE_USER = "ROLE_USER";
    }

    interface message {
        interface student {
            String SAVE_SUCCESS = "SAVE STUDENT SUCCESSFULLY";
            String DELETE_SUCCESS = "DELETE STUDENT SUCCESSFULLY";
            String FIND_SUCCESS = "FIND STUDENT SUCCESSFULLY";
            String  UPDATE_SUCCESS = "UPDATE STUDENT SUCCESSFULLY";
        }
        interface user {
            String SAVE_USER_SUCCESS = "SAVE USER SUCCESS";
            String GET_ALL_USER_SUCCESS = "GET ALL USER SUCCESS";
            String GET_ALL_USER_BY_CONDITION_SUCCESS = "GET ALL USER BY CONDITION SUCCESS";
            String REGISTER_SUCCESS = "REGISTER SUCCESSFULLY";
        }
    }

    interface image {
        interface type {
            String PNG = "PNG";
        }
    }

    interface api {
        String payment = "http://localhost:8081/public/api/payment";

        interface realtime {
            String DEVICE = "/api/realtime/device";
            String DEVICE_WEB_PAGE = "/api/realtime/device/web/page";
        }
    }

    interface payment {
        String SUCCESS_MESSAGE = "PAYMENT SUCCESS";
    }

    interface twilio {
        String ACCOUNT_SID = "AC60c6a55d466223836800cd34d57e909a";
        String AUTH_TOKEN = "9e1a0d2dcfee0fed0657ae7959752948";
        String FROM_NUMBER = "+19198271861";
    }

    interface hostingRealTime{
        String HOST = "ws://112.213.87.159:9092/ws";
    }
}
