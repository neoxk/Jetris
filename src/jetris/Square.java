package jetris;

import javax.swing.*;
import java.awt.*;

public class Square extends JComponent {
    private int x;
    private int y;

    public Square(int x, int y) {
       this.x = x;
       this.y = y;;
       setSize(Const.SQUARE_SIZE, Const.SQUARE_SIZE);
       setLocation(x * Const.SQUARE_SIZE, y * Const.SQUARE_SIZE);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, getWidth(), getHeight());
    }
}
