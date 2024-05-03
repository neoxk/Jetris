package jetris;

import java.awt.*;

public class Const {
    public static final Dimension FRAME_SIZE = new Dimension(500, 1000);
    public static final Dimension GAME_VIEW_SIZE = new Dimension(500, 1000);
    public static final int NUM_SQUARES_WIDTH = 15;

    public static final int SQUARE_SIZE = GAME_VIEW_SIZE.width / NUM_SQUARES_WIDTH;
    public static final Color BOX_COLOR = Color.YELLOW;
    public static final Color LEFT_L_COLOR = Color.ORANGE;
    public static final Color RIGHT_L_COLOR = Color.BLUE;
    public static final Color LINE_COLOR = Color.PINK;
    public static final Color LEFT_ZIGZAG_COLOR = Color.GREEN;
    public static final Color RIGHT_ZIGZAG_COLOR = Color.MAGENTA;
    public static final Color T_COLOR = Color.RED;
}
