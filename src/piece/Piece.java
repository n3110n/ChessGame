package piece;

import util.Coordinate;
import util.Type;

public abstract class Piece {
    private Type type;

    public abstract boolean move(Coordinate c);

    public abstract boolean legal(Coordinate c);

    public Type getType(){
        return type;
    }

}
