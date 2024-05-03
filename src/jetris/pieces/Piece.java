package jetris.pieces;

import javax.swing.*;
import java.awt.*;
import jetris.Const;
import jetris.Square;

public abstract class Piece{
    protected Square[] squares;

    public Piece(int num_squares) {
        squares = new Square[num_squares];
    }

    public Square[] getSquares() {
        return squares;
    }

    public void move() {}
    public void rotate() {}
}
