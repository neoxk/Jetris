import java.awt.*;

public class Jetris {
    public static void main(String[] args) {
        Container contentPane = new Frame().getContentPane();

        contentPane.setLayout(null);
        contentPane.setBackground(Color.BLACK);

        contentPane.add(new Square(0, 0));
        contentPane.add(new Square(1, 0));
        contentPane.setVisible(true);

    }
}
