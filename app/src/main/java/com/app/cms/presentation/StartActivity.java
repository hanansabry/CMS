package com.app.cms.presentation;

import android.content.Intent;
import android.os.Bundle;

import com.app.cms.R;
import com.app.cms.presentation.center.LoginActivity;
import com.app.cms.presentation.center.MaintenanceCenterHomeActivity;
import com.app.cms.presentation.center.MaintenanceCenterRegisterationActivity;
import com.app.cms.presentation.client.RepairCarHomeActivity;
import com.google.firebase.auth.FirebaseAuth;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnStart)
    public void onRepairMyCarClicked() {
        startActivity(new Intent(this, RepairCarHomeActivity.class));
    }

    @OnClick(R.id.btnCenter)
    public void onLoginAsCenterClicked() {
        if (FirebaseAuth.getInstance().getCurrentUser() != null) {
            startActivity(new Intent(this, MaintenanceCenterHomeActivity.class));
        } else {
            startActivity(new Intent(this, LoginActivity.class));
        }
    }

    @OnClick(R.id.register_now_text)
    public void onRegisterClicked() {
        startActivity(new Intent(this, MaintenanceCenterRegisterationActivity.class));
    }
}