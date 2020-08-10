package com.example.integra_s_android_client.Presenters;

import android.os.Looper;

import com.example.integra_s_android_client.IPresenters.ILoginPresenter;
import com.example.integra_s_android_client.IModels.IUser;
import com.example.integra_s_android_client.IViews.ILoginView;
import com.example.integra_s_android_client.Models.UserModel;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class LoginPresenterCompl implements ILoginPresenter {

        ILoginView iLoginView;
        IUser user;
        Handler handler;

        public LoginPresenterCompl(ILoginView iLoginView) {
            this.iLoginView = iLoginView;
            initUser();
            handler = new Handler(Looper.getMainLooper()) {
                @Override
                public void publish(LogRecord logRecord) {

                }

                @Override
                public void flush() {

                }

                @Override
                public void close() throws SecurityException {

                }
            };
        }


        @Override
        public void doLogin(String name, String passwd) {
            Boolean isLoginSuccess = true;
            final int code = user.checkUserValidity(name,passwd);
            if (code!=0) isLoginSuccess = false;
            final Boolean result = isLoginSuccess;
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    iLoginView.onLoginResult(result, code);
                }
            }, 5000);
        }

        @Override
        public void setProgressBarVisiblity(int visiblity){
            iLoginView.onSetProgressBarVisibility(visiblity);
        }

        private void initUser(){
            user = new UserModel("test","test");
        }
    }
}
