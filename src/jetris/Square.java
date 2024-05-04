package jetris;

import java.awt.*;
import java.awt.geom.GeneralPath;
import java.awt.geom.Path2D;

public class Square{
    private int x;
    private int y;

    public Square(int x, int y) {
       this.x = x * Const.SQUARE_SIZE;
       this.y = y * Const.SQUARE_SIZE;
    }

    public int getX() {
        return x / Const.SQUARE_SIZE;
    }
    public int getY() {
        return y / Const.SQUARE_SIZE;
    }
    public void setX(int x) {
        this.x = x * Const.SQUARE_SIZE;
    }
    public void setY(int y) {
        this.y = y * Const.SQUARE_SIZE;
    }

    public Shape getShape() {
        Path2D.Double path = new Path2D.Double();
        path.moveTo(x, y);
        path.lineTo(x + Const.SQUARE_SIZE, y);
        path.lineTo(x + Const.SQUARE_SIZE, y + Const.SQUARE_SIZE);
        path.lineTo(x,y + Const.SQUARE_SIZE);
        path.closePath();
        return path;
    }



    public static Shape merge(Square[] squares) {
        GeneralPath mergedPath = new GeneralPath();
        for (Square square : squares) {
            mergedPath.append(square.getShape(), false);
        }
        return mergedPath;
    }

}
