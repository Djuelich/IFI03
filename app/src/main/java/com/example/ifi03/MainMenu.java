package com.example.ifi03;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import java.util.Arrays;

public class MainMenu extends AppCompatActivity implements View.OnClickListener {

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


        for (CardView cardView : Arrays.asList(it1, it2, it3, it4, it5, eng, pol, quiz)) {
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.i("myTag", "This is my message");
                }
            });
        }

    }

    @Override
    public void onClick(View v) {

    }
}