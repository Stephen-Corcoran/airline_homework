package Flights;

import People.CabinCrewMember;
import People.Passenger;
import People.Pilot;
import People.Rank;
import Planes.Plane;
import Planes.PlaneType;
import org.junit.Before;


public class FlightTest {

    private Pilot pilot;
    private CabinCrewMember cabinCrewMember;
    private Passenger passenger;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    @Before
    public void before (){

        pilot = new Pilot("Buzz", Rank.CAPTAIN, "12345");
        cabinCrewMember = new CabinCrewMember("Buzz", Rank.CAPTAIN);
        passenger = new Passenger ("Woody", 1);
        plane = new Plane(PlaneType.BOEING747);
        flightNumber = "FR756";
        destination = "NYC";
        departureAirport = "EDI";
        departureTime = "12:00";

    }

}
