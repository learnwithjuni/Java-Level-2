public class Player {
    private int x;
    private int y;
    private char symbol = 'P'; // can change to use a different symbol for your player 

    public Player(int startX, int startY) {
        x = startX;
        y = startY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getSymbol() {
        return symbol;
    }

    public void move(int newX, int newY) {
        x = newX;
        y = newY;
    }
}
