package rover;

public class Rover {
    private Cordinate cordinate;
    private Direction direction;

    public Rover(Cordinate cordinate, Direction direction) {
        this.cordinate = cordinate;
        this.direction = direction;
    }
    

    public String processCommands(String commands){
        for (int index=0; index < commands.length(); index ++ ){
            processCommand(commands.charAt(index));
        }
        return this.cordinate.x + " " + this.cordinate.y + " " + this.direction;
    }

    public void processCommand(Character command){
        if(command == 'L') turnLeft();
        if(command == 'R') turnRight();
        if(command == 'M') move();
    }

    public void setCordinate(Cordinate cordinate){
        this.cordinate = cordinate;
    };

    public void setDirection(Direction direction){
        this.direction = direction;
    }

    public Cordinate getCordinate(){
        return this.cordinate;
    }

    public Direction getDirection(){
        return this.direction;
    }

    private void move() {
        switch (this.direction){
            case E: {this.setCordinate(new Cordinate(this.cordinate.x + 1, this.cordinate.y)); break;}
            case W: {this.setCordinate(new Cordinate(this.cordinate.x - 1, this.cordinate.y )); break;}
            case N: {this.setCordinate(new Cordinate(this.cordinate.x, this.cordinate.y + 1)); break;}
            case S: {this.setCordinate(new Cordinate(this.cordinate.x, this.cordinate.y -1)); break;}
        }
    }

    private void turnRight() {
        switch (this.direction){
            case E: {this.setDirection(Direction.S); break;}
            case W: {this.setDirection(Direction.N); break;}
            case N: {this.setDirection(Direction.E); break;}
            case S: {this.setDirection(Direction.W); break;}
        }
    }

    private void turnLeft() {
        switch (this.direction){
            case E: {this.setDirection(Direction.N); break;}
            case W: {this.setDirection(Direction.S); break;}
            case N: {this.setDirection(Direction.W); break;}
            case S: {this.setDirection(Direction.E); break;}
        }
    }
}
