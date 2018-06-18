package chess.util;

/**
 * This Class will contain an x and a y value together
 */
public class Coordinate {
    private int _x;
    private int _y;


    /**
     * Creates a Coordinate out of x and y input
     * @param x Horizontal Value
     * @param y Vertikal value
     */
    public Coordinate(int x, int y){
        _x = x;
        _y = y;
    }

    /**
     * Returns the X Value Coordinate Class
     * @return Returns X
     */
    public int getX(){
        return _x;
    }

    /**
     * Returns Y Value of Coordinate Class
     * @return Returns Y
     */
    public int getY(){
        return _y;
    }
}
