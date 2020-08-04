package com.example.integra_s_android_client;


import android.text.TextUtils;

import java.util.logging.Handler;

public class LoginInteractor {
    interface OnLoginfinishedListener {
        void onUsernameError();
        void onLoginSucces(String username);
        void onLoginError();
    }
    public void canLogin(final String username, final OnLoginFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (TextUtils.isEmpty(username)) {
                    listener.username();
                    return;
                }
                if (username.equalsIgnoreCase("himanshu") {
                    listener.onLoginSuccess(username);
                    return;
                }
                listener.onLoginError();

            }
        }, 2000);
    }
}
