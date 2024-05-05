package jetris.pieces;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import jetris.Const;
import jetris.Square;
import jetris.events.EventBus;
import jetris.events.Listener;
import jetris.events.Event;

public abstract class Piece extends JComponent{
    private ArrayList<Square> squares = new ArrayList<>();
    private final Color color;
    public Piece(Color color, Square...addedSquares) {
        this.squares.addAll(Arrays.asList(addedSquares));
        this.color = color;


        setLocation(0, 0);
        setSize(Const.GAME_VIEW_SIZE);
    }
    @Override public void paintComponent(Graphics gg) {
        Shape piece = Square.merge(squares.toArray(new Square[0]));
        Graphics2D g = (Graphics2D) gg;
        g.setColor(color);
        g.fill(piece);
    }

    public Square[] getSquares() {
        return squares.toArray(new Square[0]);
    }


    public void dropdown() {
        for (Square square : squares) {
            int prevY = square.getY();
            square.setY(prevY + 1);
        }
    }

    public void moveLeft() {
        for (Square square : squares) {
            int prevX = square.getX();
            square.setX(prevX - 1);
        }
    }
    public void moveRight() {
        for (Square square : squares) {
            int prevX = square.getX();
            square.setX(prevX + 1);
        }
    }





    public void rotate() {}
}
