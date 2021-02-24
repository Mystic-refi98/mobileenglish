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

public class MainMenu extends AppCompatActivity{
    private Button btnsignin;
    private Button btntrial;
    private ImageView imgabout;

    private void startMyActivity(Intent intent){
        startActivity(intent);
    }
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        getSupportActionBar().hide(); //ini juga

        btnsignin = (Button) findViewById(R.id.signin);
        btntrial = (Button) findViewById(R.id.trial);

        btnsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainMenu.this, Webme.class);
                startMyActivity(myIntent);
            }
        });

        btntrial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainMenu.this, Program.class);
                startMyActivity(myIntent);
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
        Dialog aboutMenu = new Dialog(MainMenu.this);
        aboutMenu.requestWindowFeature(Window.FEATURE_NO_TITLE);
        aboutMenu.setContentView(R.layout.about_menu);

    //set outside touch
    aboutMenu.setCanceledOnTouchOutside(false);
    aboutMenu.setCancelable(false);
    //Set height and weight

    aboutMenu.getWindow().setLayout(WindowManager.LayoutParams.WRAP_CONTENT,
            WindowManager.LayoutParams.WRAP_CONTENT);

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


}
