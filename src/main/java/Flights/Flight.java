package Flights;

import People.CabinCrewMember;
import People.Passenger;
import People.Pilot;
import Planes.Plane;

import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private CabinCrewMember cabinCrewMember;
    private ArrayList<Passenger> passengers;
    private Plane plane;

    private int FlightNumber;
    private String Destination;
    private String DepartureAirport;
    private String DepartureTime;

}
