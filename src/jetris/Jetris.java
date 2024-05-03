package jetris;

import jetris.pieces.Box;

import java.awt.*;

public class Jetris {
    public static void main(String[] args) {
        Container contentPane = new Frame().getContentPane();

        contentPane.setLayout(null);
        contentPane.setBackground(Color.BLACK);

        Box box = new Box(0, 0);

        contentPane.add(box);
        contentPane.add(new Box(2, 1));
        contentPane.add(new Box(1, 1));


        contentPane.setVisible(true);

    }
}
