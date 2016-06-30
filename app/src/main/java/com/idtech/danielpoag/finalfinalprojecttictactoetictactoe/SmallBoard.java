package com.idtech.danielpoag.finalfinalprojecttictactoetictactoe;

/**
 * Created by student on 6/29/2016.
 */
public class SmallBoard {
    public static SmallBoard currentBoard = new SmallBoard();
    public static SmallBoard activeBoard;

    public MainActivity.move[][] boardState = new MainActivity.move[3][3];

    public SmallBoard(){
        for(int x = 0; x < 3; x++){
            for (int y = 0; y < 3; y++){
                boardState[y][x] = MainActivity.move.NONE;
            }
        }
    }

    public void findWinner(int x, int y){
        for (int i = 0; i < 3; i++){
            if (MainActivity.bigBoardState[y][x] == MainActivity.move.NONE){
                if ((boardState[i][0] == MainActivity.move.PLAYERONE && boardState[i][1] == MainActivity.move.PLAYERONE && boardState[i][2] == MainActivity.move.PLAYERONE) ||
                        (boardState[0][i] == MainActivity.move.PLAYERONE && boardState[1][i] == MainActivity.move.PLAYERONE && boardState[2][i] == MainActivity.move.PLAYERONE) ||
                        (boardState[0][0] == MainActivity.move.PLAYERONE && boardState[1][1] == MainActivity.move.PLAYERONE && boardState[2][2] == MainActivity.move.PLAYERONE) ||
                        (boardState[2][0] == MainActivity.move.PLAYERONE && boardState[1][1] == MainActivity.move.PLAYERONE && boardState[0][2] == MainActivity.move.PLAYERONE)){
                    MainActivity.bigBoardState[y][x] = MainActivity.move.PLAYERONE;
                }
                else if ((boardState[i][0] == MainActivity.move.PLAYERTWO && boardState[i][1] == MainActivity.move.PLAYERTWO && boardState[i][2] == MainActivity.move.PLAYERTWO) ||
                        (boardState[0][i] == MainActivity.move.PLAYERTWO && boardState[1][i] == MainActivity.move.PLAYERTWO && boardState[2][i] == MainActivity.move.PLAYERTWO) ||
                        (boardState[0][0] == MainActivity.move.PLAYERTWO && boardState[1][1] == MainActivity.move.PLAYERTWO && boardState[2][2] == MainActivity.move.PLAYERTWO) ||
                        (boardState[2][0] == MainActivity.move.PLAYERTWO && boardState[1][1] == MainActivity.move.PLAYERTWO && boardState[0][2] == MainActivity.move.PLAYERTWO)){
                    MainActivity.bigBoardState[y][x] = MainActivity.move.PLAYERTWO;

                }
            }
        }
    }



}
