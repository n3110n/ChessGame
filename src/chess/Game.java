package chess;

import javax.swing.*;

public class Game extends JFrame {
    Board board;

    public Game(){
        board = new Board();
    }

    public static void main(String args[]){
        new Game();
    }
}
