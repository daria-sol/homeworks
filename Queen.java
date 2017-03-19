package chess;

public class Queen extends Chess {
String name="queen";
    public Queen(String[] color, String name) {
        super(color, name);
    }

    boolean way(int up, int right) {
        if (((up > 0 && up <= 8) && right == 0) || ((up >= -8 && up < 0) && 
                right == 0)) {
            return true;
        }
        if (((right > 0 && right <= 8) && up == 0) || 
                ((right >= -8 && right < 0) && up == 0)) {
            return true;
        }
        if ((up==right) && (up >=-8 && up <= 8) && ((right >= -8 && right <= 8))) {
            return true;
        }
       if ((up==-right) && (up >=-8 && up <= 8) && ((right >= -8 && right <= 8))) {
            return true;
        }
        return false;
    }
}
