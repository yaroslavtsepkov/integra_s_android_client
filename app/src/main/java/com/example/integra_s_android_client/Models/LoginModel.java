package com.example.integra_s_android_client.Models;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.integra_s_android_client.IViews.ILoginView;
import com.example.integra_s_android_client.Presenters.LoginPresenter;
import com.example.integra_s_android_client.R;

public class LoginModel extends AppCompatActivity implements ILoginView {

    EditText username;
    ProgressBar progressBar;

    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        initViews();
        //loginPresenter = new LoginPresenter(this, new LoginInteractor());
    }

    void initViews(){
        username = findViewById(R.id.editTextUsername);
        //progressBar = findViewById(R.id.loginProgressBar);
    }

//    public void loginMe(View view){
//        showProgrssbar();
//
//    }

    @Override
    public void setUsernameError() {
        //hideProgressbar();
        username.setError("Username can't be empty!");

    }

    @Override
    public void showProgressbar() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgressbar() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void onLoginSuccess(String username) {
        //
    }
}