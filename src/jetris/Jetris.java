package jetris;

import jetris.pieces.Piece;

import javax.swing.*;
import java.util.ArrayList;

public class Jetris implements Runnable{
    private ArrayList<Piece> displayedPieces;

    private JFrame window;

    public Jetris(JFrame window) {
       this.window = window;
       displayedPieces = new ArrayList<>();

       this.window.addKeyListener(new ControlsListener());
    }

    @Override
    public void run() {
        Piece piece = Piece.newPiece();

        displayedPieces.add(piece);
        window.getContentPane().add(piece);

        while (true) {
            for (Piece p : displayedPieces) {
                p.newFrame();
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
