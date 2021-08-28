package Flights;

import People.CabinCrewMember;
import People.Passenger;
import People.Pilot;
import Planes.PlaneType;

import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private CabinCrewMember cabinCrewMember;
    private ArrayList<Passenger> passengers;
    private PlaneType plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Pilot pilot, CabinCrewMember cabinCrewMember, ArrayList Passenger, PlaneType plane, int FlightNumber, String Destination, String DepartureAirport, String DepartureTime){
        this.pilot = pilot;
        this.cabinCrewMember = cabinCrewMember;
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;

    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public CabinCrewMember getCabinCrewMember() {
        return cabinCrewMember;
    }

    public void setCabinCrewMember(CabinCrewMember cabinCrewMember) {
        this.cabinCrewMember = cabinCrewMember;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public PlaneType getPlane() {
        return plane;
    }

    public void setPlane(PlaneType plane) {
        this.plane = plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void addPassenger(Passenger passenger) {
        if (this.passengers.size() < plane.getCapacity()){
            this.passengers.add(passenger);
        }

    }
}
