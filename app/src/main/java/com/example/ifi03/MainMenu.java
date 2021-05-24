package com.example.ifi03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainMenu extends AppCompatActivity{

    CardView it1;
    CardView it2;
    CardView it3;
    CardView it4;
    CardView it5;
    CardView eng;
    CardView pol;
    CardView quiz;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu_1);

        it1 = findViewById(R.id.menu_it1);
        it2 = findViewById(R.id.menu_it2);
        it3 = findViewById(R.id.menu_it3);
        it4 = findViewById(R.id.menu_it4);
        it5 = findViewById(R.id.menu_it5);
        eng = findViewById(R.id.menu_eng);
        pol = findViewById(R.id.menu_pol);
        quiz = findViewById(R.id.menu_quiz);

        it1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Clicked");
            }
        });

        it2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Clicked");
            }
        });

        it3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Clicked");
            }
        });

        it4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Clicked");
            }
        });

        it5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Clicked");
            }
        });

        eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Clicked");
            }
        });

        pol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Clicked");
            }
        });

        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Clicked");
            }
        });
    }


        private void showToast(String message){
            Toast.makeText(this, message,Toast.LENGTH_SHORT).show();
        }


}
