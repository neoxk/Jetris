package jetris;

import jetris.events.Event;
import jetris.events.EventBus;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ControlsListener extends KeyAdapter {

    private Jetris gameController;

    public ControlsListener(Jetris gameController) {
        this.gameController = gameController;
    }

   @Override
   public void keyPressed(KeyEvent e) {
       switch (e.getKeyCode()) {
           case KeyEvent.VK_RIGHT, KeyEvent.VK_LEFT, KeyEvent.VK_DOWN, KeyEvent.VK_SPACE:
               gameController.listen(e);
               break;

       }
   }
}
