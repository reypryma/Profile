package com.learnMVP.architect.base;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.learnMVP.architect.R;

public abstract class BaseFragmentHolderActivity extends BaseActivity {

    protected TextView tvToolbarTitle;
    protected FrameLayout flFragmentContainer;
    protected ImageButton btnOptionMenu;
    protected ImageView ivIcon;
    protected ImageButton btnBack;
    protected View vMenuBarShadow;
    protected RelativeLayout rlActivityFragmentHolder;

    @Override
    protected void initializeView() {
        setContentView(R.layout.base_activity);
        tvToolbarTitle = findViewById(R.id.tv_toolbar_title);
        flFragmentContainer = findViewById(R.id.fl_fragment_container);
        btnOptionMenu = findViewById(R.id.btn_option_menu);
        ivIcon = findViewById(R.id.iv_icon);
        btnBack = findViewById(R.id.btn_back);
        vMenuBarShadow = findViewById(R.id.v_menu_bar_shadow);
        rlActivityFragmentHolder = findViewById(R.id.rl_activity_fragment_holder);

        btnBack.setOnClickListener(view -> super.onBackPressed());
    }

    @Override
    public void setTitle(String title) {
        this.tvToolbarTitle.setText(title);
    }
}
