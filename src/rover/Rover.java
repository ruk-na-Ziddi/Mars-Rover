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
            processSingleCommand(commands.charAt(index));
        }
        return this.cordinate.toString() + " " + this.direction;
    }

    public void processSingleCommand(Character command){
        if(command == 'L') turnLeft();
        if(command == 'R') turnRight();
        if(command == 'M') move();
    }

    public void setDirection(Direction direction){
        this.direction = direction;
    }


    public Direction getDirection(){
        return this.direction;
    }

    private void move() {
        cordinate = direction.move(cordinate);
    }

    private void turnRight() {
        direction = direction.directToRight();
    }

    private void turnLeft() {
        direction = direction.directToLeft();
    }
}
