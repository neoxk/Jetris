package jetris.pieces;

import jetris.Const;
import jetris.Square;

import java.awt.*;

public class Line extends Piece{
    public Line(int start_x, int start_y) {
        super(
                Const.LINE_COLOR,
                new Square(start_x, start_y),
                new Square(start_x, start_y + 1),
                new Square(start_x, start_y + 2),
                new Square(start_x, start_y + 3)
        );
    }
}
