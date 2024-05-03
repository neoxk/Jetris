package jetris;

import jetris.events.Event;
import jetris.events.EventBus;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ControlsListener extends KeyAdapter {
   @Override
   public void keyPressed(KeyEvent e) {
       switch (e.getKeyCode()) {
           case KeyEvent.VK_RIGHT:
               EventBus.dispatch(new Event(Event.CONTROLLER_INPUT, Event.CONTROLLER_VK_RIGHT));
               break;
           case KeyEvent.VK_LEFT:
               EventBus.dispatch(new Event(Event.CONTROLLER_INPUT, Event.CONTROLLER_VK_LEFT));
               break;
           case KeyEvent.VK_SPACE:
               System.out.println("Rotate");
               break;
       }
   }
}
