package jetris.pieces;

import jetris.Const;
import jetris.Square;

import java.awt.*;

public class Box extends Piece {
    public Box(int start_x) {
        super(
                Const.BOX_COLOR,
                new Point(start_x, 0),
                new Point(start_x + 1, 0),
                new Point(start_x + 1, 1),
                new Point(start_x, 1)
        );
    }
}
