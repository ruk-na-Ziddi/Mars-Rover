import org.junit.Test;
import rover.Direction;
import rover.Rover;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RoverTest {
    @Test
    public void shouldHaveInitialXandYCoordinatesAndInitialsDirection() throws Exception {
        Rover rover = new Rover(1, 2, Direction.N);
        assertThat(rover.getxCordinate(), is(1));
        assertThat(rover.getyCordinate(), is(2));
        assertThat(rover.getDirection(), is(Direction.N));
    }
}
