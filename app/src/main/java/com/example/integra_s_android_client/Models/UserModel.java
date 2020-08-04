package com.example.integra_s_android_client.Models;

import com.example.integra_s_android_client.IModels.IUser;

public class UserModel implements IUser {

    String username;
    String password;

    public UserModel(String username, String password){
        this.username = username;
        this.password = password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public int checkUserValidity(String name, String passwd){
        if (username==null||password==null||!username.equals(getUsername())||!password.equals(getPassword())){
            return -1;
        }
        return 0;
    }
}
