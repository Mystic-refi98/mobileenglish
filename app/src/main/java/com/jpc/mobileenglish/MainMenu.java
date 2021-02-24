package com.jpc.mobileenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import androidx.appcompat.app.AppCompatDelegate;

public class MainMenu extends AppCompatActivity{
    private Button btnsignin;
    private Button btntrial;

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

    }


}
