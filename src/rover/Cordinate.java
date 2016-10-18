package rover;

public class Cordinate {
    public  int x;
    public  int y;

    public Cordinate(int x, int y){
        this.x = x;
        this.y = y;
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
}
