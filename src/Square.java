import javax.swing.*;
import java.awt.*;

public class Square extends JComponent {
    private int x;
    private int y;

    public Square(int x, int y) {
       this.x = x;
       this.y = y;
       int square_size = Const.GAME_VIEW_SIZE.width / Const.NUM_SQUARES_WIDTH;
         setSize(square_size, square_size);
         setLocation(x * square_size, y * square_size);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, getWidth(), getHeight());
    }
}
