package com.example.home.osstest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AppInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_info);
    }

    public void BackInfo(View v){
        this.finish();
    }

}
