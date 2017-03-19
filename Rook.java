package chess;

public class Rook extends Chess {
String name="rook";
    public Rook(String[] color, String name) {
        super(color, name);
    }

    boolean way(int up, int right) {
        if (((up >= -8 && up <= 8) && right == 0)) {
            return true;
        }
        if (((right >= -8 && right <= 8) && up == 0)) {
            return true;
        }
        return false;
    }
}
