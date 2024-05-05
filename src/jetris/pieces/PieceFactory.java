package jetris.pieces;

import jetris.Const;

public class PieceFactory {
    public static Piece newPiece() {
        int rand_x = (int) (Const.NUM_SQUARES_WIDTH / 4 + (Math.random() * (Const.NUM_SQUARES_WIDTH / 2)));
        int rand_piece = (int) (Math.random() * 7);
        switch (rand_piece) {
            case 0: return new Box(rand_x, 0);
            case 1: return new Left_L(rand_x, 0);
            case 2: return new Right_L(rand_x, 0);
            case 3: return new Line(rand_x, 0);
            case 4: return new T(rand_x, 0);
            case 5: return new Right_ZigZag(rand_x, 0);
            case 6: return new Left_ZigZag(rand_x, 0);
            default: return new Box(rand_x, 0);
        }
    }
}
