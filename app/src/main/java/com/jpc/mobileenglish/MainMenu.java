package com.jpc.mobileenglish;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;


public class MainMenu extends AppCompatActivity{
    private Button btnsignin;
    private Button btntrial;
    private ImageView imgabout;
    private boolean doubleBackToExitPressedOnce;

    private void startMyActivity(Intent intent){
        startActivity(intent);
    }
    protected void onCreate(Bundle savedInstanceState) {

        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        getSupportActionBar().hide(); //ini juga

        Button btnsignin = (Button)findViewById(R.id.signin);
        btnsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Webme();
            }
        });

    //    btnsignin = (Button) findViewById(R.id.signin);
        btntrial = (Button) findViewById(R.id.trial);

  /*      btnsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_signin = new Intent(MainMenu.this, Webme.class);
                startMyActivity(intent_signin);
            }
        });
*/
        btntrial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_trial = new Intent(MainMenu.this, Program.class);
                startMyActivity(intent_trial);
            }
        });

        ImageView aboutdialog = (ImageView)findViewById(R.id.about);
        aboutdialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AboutMenu();
            }
        });



    }
public void AboutMenu(){
        final Dialog aboutMenu = new Dialog(MainMenu.this);
        aboutMenu.requestWindowFeature(Window.FEATURE_NO_TITLE);
        aboutMenu.setContentView(R.layout.about_menu);

    //set outside touch
    aboutMenu.setCanceledOnTouchOutside(false);
    aboutMenu.setCancelable(false);
    //Set height and weight

    aboutMenu.getWindow().setLayout(WindowManager.LayoutParams.FILL_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
    // ge.getWindow().setLayout(WindowManager.LayoutParams.WRAP_CONTENT,
    //        WindowManager.LayoutParams.WRAP_CONTENT);

    aboutMenu.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

    //animasi
    aboutMenu.getWindow().getAttributes().windowAnimations = android.R.style.Animation_Dialog;

    Button btn_ok = (Button) aboutMenu.findViewById(R.id.btn_see_program);

    btn_ok.setEnabled(true);

    btn_ok.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            aboutMenu.dismiss();
        }
    });

    aboutMenu.show();

}

public void Webme(){
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
        Button btnTryAgain = dialog.findViewById(R.id.btn_see_program);
        //perform Click
        btnTryAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_signin = new Intent(MainMenu.this, Webme.class);
                startMyActivity(intent_signin);

            }
        });

        Button btnBack = dialog.findViewById(R.id.btn_back_noinet);
        //perform Click
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();

            }
        });

        //mucnul dialog
        dialog.show();

    } else {
        Intent intent_signin = new Intent(MainMenu.this, Webme.class);
        startMyActivity(intent_signin);


    }

}

    final public void Exit() {
        final  Dialog de = new Dialog(MainMenu.this);
        de.requestWindowFeature(Window.FEATURE_NO_TITLE);
        de.setContentView(R.layout.exit_app);

        //set outside touch
        de.setCanceledOnTouchOutside(false);
        de.setCancelable(false);
        //Set height and weight

        de.getWindow().setLayout(WindowManager.LayoutParams.FILL_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
        // ge.getWindow().setLayout(WindowManager.LayoutParams.WRAP_CONTENT,
        //        WindowManager.LayoutParams.WRAP_CONTENT);

        de.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        //animasi
        de.getWindow().getAttributes().windowAnimations = android.R.style.Animation_Dialog;

        Button btn_ya = (Button) de.findViewById(R.id.btn_ya_exit);
        Button btn_tidak = (Button) de.findViewById(R.id.btn_tidak_exit);

        btn_ya.setEnabled(true);
        btn_tidak.setEnabled(true);

        btn_ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);
                finishAndRemoveTask();
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);



            }
        });
        btn_tidak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                de.dismiss();
            }
        });
        de.show();

    }


    public void onBackPressed() {
        Exit();
    }


}
