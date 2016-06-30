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

        imageButton[0][0] = (ImageButton) findViewById(R.id.button);
        imageButton[0][1] = (ImageButton) findViewById(R.id.button2);
        imageButton[0][2] = (ImageButton) findViewById(R.id.button3);
        imageButton[1][0] = (ImageButton) findViewById(R.id.button4);
        imageButton[1][1] = (ImageButton) findViewById(R.id.button5);
        imageButton[1][2] = (ImageButton) findViewById(R.id.button6);
        imageButton[2][0] = (ImageButton) findViewById(R.id.button7);
        imageButton[2][1] = (ImageButton) findViewById(R.id.button8);
        imageButton[2][2] = (ImageButton) findViewById(R.id.button9);
        System.out.println(SmallBoard.currentBoard.boardState[0][0] + "");

        for (int y = 0; y < 3; y++){
            for (int x = 0; x < 3; x++){
                if (SmallBoard.currentBoard.boardState[y][x] == MainActivity.move.PLAYERONE){
                    imageButton[y][x].setImageResource(R.drawable.xsprite);
                }
                if (SmallBoard.currentBoard.boardState[y][x] == MainActivity.move.PLAYERTWO){
                    imageButton[y][x].setImageResource(R.drawable.osprite);
                }
            }
        }
    }

    public void back(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void miniOneClicked(View view){
        if (SmallBoard.activeBoard == null){
            SmallBoard.activeBoard = SmallBoard.currentBoard;
            System.out.println("Activeboard set");
        }
        if (MainActivity.currentPlayer == MainActivity.move.PLAYERONE && SmallBoard.activeBoard == SmallBoard.currentBoard && SmallBoard.currentBoard.boardState[0][0] == MainActivity.move.NONE){
            imageButton[0][0].setImageResource(R.drawable.xsprite);

            SmallBoard.activeBoard = MainActivity.boardList[0][0];
            SmallBoard.currentBoard.boardState[0][0] = MainActivity.move.PLAYERONE;
            MainActivity.currentPlayer = MainActivity.move.PLAYERTWO;
            //SmallBoard.currentBoard.findWinner();
        }
        else if (MainActivity.currentPlayer == MainActivity.move.PLAYERTWO && SmallBoard.activeBoard == SmallBoard.currentBoard && SmallBoard.currentBoard.boardState[0][0] == MainActivity.move.NONE){
            imageButton[0][0].setImageResource(R.drawable.osprite);
            SmallBoard.activeBoard = MainActivity.boardList[0][0];
            SmallBoard.currentBoard.boardState[0][0] = MainActivity.move.PLAYERTWO;
            MainActivity.currentPlayer = MainActivity.move.PLAYERONE;
            //SmallBoard.currentBoard.findWinner();
        }
        MainActivity.boardList[MainActivity.currentBoardY][MainActivity.currentBoardX] = SmallBoard.currentBoard;
        System.out.println(SmallBoard.currentBoard.boardState[0][0] + "");
        MainActivity.boardList[MainActivity.currentBoardY][MainActivity.currentBoardX].findWinner(MainActivity.currentBoardX, MainActivity.currentBoardY);
    }

    public void miniTwoClicked(View view){
        if (SmallBoard.activeBoard == null){
            SmallBoard.activeBoard = SmallBoard.currentBoard;
        }
        if (SmallBoard.currentBoard.boardState[0][1] == MainActivity.move.NONE && MainActivity.currentPlayer == MainActivity.move.PLAYERONE && SmallBoard.activeBoard == SmallBoard.currentBoard){
            imageButton[0][1].setImageResource(R.drawable.xsprite);
            SmallBoard.activeBoard = MainActivity.boardList[0][1];
            SmallBoard.currentBoard.boardState[0][1] = MainActivity.move.PLAYERONE;
            MainActivity.currentPlayer = MainActivity.move.PLAYERTWO;
            //SmallBoard.currentBoard.findWinner();
        }
        else if (SmallBoard.currentBoard.boardState[0][1] == MainActivity.move.NONE && MainActivity.currentPlayer == MainActivity.move.PLAYERTWO && SmallBoard.activeBoard == SmallBoard.currentBoard){
            imageButton[0][1].setImageResource(R.drawable.osprite);
            SmallBoard.activeBoard = MainActivity.boardList[0][1];
            SmallBoard.currentBoard.boardState[0][1] = MainActivity.move.PLAYERTWO;
            MainActivity.currentPlayer = MainActivity.move.PLAYERONE;
            //SmallBoard.currentBoard.findWinner();
        }
        MainActivity.boardList[MainActivity.currentBoardY][MainActivity.currentBoardX] = SmallBoard.currentBoard;
        MainActivity.boardList[MainActivity.currentBoardY][MainActivity.currentBoardX].findWinner(MainActivity.currentBoardX, MainActivity.currentBoardY);
    }

    public void miniThreeClicked(View view){
        if (SmallBoard.activeBoard == null){
            SmallBoard.activeBoard = SmallBoard.currentBoard;
        }
        if (SmallBoard.currentBoard.boardState[0][2] == MainActivity.move.NONE && MainActivity.currentPlayer == MainActivity.move.PLAYERONE && SmallBoard.activeBoard == SmallBoard.currentBoard){
            imageButton[0][2].setImageResource(R.drawable.xsprite);
            SmallBoard.activeBoard = MainActivity.boardList[0][2];
            SmallBoard.currentBoard.boardState[0][2] = MainActivity.move.PLAYERONE;
            MainActivity.currentPlayer = MainActivity.move.PLAYERTWO;
            //SmallBoard.currentBoard.findWinner();
        }
        else if (SmallBoard.currentBoard.boardState[0][2] == MainActivity.move.NONE && MainActivity.currentPlayer == MainActivity.move.PLAYERTWO && SmallBoard.activeBoard == SmallBoard.currentBoard){
            imageButton[0][2].setImageResource(R.drawable.osprite);
            SmallBoard.activeBoard = MainActivity.boardList[0][2];
            SmallBoard.currentBoard.boardState[0][2] = MainActivity.move.PLAYERTWO;
            MainActivity.currentPlayer = MainActivity.move.PLAYERONE;
            //SmallBoard.currentBoard.findWinner();
        }
        MainActivity.boardList[MainActivity.currentBoardY][MainActivity.currentBoardX] = SmallBoard.currentBoard;
        MainActivity.boardList[MainActivity.currentBoardY][MainActivity.currentBoardX].findWinner(MainActivity.currentBoardX, MainActivity.currentBoardY);
    }

    public void miniFourClicked(View view){
        if (SmallBoard.activeBoard == null){
            SmallBoard.activeBoard = SmallBoard.currentBoard;
        }
        if (SmallBoard.currentBoard.boardState[1][0] == MainActivity.move.NONE && MainActivity.currentPlayer == MainActivity.move.PLAYERONE && SmallBoard.activeBoard == SmallBoard.currentBoard){
            imageButton[1][0].setImageResource(R.drawable.xsprite);
            SmallBoard.activeBoard = MainActivity.boardList[1][0];
            SmallBoard.currentBoard.boardState[1][0] = MainActivity.move.PLAYERONE;
            MainActivity.currentPlayer = MainActivity.move.PLAYERTWO;
            //SmallBoard.currentBoard.findWinner();
        }
        else if (SmallBoard.currentBoard.boardState[1][0] == MainActivity.move.NONE && MainActivity.currentPlayer == MainActivity.move.PLAYERTWO && SmallBoard.activeBoard == SmallBoard.currentBoard){
            imageButton[1][0].setImageResource(R.drawable.osprite);
            SmallBoard.activeBoard = MainActivity.boardList[1][0];
            SmallBoard.currentBoard.boardState[1][0] = MainActivity.move.PLAYERTWO;
            MainActivity.currentPlayer = MainActivity.move.PLAYERONE;
            //SmallBoard.currentBoard.findWinner();
        }
        MainActivity.boardList[MainActivity.currentBoardY][MainActivity.currentBoardX] = SmallBoard.currentBoard;
        MainActivity.boardList[MainActivity.currentBoardY][MainActivity.currentBoardX].findWinner(MainActivity.currentBoardX, MainActivity.currentBoardY);
    }

    public void miniFiveClicked(View view){
        if (SmallBoard.activeBoard == null){
            SmallBoard.activeBoard = SmallBoard.currentBoard;
        }
        if (SmallBoard.currentBoard.boardState[1][1] == MainActivity.move.NONE && MainActivity.currentPlayer == MainActivity.move.PLAYERONE && SmallBoard.activeBoard == SmallBoard.currentBoard){
            imageButton[1][1].setImageResource(R.drawable.xsprite);
            SmallBoard.activeBoard = MainActivity.boardList[1][1];
            SmallBoard.currentBoard.boardState[1][1] = MainActivity.move.PLAYERONE;
            MainActivity.currentPlayer = MainActivity.move.PLAYERTWO;
            //SmallBoard.currentBoard.findWinner();
        }
        else if (SmallBoard.currentBoard.boardState[1][1] == MainActivity.move.NONE && MainActivity.currentPlayer == MainActivity.move.PLAYERTWO && SmallBoard.activeBoard == SmallBoard.currentBoard){
            imageButton[1][1].setImageResource(R.drawable.osprite);
            SmallBoard.activeBoard = MainActivity.boardList[1][1];
            SmallBoard.currentBoard.boardState[1][1] = MainActivity.move.PLAYERTWO;
            MainActivity.currentPlayer = MainActivity.move.PLAYERONE;
            //SmallBoard.currentBoard.findWinner();
        }
        MainActivity.boardList[MainActivity.currentBoardY][MainActivity.currentBoardX] = SmallBoard.currentBoard;
        MainActivity.boardList[MainActivity.currentBoardY][MainActivity.currentBoardX].findWinner(MainActivity.currentBoardX, MainActivity.currentBoardY);
    }

    public void miniSixClicked(View view){
        if (SmallBoard.activeBoard == null){
            SmallBoard.activeBoard = SmallBoard.currentBoard;
        }
        if (SmallBoard.currentBoard.boardState[1][2] == MainActivity.move.NONE && MainActivity.currentPlayer == MainActivity.move.PLAYERONE && SmallBoard.activeBoard == SmallBoard.currentBoard){
            imageButton[1][2].setImageResource(R.drawable.xsprite);
            SmallBoard.activeBoard = MainActivity.boardList[1][2];
            SmallBoard.currentBoard.boardState[1][2] = MainActivity.move.PLAYERONE;
            MainActivity.currentPlayer = MainActivity.move.PLAYERTWO;
            //SmallBoard.currentBoard.findWinner();
        }
        else if (SmallBoard.currentBoard.boardState[1][2] == MainActivity.move.NONE && MainActivity.currentPlayer == MainActivity.move.PLAYERTWO && SmallBoard.activeBoard == SmallBoard.currentBoard){
            imageButton[1][2].setImageResource(R.drawable.osprite);
            SmallBoard.activeBoard = MainActivity.boardList[1][2];
            SmallBoard.currentBoard.boardState[1][2] = MainActivity.move.PLAYERTWO;
            MainActivity.currentPlayer = MainActivity.move.PLAYERONE;
            //SmallBoard.currentBoard.findWinner();
        }
        MainActivity.boardList[MainActivity.currentBoardY][MainActivity.currentBoardX] = SmallBoard.currentBoard;
        MainActivity.boardList[MainActivity.currentBoardY][MainActivity.currentBoardX].findWinner(MainActivity.currentBoardX, MainActivity.currentBoardY);
    }

    public void miniSevenClicked(View view){
        if (SmallBoard.activeBoard == null){
            SmallBoard.activeBoard = SmallBoard.currentBoard;
        }
        if (SmallBoard.currentBoard.boardState[2][0] == MainActivity.move.NONE && MainActivity.currentPlayer == MainActivity.move.PLAYERONE && SmallBoard.activeBoard == SmallBoard.currentBoard){
            imageButton[2][0].setImageResource(R.drawable.xsprite);
            SmallBoard.activeBoard = MainActivity.boardList[2][0];
            SmallBoard.currentBoard.boardState[2][0] = MainActivity.move.PLAYERONE;
            MainActivity.currentPlayer = MainActivity.move.PLAYERTWO;
            //SmallBoard.currentBoard.findWinner();
        }
        else if (SmallBoard.currentBoard.boardState[2][0] == MainActivity.move.NONE && MainActivity.currentPlayer == MainActivity.move.PLAYERTWO && SmallBoard.activeBoard == SmallBoard.currentBoard){
            imageButton[2][0].setImageResource(R.drawable.osprite);
            SmallBoard.activeBoard = MainActivity.boardList[2][0];
            SmallBoard.currentBoard.boardState[2][0] = MainActivity.move.PLAYERTWO;
            MainActivity.currentPlayer = MainActivity.move.PLAYERONE;
            //SmallBoard.currentBoard.findWinner();
        }
        MainActivity.boardList[MainActivity.currentBoardY][MainActivity.currentBoardX] = SmallBoard.currentBoard;
        MainActivity.boardList[MainActivity.currentBoardY][MainActivity.currentBoardX].findWinner(MainActivity.currentBoardX, MainActivity.currentBoardY);
    }

    public void miniEightClicked(View view){
        if (SmallBoard.activeBoard == null){
            SmallBoard.activeBoard = SmallBoard.currentBoard;
        }
        if (SmallBoard.currentBoard.boardState[2][1] == MainActivity.move.NONE && MainActivity.currentPlayer == MainActivity.move.PLAYERONE && SmallBoard.activeBoard == SmallBoard.currentBoard){
            imageButton[2][1].setImageResource(R.drawable.xsprite);
            SmallBoard.activeBoard = MainActivity.boardList[2][1];
            SmallBoard.currentBoard.boardState[2][1] = MainActivity.move.PLAYERONE;
            MainActivity.currentPlayer = MainActivity.move.PLAYERTWO;
            //SmallBoard.currentBoard.findWinner();
        }
        else if (SmallBoard.currentBoard.boardState[2][1] == MainActivity.move.NONE && MainActivity.currentPlayer == MainActivity.move.PLAYERTWO && SmallBoard.activeBoard == SmallBoard.currentBoard){
            imageButton[2][1].setImageResource(R.drawable.osprite);
            SmallBoard.activeBoard = MainActivity.boardList[2][1];
            SmallBoard.currentBoard.boardState[2][1] = MainActivity.move.PLAYERTWO;
            MainActivity.currentPlayer = MainActivity.move.PLAYERONE;
            //SmallBoard.currentBoard.findWinner();
        }
        MainActivity.boardList[MainActivity.currentBoardY][MainActivity.currentBoardX] = SmallBoard.currentBoard;
        MainActivity.boardList[MainActivity.currentBoardY][MainActivity.currentBoardX].findWinner(MainActivity.currentBoardX, MainActivity.currentBoardY);
    }

    public void miniNineClicked(View view){
        if (SmallBoard.activeBoard == null){
            SmallBoard.activeBoard = SmallBoard.currentBoard;
        }
        if (SmallBoard.currentBoard.boardState[2][2] == MainActivity.move.NONE && MainActivity.currentPlayer == MainActivity.move.PLAYERONE && SmallBoard.activeBoard == SmallBoard.currentBoard){
            imageButton[2][2].setImageResource(R.drawable.xsprite);
            SmallBoard.activeBoard = MainActivity.boardList[2][2];
            SmallBoard.currentBoard.boardState[2][2] = MainActivity.move.PLAYERONE;
            MainActivity.currentPlayer = MainActivity.move.PLAYERTWO;
            //SmallBoard.currentBoard.findWinner();
        }
        else if (SmallBoard.currentBoard.boardState[2][2] == MainActivity.move.NONE && MainActivity.currentPlayer == MainActivity.move.PLAYERTWO && SmallBoard.activeBoard == SmallBoard.currentBoard){
            imageButton[2][2].setImageResource(R.drawable.osprite);
            SmallBoard.activeBoard = MainActivity.boardList[2][2];
            SmallBoard.currentBoard.boardState[2][2] = MainActivity.move.PLAYERTWO;
            MainActivity.currentPlayer = MainActivity.move.PLAYERONE;
            //SmallBoard.currentBoard.findWinner();
        }
        MainActivity.boardList[MainActivity.currentBoardY][MainActivity.currentBoardX] = SmallBoard.currentBoard;
        MainActivity.boardList[MainActivity.currentBoardY][MainActivity.currentBoardX].findWinner(MainActivity.currentBoardX, MainActivity.currentBoardY);
    }
}
