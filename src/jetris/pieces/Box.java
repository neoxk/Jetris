package jetris.pieces;

import jetris.Square;

import java.awt.*;

public class Box extends jetris.pieces.Piece {
    public Box(int start_x, int start_y) {
        super(4);
        super.squares[0] = new Square(start_x, start_y);
        super.squares[1] = new Square(start_x + 1, start_y);
        super.squares[2] = new Square(start_x, start_y + 1);
        super.squares[3] = new Square(start_x + 1, start_y + 1);
    }
}
