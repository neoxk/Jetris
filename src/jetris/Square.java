package jetris;

import javax.swing.*;
import java.awt.*;

public class Square{
    private int x;
    private int y;

    public Square(int x, int y) {
       this.x = x * Const.SQUARE_SIZE;
       this.y = y * Const.SQUARE_SIZE;
    }

}
