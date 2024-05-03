package jetris;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ControlsListener extends KeyAdapter {
   @Override
   public void keyPressed(KeyEvent e) {
       switch (e.getKeyCode()) {
           case KeyEvent.VK_RIGHT:
               System.out.println("Right");
               break;
           case KeyEvent.VK_LEFT:
               System.out.println("Left");
               break;
           case KeyEvent.VK_SPACE:
               System.out.println("Rotate");
               break;
       }
   }
}
