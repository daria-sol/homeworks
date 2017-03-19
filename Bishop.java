package chess;

public class Bishop extends Chess {
String name="bishop";
    public Bishop(String[] color, String name) {
        super(color, name);
    }

    boolean way(int up, int right) {
        if ((up == right) && (up >= -8 && up <= 8) && ((right >= -8 && right <= 8))) {
            return true;
        }
        if ((up == -right) && (up >= -8 && up <= 8) && ((right >= -8 && right <= 8))) {
            return true;
        }
        return false;
    }
}
