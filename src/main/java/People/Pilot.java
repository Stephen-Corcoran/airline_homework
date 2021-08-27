package People;

public class Pilot extends CabinCrewMember {

    private String pilotLicenceNumber;

    public Pilot (String name, int rank, String pilotLicenceNumber ) {
        super(name, rank);
        this.pilotLicenceNumber = pilotLicenceNumber;
    }

    public String getPilotLicenceNumber() {
        return pilotLicenceNumber;
    }

    public String flyThePlane() {
        return "to infinity and beyond";
    }
}