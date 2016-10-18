package rover;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RoverTest {

    @Test
    public void shouldHaveInitialXandYCoordinatesAndInitialsDirection() throws Exception {
        Cordinate cordinate = new Cordinate(1,2);
        Rover rover = new Rover(cordinate, Direction.N);
        assertThat(rover.getxCordinate(), is(1));
        assertThat(rover.getyCordinate(), is(2));
        assertThat(rover.getDirection(), is(Direction.N));
    }

    @Test
    public void shouldGiveRightResultAfterProcessingCommandString() throws Exception {
        Cordinate cordinate = new Cordinate(3,3);
        Rover rover = new Rover(cordinate, Direction.E);
        assertThat(rover.processCommands("MMRMMRMRRM"), is("5 1 E"));
    }
}