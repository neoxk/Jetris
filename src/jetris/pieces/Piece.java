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

public abstract class Piece extends JComponent implements Listener {
    private ArrayList<Square> squares = new ArrayList<>();
    private final Color color;
    public Piece(Color color, Square...addedSquares) {
        this.squares.addAll(Arrays.asList(addedSquares));
        this.color = color;

        EventBus.subscribe_controller(this);

        setLocation(squares.getFirst().x, squares.getFirst().y);
        setSize(Const.GAME_VIEW_SIZE);
    }
    @Override public void paintComponent(Graphics gg) {
        Shape piece = Square.merge(squares.toArray(new Square[0]));
        Graphics2D g = (Graphics2D) gg;
        g.setColor(color);
        g.fill(piece);
    }

    public void newFrame() {
        for (Square square : squares) {
            square.y ++;
        }
    }

    private void moveLeft() {
        for (Square square : squares) {
            square.x --;
        }
    }
    private void moveRight() {
        for (Square square : squares) square.x ++;
    }


    public void listen(Event e) {
       switch(e.getPayload()) {
           case Event.CONTROLLER_VK_LEFT: moveLeft(); break;
           case Event.CONTROLLER_VK_RIGHT: moveRight(); break;
       }
    }


    public void rotate() {}
}
