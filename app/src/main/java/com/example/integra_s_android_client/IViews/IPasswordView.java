package com.example.integra_s_android_client.IViews;

public interface IPasswordView {
    void setPasswordError();
    void showProgressbar();
    void hideProgressbar();
    void onPasswordSuccess(String password);
}
