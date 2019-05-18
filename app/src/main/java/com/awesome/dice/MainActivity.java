package com.awesome.dice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView Diceview;
    private Random rand= new Random();
    private Button roll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Diceview = findViewById(R.id.imageView_Dice);
        roll= findViewById(R.id.Rolldice);

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Rolldice();
            }
        });
    }

    private void Rolldice()
    {
        int Rand = rand.nextInt(6)+1;//random 0-5 + 1 equal 1-6
        switch (Rand)
        {
            case 1:
                Diceview.setImageResource(R.drawable.dice1);
                Toast.makeText(MainActivity.this,"1! It's an odd number!", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Diceview.setImageResource(R.drawable.dice2);
                Toast.makeText(MainActivity.this,"2! It's an even number!", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Diceview.setImageResource(R.drawable.dice3);
                Toast.makeText(MainActivity.this,"3! It's an odd number!", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                Diceview.setImageResource(R.drawable.dice4);
                Toast.makeText(MainActivity.this, "4! It's an even number!", Toast.LENGTH_SHORT).show();
                break;
            case 5:
                Diceview.setImageResource(R.drawable.dice5);
                Toast.makeText(MainActivity.this, "5! It's an odd number!", Toast.LENGTH_SHORT).show();
                break;
            case 6:
                Diceview.setImageResource(R.drawable.dice6);
                Toast.makeText(MainActivity.this, "6! It's an even number!", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
