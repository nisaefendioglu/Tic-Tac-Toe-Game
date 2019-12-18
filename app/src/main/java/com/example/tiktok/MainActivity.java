package com.example.tiktok;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.widget.ImageViewCompat;
import androidx.core.widget.TextViewCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button bu1;
    Button bu2;
    Button bu3;
    Button bu4;
    Button bu5;
    Button bu6;
    Button bu7;
    Button bu8;
    Button bu9;
    ArrayList<Button> xox = new ArrayList<Button>();
    String Player1 = "X";
    String Player2 = "O";
    AppCompatImageButton image;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bu1 = (Button) findViewById(R.id.bu1);
        bu2 = (Button) findViewById(R.id.bu2);
        bu3 = (Button) findViewById(R.id.bu3);
        bu4 = (Button) findViewById(R.id.bu4);
        bu5 = (Button) findViewById(R.id.bu5);
        bu6 = (Button) findViewById(R.id.bu6);
        bu7 = (Button) findViewById(R.id.bu7);
        bu8 = (Button) findViewById(R.id.bu8);
        bu9 = (Button) findViewById(R.id.bu9);


        xox.add(0, bu1);
        xox.add(1, bu2);
        xox.add(2, bu3);
        xox.add(3, bu4);
        xox.add(4, bu5);
        xox.add(5, bu6);
        xox.add(6, bu7);
        xox.add(7, bu8);
        xox.add(8, bu9);
    }

    public void buClick(View view) {

        if (view.equals(bu1)) {
            CharSequence textOne = bu1.getText().toString();
            if (!textOne.equals("")) {
                Toast.makeText(this, "This filed is not empty, choose another.", Toast.LENGTH_SHORT).show();
            } else {
                bu1.setText(Player1);
                xox.remove(bu1);
                bu1.setBackgroundColor(Color.CYAN);

                Button random = xox.get(new Random().nextInt(xox.size()));
                if (!random.equals("")) {
                    random.setText(Player2);
                    random.setBackgroundColor(Color.WHITE);

                }
            }
        } else if (view.equals(bu2)) {
            CharSequence textTwo = bu2.getText().toString();
            if (!textTwo.equals("")) {
                Toast.makeText(this, "This filed is not empty, choose another.", Toast.LENGTH_SHORT).show();
            } else {
                bu2.setText(Player1);
                xox.remove(bu2);
                bu2.setBackgroundColor(Color.CYAN);

                Button random = xox.get(new Random().nextInt(xox.size()));
                if (!random.equals("")) {
                    random.setText(Player2);
                    random.setBackgroundColor(Color.WHITE);

                }
            }
        } else if (view.equals(bu3)) {
            CharSequence textThree = bu3.getText().toString();
            if (!textThree.equals("")) {
                Toast.makeText(this, "This filed is not empty, choose another.", Toast.LENGTH_SHORT).show();
            } else {
                bu3.setText(Player1);
                xox.remove(bu3);
                bu3.setBackgroundColor(Color.CYAN);
                Button random = xox.get(new Random().nextInt(xox.size()));
                if (!random.equals("")) {
                    random.setText(Player2);
                    random.setBackgroundColor(Color.WHITE);
                }
            }
        } else if (view.equals(bu4)) {
            CharSequence textFour = bu4.getText().toString();
            if (!textFour.equals("")) {
                Toast.makeText(this, "This filed is not empty, choose another.", Toast.LENGTH_SHORT).show();
            } else {
                bu4.setText(Player1);
                xox.remove(bu4);
                bu4.setBackgroundColor(Color.CYAN);
                Button random = xox.get(new Random().nextInt(xox.size()));
                if (!random.equals("")) {
                    random.setText(Player2);
                    random.setBackgroundColor(Color.WHITE);
                }
            }
        } else if (view.equals(bu5)) {
            CharSequence textFive = bu5.getText().toString();
            if (!textFive.equals("")) {
                Toast.makeText(this, "This filed is not empty, choose another.", Toast.LENGTH_SHORT).show();
            } else {
                bu5.setText(Player1);
                xox.remove(bu5);
                bu5.setBackgroundColor(Color.CYAN);
                Button random = xox.get(new Random().nextInt(xox.size()));
                if (!random.equals("")) {
                    random.setText(Player2);
                    random.setBackgroundColor(Color.WHITE);

                }
            }
        } else if (view.equals(bu6)) {
            CharSequence textSix = bu6.getText().toString();
            if (!textSix.equals("")) {
                Toast.makeText(this, "This filed is not empty, choose another.", Toast.LENGTH_SHORT).show();
            } else {
                bu6.setText(Player1);
                xox.remove(bu6);
                bu6.setBackgroundColor(Color.CYAN);
                Button random = xox.get(new Random().nextInt(xox.size()));
                if (!random.equals("")) {
                    random.setText(Player2);
                    random.setBackgroundColor(Color.WHITE);

                }
            }
        } else if (view.equals(bu7)) {
            CharSequence textSeven = bu7.getText().toString();
            if (!textSeven.equals("")) {
                Toast.makeText(this, "This filed is not empty, choose another.", Toast.LENGTH_SHORT).show();
            } else {
                bu7.setText(Player1);
                xox.remove(bu7);
                bu7.setBackgroundColor(Color.CYAN);
                Button random = xox.get(new Random().nextInt(xox.size()));
                if (!random.equals("")) {
                    random.setText(Player2);
                    random.setBackgroundColor(Color.WHITE);

                }
            }
        } else if (view.equals(bu8)) {
            CharSequence textEight = bu8.getText().toString();
            if (!textEight.equals("")) {
                Toast.makeText(this, "This filed is not empty, choose another.", Toast.LENGTH_SHORT).show();
            } else {
                bu8.setText(Player1);
                xox.remove(bu8);
                bu8.setBackgroundColor(Color.CYAN);
                Button random = xox.get(new Random().nextInt(xox.size()));
                if (!random.equals("")) {
                    random.setText(Player2);
                    random.setBackgroundColor(Color.WHITE);


                }
            }
        } else if (view.equals(bu9)) {
            CharSequence textNine = bu9.getText().toString();
            if (!textNine.equals("")) {
                Toast.makeText(this, "This filed is not empty, choose another.", Toast.LENGTH_SHORT).show();
            } else {
                bu9.setText(Player1);
                xox.remove(bu9);
                bu9.setBackgroundColor(Color.CYAN);
                Button random = xox.get(new Random().nextInt(xox.size()));
                if (!random.equals("")) {
                    random.setText(Player2);
                    random.setBackgroundColor(Color.WHITE);


                }
            }
        }

        if (bu1.getText().toString().equals("X") && bu2.getText().toString().equals("X") && bu3.getText().toString().equals("X")) {

            Toast.makeText(this, "Player 1 wins", Toast.LENGTH_SHORT).show();


        }
        else if (bu4.getText().toString().equals("X") && bu5.getText().toString().equals("X") && bu6.getText().toString().equals("X")) {

            Toast.makeText(this, "Player 1 wins", Toast.LENGTH_SHORT).show();

        }
        else if (bu7.getText().toString().equals("X") && bu8.getText().toString().equals("X") && bu9.getText().toString().equals("X")) {

            Toast.makeText(this, "Player 1 wins", Toast.LENGTH_SHORT).show();

        }
        if (bu1.getText().toString().equals("O") && bu2.getText().toString().equals("O") && bu3.getText().toString().equals("O")) {

            Toast.makeText(this, "Player 2 wins", Toast.LENGTH_SHORT).show();

        }
        else if (bu4.getText().toString().equals("O") && bu5.getText().toString().equals("O") && bu6.getText().toString().equals("O")) {

            Toast.makeText(this, "Player 2 wins", Toast.LENGTH_SHORT).show();

        }
        else if (bu7.getText().toString().equals("O") && bu8.getText().toString().equals("O") && bu9.getText().toString().equals("O")) {

            Toast.makeText(this, "Player 2 wins", Toast.LENGTH_SHORT).show();

        }
        else if (bu1.getText().toString().equals("X") && bu4.getText().toString().equals("X") && bu7.getText().toString().equals("X")) {

            Toast.makeText(this, "Player 1 wins", Toast.LENGTH_SHORT).show();

        }
        else if (bu2.getText().toString().equals("X") && bu5.getText().toString().equals("X") && bu8.getText().toString().equals("X")) {

            Toast.makeText(this, "Player 1 wins", Toast.LENGTH_SHORT).show();

        }
        else if (bu3.getText().toString().equals("X") && bu6.getText().toString().equals("X") && bu9.getText().toString().equals("X")) {

            Toast.makeText(this, "Player 1 wins", Toast.LENGTH_SHORT).show();

        }
        else if (bu1.getText().toString().equals("O") && bu4.getText().toString().equals("O") && bu7.getText().toString().equals("O")) {

            Toast.makeText(this, "Player 2 wins", Toast.LENGTH_SHORT).show();

        }
        else if (bu2.getText().toString().equals("O") && bu5.getText().toString().equals("O") && bu8.getText().toString().equals("O")) {

            Toast.makeText(this, "Player 2 wins", Toast.LENGTH_SHORT).show();

        }
        else if (bu3.getText().toString().equals("O") && bu6.getText().toString().equals("O") && bu9.getText().toString().equals("O")) {

            Toast.makeText(this, "Player 2 wins", Toast.LENGTH_SHORT).show();

        }
        else if (bu1.getText().toString().equals("X") && bu5.getText().toString().equals("X") && bu9.getText().toString().equals("X")) {

            Toast.makeText(this, "Player 1 wins", Toast.LENGTH_SHORT).show();

        }
        else if (bu3.getText().toString().equals("X") && bu5.getText().toString().equals("X") && bu7.getText().toString().equals("X")) {

            Toast.makeText(this, "Player 1 wins", Toast.LENGTH_SHORT).show();

        }
        else if (bu1.getText().toString().equals("O") && bu5.getText().toString().equals("O") && bu9.getText().toString().equals("O")) {

            Toast.makeText(this, "Player 2 wins", Toast.LENGTH_SHORT).show();

        } else if (bu3.getText().toString().equals("O") && bu6.getText().toString().equals("O") && bu9.getText().toString().equals("O")) {

            Toast.makeText(this, "Player 2 wins", Toast.LENGTH_SHORT).show();

        }


    }
}
