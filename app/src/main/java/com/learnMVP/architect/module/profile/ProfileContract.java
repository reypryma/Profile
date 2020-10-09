package com.learnMVP.architect.module.profile;

import com.learnMVP.architect.base.BasePresenter;
import com.learnMVP.architect.base.BaseView;

public interface ProfileContract {
    interface View extends BaseView<Presenter> {
        void goBackToLogin();

        void updateProfile(String userName, String password);
    }

    interface Presenter extends BasePresenter {
        void getProfile();
    }
}
