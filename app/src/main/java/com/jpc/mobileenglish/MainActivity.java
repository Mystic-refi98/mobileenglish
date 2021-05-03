package com.jpc.mobileenglish;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.viewpager.widget.ViewPager;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends AppCompatActivity {
    Timer timer;
    private Utils root;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        getSupportActionBar().hide(); //ini juga
        setContentView(R.layout.activity_main);

      /*  if (isDeviceRooted()) {
            setContentView(R.layout.activity_main);
            final Dialog be = new Dialog(MainActivity.this);
            be.requestWindowFeature(Window.FEATURE_NO_TITLE);
            be.setContentView(R.layout.be_screen);

            //set outside touch
            be.setCanceledOnTouchOutside(false);
            be.setCancelable(false);
            //Set height and weight

            be.getWindow().setLayout(WindowManager.LayoutParams.FILL_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
            // ge.getWindow().setLayout(WindowManager.LayoutParams.WRAP_CONTENT,
            //        WindowManager.LayoutParams.WRAP_CONTENT);

            be.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

            //animasi
            be.getWindow().getAttributes().windowAnimations = android.R.style.Animation_Dialog;

            Button btn_tryit = (Button) be.findViewById(R.id.btn_signin_be);
            Button btn_back = (Button) be.findViewById(R.id.btn_back_be);

            btn_tryit.setEnabled(true);
            btn_back.setEnabled(true);

            btn_tryit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String url = "https://mobileenglish.learnsocial.online/platform";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
            btn_back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    be.dismiss();
                }
            });
            be.show();



        }
        else { */
            setContentView(R.layout.activity_main);
            timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    Intent intent = new Intent(MainActivity.this, activity_welcome.class);
                    startActivity(intent);
                    finish();

                }
            }, 5000);



    }

   /* public static boolean isDeviceRooted() {
        return Utils.checkRootMethod1() || Utils.checkRootMethod2() || Utils.checkRootMethod3() || Utils.executeShellCommand();
    } */

}
