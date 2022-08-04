package com.example.phonepay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {
    ImageView imageView;
    CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler mhandler = new Handler(Looper.getMainLooper());
        mhandler.postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        }, 3000);
    }
}
/*
        imageView=findViewById(R.id.splash);
        imageView.setVisibility(View.VISIBLE);
        countDownTimer=new CountDownTimer(3000,500) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
            startActivity(new Intent(SplashActivity.this,MainActivity.class));
            finish();
            }
        }.start();
    }*/
