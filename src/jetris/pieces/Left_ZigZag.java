package jetris.pieces;

import jetris.Const;
import jetris.Square;

import java.awt.*;

public class Left_ZigZag extends Piece{
    public Left_ZigZag(int start_x, int start_y) {
        super(
                Const.LEFT_ZIGZAG_COLOR,
                new Square(start_x, start_y),
                new Square(start_x - 1, start_y),
                new Square(start_x, start_y + 1),
                new Square(start_x + 1, start_y + 1)

        );
    }
}
