package com.example.dicegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;



public class MainActivity extends AppCompatActivity {

    public static Button button;
    public static TextView textView;
    public static ImageView img1, img2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int dices[] = {R.drawable.dice1, R.drawable.dice2, R.drawable.dice3,
        R.drawable.dice4, R.drawable.dice5, R.drawable.dice6};

        button = findViewById(R.id.b_roll);
        textView = findViewById(R.id.tv_winner);
        img1 = findViewById(R.id.iv_dice1);
        img2 = findViewById(R.id.iv_dice2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random1 = new Random();
                Random random2 = new Random();
                int num1 = random1.nextInt(6);
                int num2 = random2.nextInt(6);

                if(num1 > num2){
                    textView.setText("Winner : Player 1");
                } else if (num1 < num2) {
                    textView.setText("Winner : Player 2");
                }
                else textView.setText("Draw");

                /*img1.setImageResource(dices[1]);
                img2.setImageResource(dices[6]);*/
                img1.setImageResource(dices[num1]);
                img2.setImageResource(dices[num2]);
            }
        });
    }
}