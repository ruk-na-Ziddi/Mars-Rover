package rover;

public class Cordinate {
    private int x;
    private int y;

    public Cordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Cordinate newCordinateWithXInc() {
        return new Cordinate(this.x + 1, this.y);
    }

    public Cordinate newCordinateWithXDec() {
        return new Cordinate(this.x - 1, this.y);
    }

    public Cordinate newCordinateWithYInc() {
        return new Cordinate(this.x, this.y + 1);
    }

    public Cordinate newCordinateWithYDec() {
        return new Cordinate(this.x, this.y - 1);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!Cordinate.class.isAssignableFrom(obj.getClass())) {
            return false;
        }

        Cordinate other = (Cordinate) obj;
        return this.x == other.x && this.y == other.y;
    }

    @Override
    public String toString() {
        return this.x + " " + this.y;
    }
}
