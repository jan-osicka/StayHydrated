package com.example.stayhydrated
        ;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent HomeMenuIntent = new Intent(MainActivity.this, HomeMenuActivity.class);
                startActivity(HomeMenuIntent);
                finish();
                runFadeInAnimation();
            }
        }, SPLASH_TIME_OUT);
    }

    private void runFadeInAnimation()
    {
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.homemenutransition);
        ImageView iv = (ImageView) findViewById(R.id.iv_imageView);
        iv.startAnimation(anim);

    }
}
