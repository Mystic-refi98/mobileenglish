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

        Button btn_ge = (Button)findViewById(R.id.ge);
        btn_ge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GeneralEnglish();
            }
        });

        Button btn_toeic = (Button)findViewById(R.id.toeic);
        btn_toeic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toeic();
            }
        });

        Button btn_ielts = (Button)findViewById(R.id.ielts);
        btn_ielts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ielts();
            }
        });

        Button btn_pbt = (Button)findViewById(R.id.pbt);
        btn_pbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pbt();
            }
        });

        Button btn_ibt = (Button)findViewById(R.id.ibt);
        btn_ibt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ibt();
            }
        });

    }

 final public void AboutPrograms() {
        final Dialog aboutPrograms = new Dialog(Program.this);
        aboutPrograms.requestWindowFeature(Window.FEATURE_NO_TITLE);
        aboutPrograms.setContentView(R.layout.about_programs);

        //set outside touch
        aboutPrograms.setCanceledOnTouchOutside(false);
        aboutPrograms.setCancelable(false);
        //Set height and weight

        aboutPrograms.getWindow().setLayout(WindowManager.LayoutParams.FILL_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
        // ge.getWindow().setLayout(WindowManager.LayoutParams.WRAP_CONTENT,
        //        WindowManager.LayoutParams.WRAP_CONTENT);

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

  final public void AboutContactus() {
        final Dialog Contactus = new Dialog(Program.this);
        Contactus.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Contactus.setContentView(R.layout.contact_us);

        //set outside touch
        Contactus.setCanceledOnTouchOutside(false);
        Contactus.setCancelable(false);
        //Set height and weight

        Contactus.getWindow().setLayout(WindowManager.LayoutParams.FILL_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
        // ge.getWindow().setLayout(WindowManager.LayoutParams.WRAP_CONTENT,
        //        WindowManager.LayoutParams.WRAP_CONTENT);

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

    final public void BusinessEnglish() {
        final Dialog be = new Dialog(Program.this);
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

    final public void GeneralEnglish() {
        final Dialog ge = new Dialog(Program.this);
        ge.requestWindowFeature(Window.FEATURE_NO_TITLE);
        ge.setContentView(R.layout.ge_screen);

        //set outside touch
        ge.setCanceledOnTouchOutside(false);
        ge.setCancelable(false);
        //Set height and weight

        ge.getWindow().setLayout(WindowManager.LayoutParams.FILL_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
        // ge.getWindow().setLayout(WindowManager.LayoutParams.WRAP_CONTENT,
        //        WindowManager.LayoutParams.WRAP_CONTENT);

        ge.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        //animasi
        ge.getWindow().getAttributes().windowAnimations = android.R.style.Animation_Dialog;

        Button btn_tryit = (Button) ge.findViewById(R.id.btn_signin_ge);
        Button btn_back = (Button) ge.findViewById(R.id.btn_back_ge);

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
                ge.dismiss();
            }
        });
        ge.show();

    }

  final public void Toeic() {
      final Dialog toeic = new Dialog(Program.this);
        toeic.requestWindowFeature(Window.FEATURE_NO_TITLE);
        toeic.setContentView(R.layout.toeic_screen);

        //set outside touch
        toeic.setCanceledOnTouchOutside(false);
        toeic.setCancelable(false);
        //Set height and weight

        toeic.getWindow().setLayout(WindowManager.LayoutParams.FILL_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
        // ge.getWindow().setLayout(WindowManager.LayoutParams.WRAP_CONTENT,
        //        WindowManager.LayoutParams.WRAP_CONTENT);

        toeic.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        //animasi
        toeic.getWindow().getAttributes().windowAnimations = android.R.style.Animation_Dialog;

        Button btn_tryit = (Button) toeic.findViewById(R.id.btn_signin_toeic);
        Button btn_back = (Button) toeic.findViewById(R.id.btn_back_toeic);

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
                toeic.dismiss();
            }
        });
        toeic.show();

    }

    final public void Ielts() {
     final   Dialog ielts = new Dialog(Program.this);
        ielts.requestWindowFeature(Window.FEATURE_NO_TITLE);
        ielts.setContentView(R.layout.ielts_screen);

        //set outside touch
        ielts.setCanceledOnTouchOutside(false);
        ielts.setCancelable(false);
        //Set height and weight

        ielts.getWindow().setLayout(WindowManager.LayoutParams.FILL_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
        // ge.getWindow().setLayout(WindowManager.LayoutParams.WRAP_CONTENT,
        //        WindowManager.LayoutParams.WRAP_CONTENT);

        ielts.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        //animasi
        ielts.getWindow().getAttributes().windowAnimations = android.R.style.Animation_Dialog;

        Button btn_tryit = (Button) ielts.findViewById(R.id.btn_signin_ielts);
        Button btn_back = (Button) ielts.findViewById(R.id.btn_back_ielts);

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
                ielts.dismiss();
            }
        });
        ielts.show();

    }

    final public void Pbt() {
     final   Dialog pbt = new Dialog(Program.this);
        pbt.requestWindowFeature(Window.FEATURE_NO_TITLE);
        pbt.setContentView(R.layout.pbt_screen);

        //set outside touch
        pbt.setCanceledOnTouchOutside(false);
        pbt.setCancelable(false);
        //Set height and weight

        pbt.getWindow().setLayout(WindowManager.LayoutParams.FILL_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
        // ge.getWindow().setLayout(WindowManager.LayoutParams.WRAP_CONTENT,
        //        WindowManager.LayoutParams.WRAP_CONTENT);

        pbt.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        //animasi
        pbt.getWindow().getAttributes().windowAnimations = android.R.style.Animation_Dialog;

        Button btn_tryit = (Button) pbt.findViewById(R.id.btn_signin_pbt);
        Button btn_back = (Button) pbt.findViewById(R.id.btn_back_pbt);

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
                pbt.dismiss();
            }
        });
        pbt.show();

    }

    final public void Ibt() {
     final   Dialog ibt = new Dialog(Program.this);
        ibt.requestWindowFeature(Window.FEATURE_NO_TITLE);
        ibt.setContentView(R.layout.ibt_screen);

        //set outside touch
        ibt.setCanceledOnTouchOutside(false);
        ibt.setCancelable(false);
        //Set height and weight

        ibt.getWindow().setLayout(WindowManager.LayoutParams.FILL_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
        // ge.getWindow().setLayout(WindowManager.LayoutParams.WRAP_CONTENT,
        //        WindowManager.LayoutParams.WRAP_CONTENT);

        ibt.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        //animasi
        ibt.getWindow().getAttributes().windowAnimations = android.R.style.Animation_Dialog;

        Button btn_tryit = (Button) ibt.findViewById(R.id.btn_signin_ibt);
        Button btn_back = (Button) ibt.findViewById(R.id.btn_back_ibt);

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
                ibt.dismiss();
            }
        });
        ibt.show();

    }


}
