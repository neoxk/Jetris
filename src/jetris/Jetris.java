package jetris;

import jetris.pieces.Box;
import jetris.pieces.Left_L;
import jetris.pieces.Piece;

import javax.swing.*;
import java.util.ArrayList;

public class Jetris implements Runnable{
    private ArrayList<Piece> displayedPieces;

    private JFrame window;

    public Jetris(JFrame window) {
       this.window = window;
       displayedPieces = new ArrayList<>();
    }

    @Override
    public void run() {
        Box box = new Box(0);
        Left_L l = new Left_L(4);
        displayedPieces.add(box);
        displayedPieces.add(l);
        window.getContentPane().add(box);
        window.getContentPane().add(l);

        while (true) {
            for (Piece p : displayedPieces) {
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
