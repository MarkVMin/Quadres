package game;
import game.Tetromino;

import java.util.ArrayList;


public class Board {

    private ArrayList<ArrayList<Tetromino>> boardState;

    public Board(int width, int height) {
        boardState = new ArrayList<ArrayList<Tetromino>(width)>(height);
    }

}``
