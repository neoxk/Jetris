package jetris;

import javax.swing.*;

public class Frame extends JFrame {
    public Frame() {
        setTitle("jetris.Jetris - Tetris in Java");
        setSize(Const.FRAME_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setVisible(true);
    }
}
