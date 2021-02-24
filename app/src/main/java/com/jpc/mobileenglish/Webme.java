package com.jpc.mobileenglish;

import android.app.Dialog;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import java.util.Timer;

public class Webme extends AppCompatActivity {
    Timer timer;
    WebView webView;
    private RelativeLayout internet_layout;

    Button button;

    @Override
    public void onBackPressed() {

        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview_me);
setTitle("Anyone, Anywhere, Anytime");

//internet connection check
        // Define ActionBar object
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        // Define ColorDrawable object and parse color
        // using parseColor method
        // with color hash code as its parameter
        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#008080"));

        // Set BackgroundDrawable
        actionBar.setBackgroundDrawable(colorDrawable);

        webView = (WebView) findViewById(R.id.web_view);
        internet_layout = findViewById(R.id.internet_layout);
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setJavaScriptEnabled(true);
        getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.setWebViewClient(new WebViewClient());

        //connectivityManager
        ConnectivityManager cm = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);

        //get active network
        NetworkInfo networkInfo = cm.getActiveNetworkInfo();

        //cekstatusinet

        if (networkInfo == null || !networkInfo.isConnected() || !networkInfo.isAvailable()) {
            //when inet is inactive

            //dialog
            Dialog dialog = new Dialog(this);

            // //set content view

            dialog.setContentView(R.layout.no_internet);

            //set outside touch
            dialog.setCanceledOnTouchOutside(false);
            dialog.setCancelable(false);

            //Set height and weight

            dialog.getWindow().setLayout(WindowManager.LayoutParams.WRAP_CONTENT,
                    WindowManager.LayoutParams.WRAP_CONTENT);

            //set transparan
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

            //animasi
            dialog.getWindow().getAttributes().windowAnimations = android.R.style.Animation_Dialog;

            //inisiasi
            Button btnTryAgain = dialog.findViewById(R.id.button);
            //perform Click
            btnTryAgain.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    recreate();

                }
            });

            //mucnul dialog
            dialog.show();

                   } else {
            webView.loadUrl("https://mobileenglish.learnsocial.online/platform");


        }
    }


}