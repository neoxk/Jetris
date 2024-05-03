package jetris;

import javax.swing.*;
import java.awt.*;

public class Start {
    public static void main(String[] args) {
        JFrame frame = new Frame();
        Container contentPane = frame.getContentPane();

        contentPane.setLayout(null);
        contentPane.setBackground(Color.BLACK);

        contentPane.setVisible(true);

        Jetris game = new Jetris(frame);

        new Thread(game).start();

    }
}
