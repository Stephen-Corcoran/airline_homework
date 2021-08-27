package People;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    CabinCrewMember cabinCrewMember;

    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("Buzz", Rank.CAPTAIN);
    }

    @Test
    public void canRelayMessageToPassengers(){
        assertEquals("Brace for impact", CabinCrewMember.relayMessageToPassengers());


    }

}
