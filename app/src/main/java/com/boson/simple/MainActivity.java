package com.boson.simple;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.boson.simple.util.LogUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogUtils.e("---->");
    }
}
