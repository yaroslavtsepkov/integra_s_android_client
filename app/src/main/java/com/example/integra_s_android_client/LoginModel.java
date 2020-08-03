package com.example.integra_s_android_client;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.integra_s_android_client.IPresenters.ILoginPresenter;

public class LoginModel extends AppCompatActivity implements ILoginView, View.OnClickListener {
    private TextView ip;
    private EditText username;
    private Button doLogin;
    private ILoginPresenter loginPresenter;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        //find view
         ip = (TextView) this.findViewById(R.id.textViewIp);
         username = (EditText) this.findViewById(R.id.editTextUsername);
         doLogin = (Button) this.findViewById(R.id.imageButtonDoLogin);

            //set listener
        doLogin.setOnClickListener(this);

            //init
            loginPresenter = new LoginPresenterCompl(this);
            loginPresenter.setProgressBarVisiblity(View.INVISIBLE);
        }

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.imageButtonDoLogin:
                    loginPresenter.setProgressBarVisiblity(View.VISIBLE);
                    doLogin.setEnabled(false);
                    loginPresenter.doLogin(username.getText().toString());
                    break;
            }
        }


        @Override
        public void onLoginResult(Boolean result, int code) {
            loginPresenter.setProgressBarVisiblity(View.INVISIBLE);
            btnLogin.setEnabled(true);
            btnClear.setEnabled(true);
            if (result){
                Toast.makeText(this,"Login Success",Toast.LENGTH_SHORT).show();
            }
            else
                Toast.makeText(this,"Login Fail, code = " + code,Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onDestroy() {
            super.onDestroy();
        }

        @Override
        public void onSetProgressBarVisibility(int visibility) {
            progressBar.setVisibility(visibility);
        }
    }
}
