package chess.piece;

import chess.Player;
import chess.util.Coordinate;
import chess.util.Type;

/**
 * Abstact Class for every Chess Piece
 */
public abstract class Piece {
    private Type _type;
    private Player _p;

    /**
     * moves the piece from its Position to specified Position
     * @param c new Location
     * @return returns true if the move was successful, else returns false
     */
    public abstract boolean move(Coordinate c);

    /**
     * Evaluates if input Position is a valid move for this piece.
     * @param c Position to test
     * @return true if position is valid, else false
     */
    public abstract boolean legal(Coordinate c);


    /**
     * returns the Type of the Piece
     * @return Type
     */
    public Type getType(){
        return _type;
    }

}
