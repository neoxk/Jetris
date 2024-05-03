package jetris.pieces;

import jetris.Const;

import java.awt.*;

public class Left_L extends Piece{
    public Left_L(int start_x) {
        super(
                Const.LEFT_L_COLOR,
                new Point(start_x, 0),
                new Point(start_x, 1),
                new Point(start_x, 2),
                new Point(start_x + 1, 2)
        );
    }
}
