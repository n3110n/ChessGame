import piece.Piece;

public class Board {

    private static final int SIZE = 8;

    private Piece[] _board;

    public Board(){
        _board = new Piece[SIZE * SIZE];
    }

    public int getSize(){
        return SIZE;
    }
}
