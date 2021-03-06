package game.commons;

public class Position {
    private final int x;
    private final int y;

    public Position(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object obj) {
        Position other = (Position) obj;
        return other.getX() == getX() && other.getY() == getY();
    }

    @Override
    public String toString() {
        return "Position [x=" + x + ", y=" + y + "]";
    }
}