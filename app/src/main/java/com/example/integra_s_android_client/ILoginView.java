package com.example.integra_s_android_client;

public interface ILoginView {
    void setUsernameError();
    void showProgressbar();
    void hideProgressbar();
    void onLoginSuccess(String username);
}
