package jetris.pieces;

import jetris.Const;

import java.awt.*;

public class Left_L extends Piece{
    public Left_L(int start_x, int start_y) {
        super(
                Const.LEFT_L_COLOR,
                new Point(start_x, start_y),
                new Point(start_x, start_y + 1),
                new Point(start_x, start_y + 2),
                new Point(start_x + 1, start_y + 2)
        );
    }
}
