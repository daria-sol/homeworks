package chess;

public class Knight extends Chess {
String name="knight";
    public Knight(String[] color, String name) {
        super(color, name);
    }

    boolean way(int up, int right) {
        if ((up == 2 && (right == 1 || right == -1))) {
            return true;
        }
        if ((up == -2 && (right == 1 || right == -1))) {
            return true;
        }
        if ((right == 2 && (up == 1 || up == -1))) {
            return true;
        }
        if ((right == -2 && (up == 1 || up == -1))) {
            return true;
        }
        return false;
    }
}
