package game;
import game.Tetromino;

import java.util.ArrayList;


public class Board {

    private ArrayList<ArrayList<Tetromino>> boardState;

    public Board(int width, int height) {
        boardState = new ArrayList<ArrayList<Tetromino>>(height);
        for(ArrayList<Tetromino> list : boardState) {
            list = new ArrayList<Tetromino>(width);
        }
    }

    public ArrayList<ArrayList<Tetromino>> getBoard() {
        return boardState;
    }



}
