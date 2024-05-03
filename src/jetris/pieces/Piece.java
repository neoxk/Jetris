package jetris.pieces;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import jetris.Const;
import jetris.Square;
import jetris.events.EventBus;
import jetris.events.Listener;
import jetris.events.Event;

public abstract class Piece extends JComponent implements Listener {
    private ArrayList<Square> squares = new ArrayList<>();
    private final Color color;
    public Piece(Color color, Point...points) {
        for (Point p : points) {
            squares.add(new Square(p.x, p.y, color));
        }
        this.color = color;

        EventBus.subscribe_controller(this);

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

    public void newFrame() {
        for (Square square : squares) square.newFrame();
    }

    private void moveLeft() {
        for (Square square : squares) square.moveLeft();
    }
    private void moveRight() {
        for (Square square : squares) square.moveRight();
    }

    public static Piece newPiece() {
       int rand_x = (int) (Math.random() * (Const.GAME_VIEW_SIZE.width / Const.SQUARE_SIZE));
       int rand_piece = (int) (Math.random() * 7);
       switch (rand_piece) {
           case 0: return new Box(rand_x, 0);
           case 1: return new Left_L(rand_x, 0);
           case 2: return new Right_L(rand_x, 0);
           case 3: return new Line(rand_x, 0);
           case 4: return new T(rand_x, 0);
           case 5: return new Right_ZigZag(rand_x, 0);
           case 6: return new Left_ZigZag(rand_x, 0);
           default: return new Box(rand_x, 0);
       }
    }

    public void listen(Event e) {
       switch(e.getPayload()) {
           case Event.CONTROLLER_VK_LEFT: moveLeft(); break;
           case Event.CONTROLLER_VK_RIGHT: moveRight(); break;
       }
    }


    public void rotate() {}
}
