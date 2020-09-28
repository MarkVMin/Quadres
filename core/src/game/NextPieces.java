package game;

import game.Tetromino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class NextPieces {

    private Queue<Tetromino> pieceQueue;

    public NextPieces() {
        pieceQueue = new LinkedList<Tetromino>();
        refillQueue();
        refillQueue();
    }

    public Queue<Tetromino> getPieceQueue() {
        return (Queue<Tetromino>)Collections.unmodifiableCollection(pieceQueue);
    }

    public void refillQueue() {
        ArrayList<Tetromino> list = new ArrayList<>();
        list.add(Tetromino.IPiece);
        list.add(Tetromino.OPiece);
        list.add(Tetromino.LPiece);
        list.add(Tetromino.JPiece);
        list.add(Tetromino.TPiece);
        list.add(Tetromino.SPiece);
        list.add(Tetromino.ZPiece);
        Collections.shuffle(list);
        pieceQueue.addAll(list);
    }


}
