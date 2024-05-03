package jetris.pieces;

import jetris.Const;

import java.awt.*;

public class Right_L extends Piece{
    public Right_L(int start_x) {
       super(
               Const.RIGHT_L_COLOR,
               new Point(start_x, 0),
               new Point(start_x, 1),
               new Point(start_x, 2),
               new Point(start_x - 1, 2)
       );
    }
}
