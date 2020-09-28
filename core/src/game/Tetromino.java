package game;

public enum Tetromino {
    IPiece(1),
    OPiece(2),
    TPiece(3),
    JPiece(4),
    LPiece(5),
    SPiece(6),
    ZPiece(7);

    private final int id;

    private Tetromino(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

}
