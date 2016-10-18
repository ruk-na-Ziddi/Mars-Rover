package rover;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RoverTest {
    @Test
    public void shouldSetNewCordinate() throws Exception {
        Rover rover = new Rover(new Cordinate(2,2), Direction.E);
        rover.setCordinate(new Cordinate(3,3));
        assertTrue(rover.getCordinate().equals(new Cordinate(3, 3)));
    }

    @Test
    public void shouldSetNewDirection() throws Exception {
        Rover rover = new Rover(new Cordinate(2,2), Direction.E);
        rover.setDirection(Direction.N);
        assertThat(rover.getDirection(), is(Direction.N));
    }

    @Test
    public void shouldGiveRightResultAfterProcessingCommandString() throws Exception {
        Cordinate cordinate = new Cordinate(3,3);
        Rover rover = new Rover(cordinate, Direction.E);
        assertThat(rover.processCommands("MMRMMRMRRM"), is("5 1 E"));
    }
}