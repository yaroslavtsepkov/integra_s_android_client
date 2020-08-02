package com.example.integra_s_android_client;

public interface IUser {
    public String getUsername();
    public String getPassword();
    int checkUserValidity(String username, String password);
}
