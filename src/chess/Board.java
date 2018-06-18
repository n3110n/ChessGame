package chess;

import chess.piece.Piece;
import chess.util.Coordinate;

public class Board {

    private static final int SIZE = 8;

    private Piece[] _board;
    private Player _white;
    private Player _black;


    public Board(){
        _board = new Piece[SIZE * SIZE];
    }

    public int getSize(){
        return SIZE; 
    }

    /**
     * Converts given Coordinates to the Corresponding number of the board Array with SIZE being width and height
     * @param x width
     * @param y height
     * @return Array Index
     */
    public int COToIndex(int x, int y){
        return y * SIZE + x;
    }

    /**
     * Converts given Coordinates to the Corresponding number of the board Array with SIZE being width and height
     * @param c Coordinate
     * @return Array Index
     */
    public int COTOIndex(Coordinate c){
        return c.getY() * SIZE + c.getX();
    }

    /**
     * Converts Index to Coordinate
     * @param i Index position
     * @return Coordinate
     */
    public Coordinate IndexToCO(int i){
        int x = i % SIZE;
        int y = i / SIZE;
        return new Coordinate(x, y);
    }
}
