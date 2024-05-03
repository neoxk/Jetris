package jetris.pieces;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;
import java.util.ArrayList;

import jetris.Const;
import jetris.Square;

public abstract class Piece extends JComponent {
    private ArrayList<Square> squares = new ArrayList<>();
    private Color color;
    public Piece(Color color, Point...points) {
        for (Point p : points) {
            squares.add(new Square(p.x, p.y, color));
        }

        this.color = color;
        setLocation(points[0].getLocation());
        setSize(Const.GAME_VIEW_SIZE);
    }

    @Override
    public void paintComponent(Graphics gg) {
        Shape piece = Square.merge(squares.toArray(new Square[0]));
        Graphics2D g = (Graphics2D) gg;
        g.setColor(color);
        g.fill(piece);
    }

    public void move() {
        for (Square square : squares) square.move();
    }

    public void newPiece() {
       int rand_x = (int) (Math.random() * (Const.GAME_VIEW_SIZE.width / Const.SQUARE_SIZE));
       int rand_piece = (int) (Math.random() * 8);
       switch (rand_piece) {
           case 0:
               new Box(rand_x);
       }
    }
    public void rotate() {}
}
