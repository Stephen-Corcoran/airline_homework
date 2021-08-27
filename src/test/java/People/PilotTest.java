package People;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Buzz", Rank.CAPTAIN, "12345");
    }

    @Test
    public void canFlyThePlane(){
        assertEquals("to infinity and beyond", Pilot.canFlyThePlane());


    }

}
