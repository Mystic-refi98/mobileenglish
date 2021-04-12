package com.jpc.mobileenglish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.viewpager.widget.ViewPager;

import java.util.Timer;
import java.util.TimerTask;


public class welcome1 extends AppCompatActivity {
    private ViewPager viewPager;
    private LinearLayout dotsLayout;
    private TextView[] dots;
    private int[] layouts;
    private Button btnSkip, btnNext;
    private PrefManager prefManager;

    Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        getSupportActionBar().hide(); //ini juga
        setContentView(R.layout.welcome1);

        // layouts of all welcome sliders
        // add few more layouts if you want






    }
}