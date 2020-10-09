package com.learnMVP.architect.module.login;

import com.learnMVP.architect.base.BasePresenter;
import com.learnMVP.architect.base.BaseView;

public interface LoginContract {
    interface View extends BaseView<Presenter> {
        void redirectToProfile();
    }

    interface Presenter extends BasePresenter {
        void performLogin(String User, String email);
    }
}
