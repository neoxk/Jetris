package jetris.pieces;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

import jetris.Const;
import jetris.Square;

public abstract class Piece extends JComponent {
    private Point[] pathPoints;
    private Color color;
    public Piece(Point[] points, Color color) {
        pathPoints = points;
        this.color = color;
        setLocation(pathPoints[0]);
        setSize(Const.GAME_VIEW_SIZE);
    }

    @Override
    public void paintComponent(Graphics gg) {
        Graphics2D g = (Graphics2D) gg;
        Path2D.Double path = new Path2D.Double();

        path.moveTo(pathPoints[0].x * Const.SQUARE_SIZE, pathPoints[0].y * Const.SQUARE_SIZE);
        for (int i = 1; i < pathPoints.length; i++) {
            path.lineTo(pathPoints[i].x * Const.SQUARE_SIZE, pathPoints[i].y * Const.SQUARE_SIZE);
        }
        path.closePath();


        g.setColor(color);
        g.fill(path);
    }

    public void move() {
       for (int i = 0; i < pathPoints.length; i++) {
           int curr_x = pathPoints[i].x;
           int curr_y = pathPoints[i].y;
           pathPoints[i] = new Point(curr_x, curr_y + 1);
       }
    }
    public void rotate() {}
}
