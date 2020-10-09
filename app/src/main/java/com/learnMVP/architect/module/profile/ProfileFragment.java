package com.learnMVP.architect.module.profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.learnMVP.architect.base.BaseFragment;
import com.learnMVP.architect.module.login.LoginActivity;
import com.learnMVP.architect.R;

public class ProfileFragment extends BaseFragment<ProfileActivity, ProfileContract.Presenter> implements ProfileContract.View {

    private TextView tvEmail;
    private TextView tvPassword;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.fragment_profile, container, false);
        presenter = new ProfilePresenter(this, requireContext());

        tvEmail = fragmentView.findViewById(R.id.tv_userName);
        tvPassword = fragmentView.findViewById(R.id.tv_email);

        setTitle(getResources().getString(R.string.profile_title));
        presenter.start();

        return fragmentView;
    }

    @Override
    public void goBackToLogin() {
        Intent intent = new Intent(activity, LoginActivity.class);
        startActivity(intent);
        activity.finish();
    }

    @Override
    public void updateProfile(String userName, String email) {
        tvEmail.setText(userName);
        tvPassword.setText(email);
    }

    @Override
    public void setPresenter(ProfileContract.Presenter presenter) {
        this.presenter = presenter;
    }
}
