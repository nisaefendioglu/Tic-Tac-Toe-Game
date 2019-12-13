package com.example.tiktok;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buClick(View view) {
        Button buSelected=(Button)view;
        buSelected.setBackgroundColor(Color.RED);
        int CellID=0;
        switch ((buSelected.getId())){
            case R.id.bu1:
                CellID=1;
                break;

            case R.id.bu2:
                CellID=2;
                break;

            case R.id.bu3:
                CellID=3;
                break;

            case R.id.bu4:
                CellID=4;
                break;

            case R.id.bu5:
                CellID=5;
                break;

            case R.id.bu6:
                CellID=6;
                break;

            case R.id.bu7:
                CellID=7;
                break;

            case R.id.bu8:
                CellID=8;
                break;

            case R.id.bu9:
                CellID=9;
                break;
        }
        PlayGame(CellID,buSelected);
    }

    int ActivePlayer=1;
    ArrayList<Integer> Player1=new ArrayList<Integer>();
    ArrayList<Integer> Player2=new ArrayList<Integer>();

    void PlayGame(int CellId,Button buSelected){
        buSelected.setBackgroundColor(Color.RED);
        Log.d("Player", String.valueOf(CellId));

        if(ActivePlayer==1){
            buSelected.setText("X");
            buSelected.setBackgroundColor(Color.CYAN);
            Player1.add(CellId);
            ActivePlayer=2;
        }
        else if (ActivePlayer==2){
            buSelected.setText("0");
            buSelected.setBackgroundColor(Color.RED);
            Player2.add(CellId);
            ActivePlayer=1;
        }

        CheckWiner();

    }
    void CheckWiner(){
        int Winer=-1;
        //row1
        if(Player1.contains(1)&&Player1.contains(2)&&Player1.contains(3)){
            Winer=1;
        }
        if(Player2.contains(4)&&Player2.contains(5)&&Player2.contains(6)){
            Winer=2;
        }
        //row2
        if(Player1.contains(7)&&Player1.contains(8)&&Player1.contains(9)){
            Winer=1;
        }
        if(Player2.contains(1)&&Player2.contains(5)&&Player2.contains(9)){
            Winer=2;
        }
        //
        if(Player1.contains(7)&&Player1.contains(5)&&Player1.contains(3)){
            Winer=1;
        }
        if(Player2.contains(9)&&Player2.contains(5)&&Player2.contains(1)){
            Winer=2;
        }
        if(Player1.contains(3)&&Player1.contains(5)&&Player1.contains(7)){
            Winer=1;
        }
        if(Player2.contains(9)&&Player2.contains(8)&&Player2.contains(7)){
            Winer=2;
        }
        if(Player1.contains(6)&&Player1.contains(5)&&Player1.contains(4)){
            Winer=1;
        }
        if(Player2.contains(3)&&Player2.contains(2)&&Player2.contains(1)){
            Winer=2;
        }


            if(Winer==1){
                Toast.makeText(this, "Player 1 is winner", Toast.LENGTH_LONG).show();
            }
            if(Winer==2){
                Toast.makeText(this,"Player 2 is winner", Toast.LENGTH_LONG).show();
            }

    }
}
