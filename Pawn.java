package chess;

public class Pawn extends Chess {
String name="pawn";
    public Pawn(String[] color, String name) {
        super(color, name);
    }

    boolean way(int up, int right) {
        if (up == 1 && right == 0) {
            return true;
        }
        return false;
    }
}
