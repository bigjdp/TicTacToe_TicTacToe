package com.idtech.danielpoag.finalfinalprojecttictactoetictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MiniTableActivity extends AppCompatActivity {

    ImageButton[][] imageButton = new ImageButton[3][3];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini_table);

        imageButton[0][0] = (ImageButton) findViewById(R.id.imageButton);
        imageButton[0][1] = (ImageButton) findViewById(R.id.imageButton2);
        imageButton[0][2] = (ImageButton) findViewById(R.id.imageButton3);
        imageButton[1][0] = (ImageButton) findViewById(R.id.imageButton4);
        imageButton[1][1] = (ImageButton) findViewById(R.id.imageButton5);
        imageButton[1][2] = (ImageButton) findViewById(R.id.imageButton6);
        imageButton[2][0] = (ImageButton) findViewById(R.id.imageButton7);
        imageButton[2][1] = (ImageButton) findViewById(R.id.imageButton8);
        imageButton[2][2] = (ImageButton) findViewById(R.id.imageButton9);
    }

    public void back(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void miniOneClicked(){
        if (SmallBoard.activeBoard == null){
            SmallBoard.activeBoard = SmallBoard.currentBoard;
        }
        else if (MainActivity.currentPlayer == MainActivity.move.PLAYERONE && SmallBoard.activeBoard == SmallBoard.currentBoard){
            imageButton[0][0].setImageResource(R.drawable.x);

            SmallBoard.activeBoard = MainActivity.boardList[0][0];
            SmallBoard.currentBoard.boardState[0][0] = MainActivity.move.PLAYERONE;
            SmallBoard.currentBoard.findWinner();
        }
        else if (MainActivity.currentPlayer == MainActivity.move.PLAYERTWO && SmallBoard.activeBoard == SmallBoard.currentBoard){
            imageButton[0][0].setImageResource(R.drawable.y);
            SmallBoard.activeBoard = MainActivity.boardList[0][0];
            SmallBoard.currentBoard.boardState[0][0] = MainActivity.move.PLAYERTWO;
            SmallBoard.currentBoard.findWinner();
        }
    }

    public void miniTwoClicked(){
        if (SmallBoard.activeBoard == null){
            SmallBoard.activeBoard = SmallBoard.currentBoard;
        }
        else if (SmallBoard.currentBoard.boardState[0][1] == MainActivity.move.NONE && MainActivity.currentPlayer == MainActivity.move.PLAYERONE && SmallBoard.activeBoard == SmallBoard.currentBoard){
            imageButton[0][1].setImageResource(R.drawable.x);
            SmallBoard.activeBoard = MainActivity.boardList[0][1];
            SmallBoard.currentBoard.boardState[0][1] = MainActivity.move.PLAYERONE;
            SmallBoard.currentBoard.findWinner();
        }
        else if (SmallBoard.currentBoard.boardState[0][1] == MainActivity.move.NONE && MainActivity.currentPlayer == MainActivity.move.PLAYERTWO && SmallBoard.activeBoard == SmallBoard.currentBoard){
            imageButton[0][1].setImageResource(R.drawable.y);
            SmallBoard.activeBoard = MainActivity.boardList[0][1];
            SmallBoard.currentBoard.boardState[0][1] = MainActivity.move.PLAYERTWO;
            SmallBoard.currentBoard.findWinner();
        }
    }

    public void miniThreeClicked(){
        if (SmallBoard.activeBoard == null){
            SmallBoard.activeBoard = SmallBoard.currentBoard;
        }
        else if (SmallBoard.currentBoard.boardState[0][2] == MainActivity.move.NONE && MainActivity.currentPlayer == MainActivity.move.PLAYERONE && SmallBoard.activeBoard == SmallBoard.currentBoard){
            imageButton[0][2].setImageResource(R.drawable.x);
            SmallBoard.activeBoard = MainActivity.boardList[0][2];
            SmallBoard.currentBoard.boardState[0][2] = MainActivity.move.PLAYERONE;
            SmallBoard.currentBoard.findWinner();
        }
        else if (SmallBoard.currentBoard.boardState[0][2] == MainActivity.move.NONE && MainActivity.currentPlayer == MainActivity.move.PLAYERTWO && SmallBoard.activeBoard == SmallBoard.currentBoard){
            imageButton[0][2].setImageResource(R.drawable.y);
            SmallBoard.activeBoard = MainActivity.boardList[0][2];
            SmallBoard.currentBoard.boardState[0][2] = MainActivity.move.PLAYERTWO;
            SmallBoard.currentBoard.findWinner();
        }
    }

    public void miniFourClicked(){
        if (SmallBoard.activeBoard == null){
            SmallBoard.activeBoard = SmallBoard.currentBoard;
        }
        else if (SmallBoard.currentBoard.boardState[1][0] == MainActivity.move.NONE && MainActivity.currentPlayer == MainActivity.move.PLAYERONE && SmallBoard.activeBoard == SmallBoard.currentBoard){
            imageButton[1][0].setImageResource(R.drawable.x);
            SmallBoard.activeBoard = MainActivity.boardList[1][0];
            SmallBoard.currentBoard.boardState[1][0] = MainActivity.move.PLAYERONE;
            SmallBoard.currentBoard.findWinner();
        }
        else if (SmallBoard.currentBoard.boardState[1][0] == MainActivity.move.NONE && MainActivity.currentPlayer == MainActivity.move.PLAYERTWO && SmallBoard.activeBoard == SmallBoard.currentBoard){
            imageButton[1][0].setImageResource(R.drawable.y);
            SmallBoard.activeBoard = MainActivity.boardList[1][0];
            SmallBoard.currentBoard.boardState[1][0] = MainActivity.move.PLAYERTWO;
            SmallBoard.currentBoard.findWinner();
        }
    }

    public void miniFiveClicked(){
        if (SmallBoard.activeBoard == null){
            SmallBoard.activeBoard = SmallBoard.currentBoard;
        }
        else if (SmallBoard.currentBoard.boardState[1][1] == MainActivity.move.NONE && MainActivity.currentPlayer == MainActivity.move.PLAYERONE && SmallBoard.activeBoard == SmallBoard.currentBoard){
            imageButton[1][1].setImageResource(R.drawable.x);
            SmallBoard.activeBoard = MainActivity.boardList[1][1];
            SmallBoard.currentBoard.boardState[1][1] = MainActivity.move.PLAYERONE;
            SmallBoard.currentBoard.findWinner();
        }
        else if (SmallBoard.currentBoard.boardState[1][1] == MainActivity.move.NONE && MainActivity.currentPlayer == MainActivity.move.PLAYERTWO && SmallBoard.activeBoard == SmallBoard.currentBoard){
            imageButton[1][1].setImageResource(R.drawable.y);
            SmallBoard.activeBoard = MainActivity.boardList[1][1];
            SmallBoard.currentBoard.boardState[1][1] = MainActivity.move.PLAYERTWO;
            SmallBoard.currentBoard.findWinner();
        }
    }

    public void miniSixClicked(){
        if (SmallBoard.activeBoard == null){
            SmallBoard.activeBoard = SmallBoard.currentBoard;
        }
        else if (SmallBoard.currentBoard.boardState[1][2] == MainActivity.move.NONE && MainActivity.currentPlayer == MainActivity.move.PLAYERONE && SmallBoard.activeBoard == SmallBoard.currentBoard){
            imageButton[1][2].setImageResource(R.drawable.x);
            SmallBoard.activeBoard = MainActivity.boardList[1][2];
            SmallBoard.currentBoard.boardState[1][2] = MainActivity.move.PLAYERONE;
            SmallBoard.currentBoard.findWinner();
        }
        else if (SmallBoard.currentBoard.boardState[1][2] == MainActivity.move.NONE && MainActivity.currentPlayer == MainActivity.move.PLAYERTWO && SmallBoard.activeBoard == SmallBoard.currentBoard){
            imageButton[1][2].setImageResource(R.drawable.y);
            SmallBoard.activeBoard = MainActivity.boardList[1][2];
            SmallBoard.currentBoard.boardState[1][2] = MainActivity.move.PLAYERTWO;
            SmallBoard.currentBoard.findWinner();
        }
    }

    public void miniSevenClicked(){
        if (SmallBoard.activeBoard == null){
            SmallBoard.activeBoard = SmallBoard.currentBoard;
        }
        else if (SmallBoard.currentBoard.boardState[2][0] == MainActivity.move.NONE && MainActivity.currentPlayer == MainActivity.move.PLAYERONE && SmallBoard.activeBoard == SmallBoard.currentBoard){
            imageButton[2][0].setImageResource(R.drawable.x);
            SmallBoard.activeBoard = MainActivity.boardList[2][0];
            SmallBoard.currentBoard.boardState[2][0] = MainActivity.move.PLAYERONE;
            SmallBoard.currentBoard.findWinner();
        }
        else if (SmallBoard.currentBoard.boardState[2][0] == MainActivity.move.NONE && MainActivity.currentPlayer == MainActivity.move.PLAYERTWO && SmallBoard.activeBoard == SmallBoard.currentBoard){
            imageButton[2][0].setImageResource(R.drawable.y);
            SmallBoard.activeBoard = MainActivity.boardList[2][0];
            SmallBoard.currentBoard.boardState[2][0] = MainActivity.move.PLAYERTWO;
            SmallBoard.currentBoard.findWinner();
        }
    }

    public void miniEightClicked(){
        if (SmallBoard.activeBoard == null){
            SmallBoard.activeBoard = SmallBoard.currentBoard;
        }
        else if (SmallBoard.currentBoard.boardState[2][1] == MainActivity.move.NONE && MainActivity.currentPlayer == MainActivity.move.PLAYERONE && SmallBoard.activeBoard == SmallBoard.currentBoard){
            imageButton[2][1].setImageResource(R.drawable.x);
            SmallBoard.activeBoard = MainActivity.boardList[2][1];
            SmallBoard.currentBoard.boardState[2][1] = MainActivity.move.PLAYERONE;
            SmallBoard.currentBoard.findWinner();
        }
        else if (SmallBoard.currentBoard.boardState[2][1] == MainActivity.move.NONE && MainActivity.currentPlayer == MainActivity.move.PLAYERTWO && SmallBoard.activeBoard == SmallBoard.currentBoard){
            imageButton[2][1].setImageResource(R.drawable.y);
            SmallBoard.activeBoard = MainActivity.boardList[2][1];
            SmallBoard.currentBoard.boardState[2][1] = MainActivity.move.PLAYERTWO;
            SmallBoard.currentBoard.findWinner();
        }
    }

    public void miniNineClicked(){
        if (SmallBoard.activeBoard == null){
            SmallBoard.activeBoard = SmallBoard.currentBoard;
        }
        else if (SmallBoard.currentBoard.boardState[2][2] == MainActivity.move.NONE && MainActivity.currentPlayer == MainActivity.move.PLAYERONE && SmallBoard.activeBoard == SmallBoard.currentBoard){
            imageButton[2][2].setImageResource(R.drawable.x);
            SmallBoard.activeBoard = MainActivity.boardList[2][2];
            SmallBoard.currentBoard.boardState[2][2] = MainActivity.move.PLAYERONE;
            SmallBoard.currentBoard.findWinner();
        }
        else if (SmallBoard.currentBoard.boardState[2][2] == MainActivity.move.NONE && MainActivity.currentPlayer == MainActivity.move.PLAYERTWO && SmallBoard.activeBoard == SmallBoard.currentBoard){
            imageButton[2][2].setImageResource(R.drawable.y);
            SmallBoard.activeBoard = MainActivity.boardList[2][2];
            SmallBoard.currentBoard.boardState[2][2] = MainActivity.move.PLAYERTWO;
            SmallBoard.currentBoard.findWinner();
        }
    }
}
