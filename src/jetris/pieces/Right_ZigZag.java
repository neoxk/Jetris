package jetris.pieces;

import jetris.Const;

import java.awt.*;

public class Right_ZigZag extends Piece{
    public Right_ZigZag(int start_x, int start_y) {
        super(
                Const.RIGHT_ZIGZAG_COLOR,
                new Point(start_x, start_y),
                new Point(start_x + 1, start_y),
                new Point(start_x, start_y + 1),
                new Point(start_x - 1, start_y + 1)

        );
    }
}
