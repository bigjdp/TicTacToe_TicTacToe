package com.idtech.danielpoag.finalfinalprojecttictactoetictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    public enum move{
        PLAYERONE, PLAYERTWO, NONE
    }

    public static move currentPlayer = move.PLAYERONE;
    static ImageButton[][] mainImageButton = new ImageButton[3][3];
    public static SmallBoard[][] boardList = new SmallBoard[3][3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainImageButton[0][0] = (ImageButton) findViewById(R.id.button);
        mainImageButton[0][1] = (ImageButton) findViewById(R.id.button2);
        mainImageButton[0][2] = (ImageButton) findViewById(R.id.button3);
        mainImageButton[1][0] = (ImageButton) findViewById(R.id.button4);
        mainImageButton[1][1] = (ImageButton) findViewById(R.id.button5);
        mainImageButton[1][2] = (ImageButton) findViewById(R.id.button6);
        mainImageButton[2][0] = (ImageButton) findViewById(R.id.button7);
        mainImageButton[2][1] = (ImageButton) findViewById(R.id.button8);
        mainImageButton[2][2] = (ImageButton) findViewById(R.id.button9);
    }

    public void buttonOneClicked(View view){
        SmallBoard.currentBoard = boardList[0][0];

        Intent intent = new Intent(this, MiniTableActivity.class);
        startActivity(intent);
    }

    public void buttonTwoClicked(View view){
        SmallBoard.currentBoard = boardList[0][1];

        Intent intent = new Intent(this, MiniTableActivity.class);
        startActivity(intent);
    }

    public void buttonThreeClicked(View view){
        SmallBoard.currentBoard = boardList[0][2];

        Intent intent = new Intent(this, MiniTableActivity.class);
        startActivity(intent);
    }

    public void buttonFourClicked(View view){
        SmallBoard.currentBoard = boardList[1][0];

        Intent intent = new Intent(this, MiniTableActivity.class);
        startActivity(intent);
    }

    public void buttonFiveClicked(View view){
        SmallBoard.currentBoard = boardList[1][1];

        Intent intent = new Intent(this, MiniTableActivity.class);
        startActivity(intent);
    }

    public void buttonSixClicked(View view){
        SmallBoard.currentBoard = boardList[1][2];

        Intent intent = new Intent(this, MiniTableActivity.class);
        startActivity(intent);
    }

    public void buttonSevenClicked(View view){
        SmallBoard.currentBoard = boardList[2][0];

        Intent intent = new Intent(this, MiniTableActivity.class);
        startActivity(intent);
    }

    public void buttonEightClicked(View view){
        SmallBoard.currentBoard = boardList[2][1];

        Intent intent = new Intent(this, MiniTableActivity.class);
        startActivity(intent);
    }

    public void buttonNineClicked(View view){
        SmallBoard.currentBoard = boardList[2][2];

        Intent intent = new Intent(this, MiniTableActivity.class);
        startActivity(intent);
    }
}
