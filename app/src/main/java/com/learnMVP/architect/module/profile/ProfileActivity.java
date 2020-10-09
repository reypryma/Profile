package com.learnMVP.architect.module.profile;

import android.view.View;

import com.learnMVP.architect.base.BaseFragmentHolderActivity;

public class ProfileActivity extends BaseFragmentHolderActivity {
    private ProfileFragment profileFragment;

    @Override
    protected void initializeFragment() {
        initializeView();

        btnBack.setVisibility(View.VISIBLE);
        btnOptionMenu.setVisibility(View.GONE);
//        ivIcon.setImageResource(R.drawable.....);
        ivIcon.setVisibility(View.VISIBLE);

        profileFragment = new ProfileFragment();
        btnBack.setOnClickListener(view -> profileFragment.goBackToLogin());
        setCurrentFragment(profileFragment, true);
    }
}
