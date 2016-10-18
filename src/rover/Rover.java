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

    private void move() {
        switch (this.direction){
            case E: {this.cordinate.x = this.cordinate.x + 1; break;}
            case W: {this.cordinate.x = this.cordinate.x - 1; break;}
            case N: {this.cordinate.y = this.cordinate.y + 1; break;}
            case S: {this.cordinate.y = this.cordinate.y - 1; break;}
        }
    }

    private void turnRight() {
        switch (this.direction){
            case E: {this.direction = Direction.S; break;}
            case W: {this.direction = Direction.N; break;}
            case N: {this.direction = Direction.E; break;}
            case S: {this.direction = Direction.W; break;}
        }
    }

    private void turnLeft() {
        switch (this.direction){
            case E: {this.direction = Direction.N; break;}
            case W: {this.direction = Direction.S; break;}
            case N: {this.direction = Direction.W; break;}
            case S: {this.direction = Direction.E; break;}
        }
    }
}
