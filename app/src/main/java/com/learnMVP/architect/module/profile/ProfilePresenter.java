package com.learnMVP.architect.module.profile;

import android.content.Context;
import android.content.SharedPreferences;

import com.learnMVP.architect.module.Constants;
import com.learnMVP.architect.R;

public class ProfilePresenter implements ProfileContract.Presenter {

    private final ProfileContract.View view;
    private final SharedPreferences sharedPreferences;
    private final Context context;

    public ProfilePresenter(ProfileContract.View view, Context context) {
        this.view = view;
        this.context = context;
        this.sharedPreferences = context.getSharedPreferences(Constants.PREFERENCE_KEY, Context.MODE_PRIVATE);
    }

    @Override
    public void start() {
        getProfile();
    }


    @Override
    public void getProfile() {
        String userName = this.sharedPreferences.getString(Constants.USER_KEY, context.getResources().getString(R.string.default_value));
        String email = this.sharedPreferences.getString(Constants.PASSWORD_KEY, context.getResources().getString(R.string.default_value));

        view.updateProfile(userName, email);
    }
}
