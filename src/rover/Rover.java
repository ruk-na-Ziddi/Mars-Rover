package rover;

public class Rover {
    private final int xCordinate;
    private final int yCordinate;
    private final Direction direction;

    public Rover(int xCordinate, int yCordinate, Direction direction) {
        this.xCordinate = xCordinate;
        this.yCordinate = yCordinate;
        this.direction = direction;
    }

    public int getxCordinate(){
        return xCordinate;
    }

    public int getyCordinate(){
        return yCordinate;
    }

    public Direction getDirection(){
        return direction;
    }
}
