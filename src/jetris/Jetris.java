package jetris;

import jetris.pieces.Piece;
import jetris.pieces.PieceFactory;

import javax.swing.*;
import java.util.ArrayList;

public class Jetris implements Runnable{
    private ArrayList<Square> gameBoard = new ArrayList<>();
    private Piece activePiece;

    private JFrame window;

    public Jetris(JFrame window) {
       this.window = window;

       this.window.addKeyListener(new ControlsListener());
    }

    @Override
    public void run() {
        Piece piece = PieceFactory.newPiece();
        activePiece = piece;

        window.getContentPane().add(activePiece);


        int ms_counter = 0;
        while (true) {
            if (ms_counter >= 1000) {
                activePiece.newFrame();
                ms_counter = 0;
            }

            window.validate();
            window.repaint();

            ms_counter += 20;
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
