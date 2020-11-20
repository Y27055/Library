package com.library.library;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

class test extends AppCompatActivity {
    public void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        //깃 크라켄 테스트
    }
}
