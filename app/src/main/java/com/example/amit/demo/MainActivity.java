package com.example.amit.demo;

import android.app.ActivityOptions;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import br.com.simplepass.loading_button_lib.customViews.CircularProgressButton;


public class MainActivity extends AppCompatActivity implements Animation.AnimationListener {
    Animation slideLeft, slideRight, slideTop;
    Button btnlogin,btnsignup,btnskip;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlogin = (Button) findViewById(R.id.btnlogin);
        btnsignup = (Button) findViewById(R.id.btnsignup);
        btnskip = (Button) findViewById(R.id.btnskip);
        slideLeft = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_in_left);
        slideLeft.setAnimationListener(this);
        slideRight = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_in_right);
        slideRight.setAnimationListener(this);
        slideTop = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_up_in);
        slideTop.setAnimationListener(this);
    }
    @Override
    protected void onStart() {
        super.onStart();
        btnlogin.setVisibility(View.VISIBLE);
        btnlogin.startAnimation(slideLeft);
        btnsignup.setVisibility(View.VISIBLE);
        btnsignup.startAnimation(slideRight);
        btnskip.setVisibility(View.VISIBLE);
        btnskip.startAnimation(slideTop);
    }
    @Override
    public void onAnimationStart(Animation animation) {
    }
    @Override
    public void onAnimationEnd(Animation animation) {
    }
    @Override
    public void onAnimationRepeat(Animation animation) {



    }}