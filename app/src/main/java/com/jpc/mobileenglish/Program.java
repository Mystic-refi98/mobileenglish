package com.jpc.mobileenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatDelegate;

public class Program extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daftar_program);
        getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        getSupportActionBar().hide(); //ini juga


        ImageView aboutprograms = (ImageView)findViewById(R.id.about_program);
        aboutprograms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AboutPrograms();
            }
        });

        Button contactus = (Button)findViewById(R.id.help);
        contactus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AboutContactus();
            }
        });

        Button btn_be = (Button)findViewById(R.id.be);
        btn_be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BusinessEnglish();
            }
        });
    }

    public void AboutPrograms() {
        Dialog aboutPrograms = new Dialog(Program.this);
        aboutPrograms.requestWindowFeature(Window.FEATURE_NO_TITLE);
        aboutPrograms.setContentView(R.layout.about_programs);

        //set outside touch
        aboutPrograms.setCanceledOnTouchOutside(false);
        aboutPrograms.setCancelable(false);
        //Set height and weight

        aboutPrograms.getWindow().setLayout(WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.WRAP_CONTENT);

        aboutPrograms.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        //animasi
        aboutPrograms.getWindow().getAttributes().windowAnimations = android.R.style.Animation_Dialog;

        Button btn_programs = (Button) aboutPrograms.findViewById(R.id.btn_see_program);

        btn_programs.setEnabled(true);

        btn_programs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aboutPrograms.dismiss();
            }
        });

        aboutPrograms.show();

    }

    public void AboutContactus() {
        Dialog Contactus = new Dialog(Program.this);
        Contactus.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Contactus.setContentView(R.layout.contact_us);

        //set outside touch
        Contactus.setCanceledOnTouchOutside(false);
        Contactus.setCancelable(false);
        //Set height and weight

        Contactus.getWindow().setLayout(WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.WRAP_CONTENT);

        Contactus.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        //animasi
        Contactus.getWindow().getAttributes().windowAnimations = android.R.style.Animation_Dialog;

        Button btn_programs = (Button) Contactus.findViewById(R.id.btn_contact);

        btn_programs.setEnabled(true);

        btn_programs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Contactus.dismiss();
            }
        });

        Contactus.show();

    }

    public void BusinessEnglish() {
        Dialog be = new Dialog(Program.this);
        be.requestWindowFeature(Window.FEATURE_NO_TITLE);
        be.setContentView(R.layout.be_screen);

        //set outside touch
        be.setCanceledOnTouchOutside(false);
        be.setCancelable(false);
        //Set height and weight

        be.getWindow().setLayout(WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.WRAP_CONTENT);

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
                Intent intent = new Intent(Program.this,Webme.class);
                startActivity(intent);
                //be.dismiss();
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



}
