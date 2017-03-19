package chess;

public class King extends Chess {
String name="king";

    public King(String[] color, String name) {
        super(color, name);
    }

    boolean way(int up, int right) {
        if ((up == 1 && right == 0) || (up == -1 && right == 0)) {
            return true;
        }
        if ((up == 0 && right == 1) || (up == 0 && right == -1)) {
            return true;
        }
        if ((up == 1 && right == 1) || (up == -1 && right == -1)) {
            return true;
        }
        if ((up == -1 && right == 1) || (up == -1 && right == 1)) {
            return true;
        }
        return false;
    }
}
