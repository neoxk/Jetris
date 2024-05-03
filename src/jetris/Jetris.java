package jetris;

import jetris.pieces.Box;
import jetris.pieces.Piece;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Jetris implements Runnable{
    private ArrayList<Piece> pieces;
    private JFrame window;

    public Jetris(JFrame window) {
       this.window = window;
       pieces = new ArrayList<>();
    }

    @Override
    public void run() {
        while (true) {
            Box box = new Box((int) (Math.random() * Const.NUM_SQUARES_WIDTH), 0);
            pieces.add(box);
            window.getContentPane().add(box);

            for (Piece p : pieces) {
                p.move();
            }

            window.validate();
            window.repaint();


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
