package com.idtech.danielpoag.finalfinalprojecttictactoetictactoe;

/**
 * Created by student on 6/29/2016.
 */
public class SmallBoard {
    public static SmallBoard currentBoard;
    public static SmallBoard activeBoard;

    public MainActivity.move[][] boardState = new MainActivity.move[3][3];

    public SmallBoard(){
        for(int x = 0; x < 3; x++){
            for (int y = 0; y < 3; y++){
                boardState[y][x] = MainActivity.move.NONE;
            }
        }
    }

    public void findWinner(){
        for (int i = 0; i < 3; i++){
            if (boardState[i][0] == MainActivity.move.PLAYERONE && boardState[i][1] == MainActivity.move.PLAYERONE && boardState[i][2] == MainActivity.move.PLAYERONE ||
                    boardState[0][i] == MainActivity.move.PLAYERONE && boardState[1][i] == MainActivity.move.PLAYERONE && boardState[2][i] == MainActivity.move.PLAYERONE ||
                    boardState[0][0] == MainActivity.move.PLAYERONE && boardState[1][1] == MainActivity.move.PLAYERONE && boardState[2][2] == MainActivity.move.PLAYERONE ||
                    boardState[2][0] == MainActivity.move.PLAYERONE && boardState[1][1] == MainActivity.move.PLAYERONE && boardState[0][2] == MainActivity.move.PLAYERONE){
                if (currentBoard == MainActivity.boardList[0][0]){MainActivity.mainImageButton[0][0].setImageResource(R.drawable.x);}
                else if (currentBoard == MainActivity.boardList[0][1]){MainActivity.mainImageButton[0][1].setImageResource(R.drawable.x);}
                else if (currentBoard == MainActivity.boardList[0][2]){MainActivity.mainImageButton[0][2].setImageResource(R.drawable.x);}
                else if (currentBoard == MainActivity.boardList[1][0]){MainActivity.mainImageButton[1][0].setImageResource(R.drawable.x);}
                else if (currentBoard == MainActivity.boardList[1][1]){MainActivity.mainImageButton[1][1].setImageResource(R.drawable.x);}
                else if (currentBoard == MainActivity.boardList[1][2]){MainActivity.mainImageButton[1][2].setImageResource(R.drawable.x);}
                else if (currentBoard == MainActivity.boardList[2][0]){MainActivity.mainImageButton[2][0].setImageResource(R.drawable.x);}
                else if (currentBoard == MainActivity.boardList[2][1]){MainActivity.mainImageButton[2][1].setImageResource(R.drawable.x);}
                else if (currentBoard == MainActivity.boardList[2][2]){MainActivity.mainImageButton[2][2].setImageResource(R.drawable.x);}
            }
            else if (boardState[i][0] == MainActivity.move.PLAYERTWO && boardState[i][1] == MainActivity.move.PLAYERTWO && boardState[i][2] == MainActivity.move.PLAYERTWO ||
                    boardState[0][i] == MainActivity.move.PLAYERTWO && boardState[1][i] == MainActivity.move.PLAYERTWO && boardState[2][i] == MainActivity.move.PLAYERTWO ||
                    boardState[0][0] == MainActivity.move.PLAYERTWO && boardState[1][1] == MainActivity.move.PLAYERTWO && boardState[2][2] == MainActivity.move.PLAYERTWO ||
                    boardState[2][0] == MainActivity.move.PLAYERTWO && boardState[1][1] == MainActivity.move.PLAYERTWO && boardState[0][2] == MainActivity.move.PLAYERTWO){
                if (currentBoard == MainActivity.boardList[0][0]){MainActivity.mainImageButton[0][0].setImageResource(R.drawable.o);}
                else if (currentBoard == MainActivity.boardList[0][1]){MainActivity.mainImageButton[0][1].setImageResource(R.drawable.o);}
                else if (currentBoard == MainActivity.boardList[0][2]){MainActivity.mainImageButton[0][2].setImageResource(R.drawable.o);}
                else if (currentBoard == MainActivity.boardList[1][0]){MainActivity.mainImageButton[1][0].setImageResource(R.drawable.o);}
                else if (currentBoard == MainActivity.boardList[1][1]){MainActivity.mainImageButton[1][1].setImageResource(R.drawable.o);}
                else if (currentBoard == MainActivity.boardList[1][2]){MainActivity.mainImageButton[1][2].setImageResource(R.drawable.o);}
                else if (currentBoard == MainActivity.boardList[2][0]){MainActivity.mainImageButton[2][0].setImageResource(R.drawable.o);}
                else if (currentBoard == MainActivity.boardList[2][1]){MainActivity.mainImageButton[2][1].setImageResource(R.drawable.o);}
                else if (currentBoard == MainActivity.boardList[2][2]){MainActivity.mainImageButton[2][2].setImageResource(R.drawable.o);}
            }
        }
    }



}
