package jetris.pieces;

import jetris.Const;

import java.awt.*;

public class Line extends Piece{
    public Line(int start_x, int start_y) {
        super(
                Const.LINE_COLOR,
                new Point(start_x, start_y),
                new Point(start_x, start_y + 1),
                new Point(start_x, start_y + 2),
                new Point(start_x, start_y + 3)
        );
    }
}
