package com.learnMVP.architect.module.login;

import android.content.Context;
import android.content.SharedPreferences;

import com.learnMVP.architect.module.Constants;

public class LoginPresenter implements LoginContract.Presenter {

    private final LoginContract.View view;
    private final SharedPreferences sharedPreferences;

    public LoginPresenter(LoginContract.View view, Context context) {
        this.sharedPreferences = context.getSharedPreferences(Constants.PREFERENCE_KEY, Context.MODE_PRIVATE);
        this.view = view;
    }

    @Override
    public void performLogin(String user, String email) {
        // This is not the way
        // Cause it isn't SRP
        saveUser(user, email);
        view.redirectToProfile();
    }

    @Override
    public void start() {

    }

    private void saveUser(String userName, String email) {
        SharedPreferences.Editor editor = this.sharedPreferences.edit();
        editor.putString(Constants.USER_KEY, userName);
        editor.putString(Constants.PASSWORD_KEY, email);
        editor.commit();
    }
}
