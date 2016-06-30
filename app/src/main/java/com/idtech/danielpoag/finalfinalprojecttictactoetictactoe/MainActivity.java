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
    public static int currentBoardX;
    public static int currentBoardY;
    public static move[][] bigBoardState = new move[3][3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainImageButton[0][0] = (ImageButton) findViewById(R.id.imageButton);
        mainImageButton[0][1] = (ImageButton) findViewById(R.id.imageButton2);
        mainImageButton[0][2] = (ImageButton) findViewById(R.id.imageButton3);
        mainImageButton[1][0] = (ImageButton) findViewById(R.id.imageButton4);
        mainImageButton[1][1] = (ImageButton) findViewById(R.id.imageButton5);
        mainImageButton[1][2] = (ImageButton) findViewById(R.id.imageButton6);
        mainImageButton[2][0] = (ImageButton) findViewById(R.id.imageButton7);
        mainImageButton[2][1] = (ImageButton) findViewById(R.id.imageButton8);
        mainImageButton[2][2] = (ImageButton) findViewById(R.id.imageButton9);

        //boardList[currentBoardY][currentBoardX].findWinner(currentBoardX, currentBoardY);

        for (int x = 0; x < 3; x++){
            for (int y = 0; y < 3; y++){
                if (boardList[y][x] == null){
                    boardList[y][x] = new SmallBoard();
                }
                if (bigBoardState[y][x] == null){
                    bigBoardState[y][x] = move.NONE;
                }
                if (bigBoardState[y][x] == MainActivity.move.PLAYERONE){
                    mainImageButton[y][x].setImageResource(R.drawable.xsprite);
                }
                if (bigBoardState[y][x] == MainActivity.move.PLAYERTWO){
                    mainImageButton[y][x].setImageResource(R.drawable.osprite);
                }
            }
        }

        for (int i = 0; i < 3; i++){
            if ((bigBoardState[i][0] == MainActivity.move.PLAYERONE && bigBoardState[i][1] == MainActivity.move.PLAYERONE && bigBoardState[i][2] == MainActivity.move.PLAYERONE) ||
                    (bigBoardState[0][i] == MainActivity.move.PLAYERONE && bigBoardState[1][i] == MainActivity.move.PLAYERONE && bigBoardState[2][i] == MainActivity.move.PLAYERONE) ||
                    (bigBoardState[0][0] == MainActivity.move.PLAYERONE && bigBoardState[1][1] == MainActivity.move.PLAYERONE && bigBoardState[2][2] == MainActivity.move.PLAYERONE) ||
                    (bigBoardState[2][0] == MainActivity.move.PLAYERONE && bigBoardState[1][1] == MainActivity.move.PLAYERONE && bigBoardState[0][2] == MainActivity.move.PLAYERONE)){

            }
            else if ((bigBoardState[i][0] == MainActivity.move.PLAYERTWO && bigBoardState[i][1] == MainActivity.move.PLAYERTWO && bigBoardState[i][2] == MainActivity.move.PLAYERTWO) ||
                    (bigBoardState[0][i] == MainActivity.move.PLAYERTWO && bigBoardState[1][i] == MainActivity.move.PLAYERTWO && bigBoardState[2][i] == MainActivity.move.PLAYERTWO) ||
                    (bigBoardState[0][0] == MainActivity.move.PLAYERTWO && bigBoardState[1][1] == MainActivity.move.PLAYERTWO && bigBoardState[2][2] == MainActivity.move.PLAYERTWO) ||
                    (bigBoardState[2][0] == MainActivity.move.PLAYERTWO && bigBoardState[1][1] == MainActivity.move.PLAYERTWO && bigBoardState[0][2] == MainActivity.move.PLAYERTWO)){

            }
        }
    }

    public void buttonOneClicked(View view){
        SmallBoard.currentBoard = boardList[0][0];
        currentBoardX = 0;
        currentBoardY = 0;
        Intent intent = new Intent(this, MiniTableActivity.class);
        startActivity(intent);
    }

    public void buttonTwoClicked(View view){
        SmallBoard.currentBoard = boardList[0][1];
        currentBoardX = 1;
        currentBoardY = 0;
        Intent intent = new Intent(this, MiniTableActivity.class);
        startActivity(intent);
    }

    public void buttonThreeClicked(View view){
        SmallBoard.currentBoard = boardList[0][2];
        currentBoardX = 2;
        currentBoardY = 0;
        Intent intent = new Intent(this, MiniTableActivity.class);
        startActivity(intent);
    }

    public void buttonFourClicked(View view){
        SmallBoard.currentBoard = boardList[1][0];
        currentBoardX = 0;
        currentBoardY = 1;
        Intent intent = new Intent(this, MiniTableActivity.class);
        startActivity(intent);
    }

    public void buttonFiveClicked(View view){
        SmallBoard.currentBoard = boardList[1][1];
        currentBoardX = 1;
        currentBoardY = 1;
        Intent intent = new Intent(this, MiniTableActivity.class);
        startActivity(intent);
    }

    public void buttonSixClicked(View view){
        SmallBoard.currentBoard = boardList[1][2];
        currentBoardX = 2;
        currentBoardY = 1;
        Intent intent = new Intent(this, MiniTableActivity.class);
        startActivity(intent);
    }

    public void buttonSevenClicked(View view){
        SmallBoard.currentBoard = boardList[2][0];
        currentBoardX = 0;
        currentBoardY = 2;
        Intent intent = new Intent(this, MiniTableActivity.class);
        startActivity(intent);
    }

    public void buttonEightClicked(View view){
        SmallBoard.currentBoard = boardList[2][1];
        currentBoardX = 1;
        currentBoardY = 2;
        Intent intent = new Intent(this, MiniTableActivity.class);
        startActivity(intent);
    }

    public void buttonNineClicked(View view){
        SmallBoard.currentBoard = boardList[2][2];
        currentBoardX = 2;
        currentBoardY = 2;
        Intent intent = new Intent(this, MiniTableActivity.class);
        startActivity(intent);
    }
}
