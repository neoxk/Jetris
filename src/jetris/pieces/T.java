package jetris.pieces;

import jetris.Const;

import java.awt.*;

public class T extends Piece{
    public T(int start_x, int start_y) {
        super(
                Const.T_COLOR,
                new Point(start_x, start_y),
                new Point(start_x - 1, start_y),
                new Point(start_x + 1, start_y),
                new Point(start_x + 1, start_y)
        );
    }
}
