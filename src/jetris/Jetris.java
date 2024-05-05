package jetris;

import jetris.events.Event;
import jetris.events.EventBus;
import jetris.events.Listener;
import jetris.pieces.Piece;
import jetris.pieces.PieceFactory;

import javax.swing.*;

public class Jetris implements Runnable, Listener {
    private boolean[][] gameBoard = new boolean[Const.GAME_VIEW_SIZE.width / Const.SQUARE_SIZE][(Const.GAME_VIEW_SIZE.height / Const.SQUARE_SIZE) - 1];
    private Piece activePiece;

    private JFrame window;

    public Jetris(JFrame window) {
       this.window = window;

        EventBus.subscribe_controller(this);
       this.window.addKeyListener(new ControlsListener());
    }

    private void land(Piece p) {
        for (Square s : p.getSquares()) {
            gameBoard[s.getX()][s.getY()] = true;
        }
        activePiece = PieceFactory.newPiece();
        window.getContentPane().add(activePiece);
    }

    private boolean canMoveLeft() {
       for (Square s : activePiece.getSquares()) {
           int newX = s.getX() - 1;
           int Y = s.getY();
           try {
               if (gameBoard[newX][Y] == true) return false;
           } catch (ArrayIndexOutOfBoundsException e) {return false;}
       }
       return true;
    }

    private boolean canMoveRight() {
        for (Square s : activePiece.getSquares()) {
            int newX = s.getX() + 1;
            int Y = s.getY();
            try {
                if (gameBoard[newX][Y] == true) return false;
            } catch (ArrayIndexOutOfBoundsException e) {return false;}
        }
        return true;
    }

    private boolean canDropdown() {
        boolean collision = false;
       for (Square s : activePiece.getSquares()) {
           int newY = s.getY() + 1;
           int X = s.getX();

           try {
               if (gameBoard[X][newY]) {
                   collision = true;
                   break;
               }
           } catch (ArrayIndexOutOfBoundsException e) {
               collision = true;
               break;
           }
       }
       if (collision) {
           land(activePiece);
           return false;
       }
       return true;
    }

    @Override
    public void run() {
        Piece piece = PieceFactory.newPiece();
        activePiece = piece;

        window.getContentPane().add(activePiece);


        int ms_counter = 0;
        while (true) {
            if (ms_counter >= 1000) {
                if (canDropdown()) activePiece.dropdown();
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

    @Override
    public void listen(Event e) {
        switch (e.getPayload()) {
            case Event.CONTROLLER_VK_LEFT:
                System.out.println(canMoveLeft());
                if (canMoveLeft()) activePiece.moveLeft(); break;
            case Event.CONTROLLER_VK_RIGHT:
                if (canMoveRight()) activePiece.moveRight(); break;
            case Event.CONTROLLER_VK_DOWN:
                if (canDropdown()) activePiece.dropdown();break;
        }
    }
}
