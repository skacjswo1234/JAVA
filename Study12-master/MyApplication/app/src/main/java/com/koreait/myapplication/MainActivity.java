package com.koreait.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // 페이지 이동 하는 방법.
    public void clickLoginBtn(View v) {
        Intent intent = new Intent(this,LoginActivity.class);

        startActivity(intent);
    }
}