package People;

public class Pilot extends CabinCrewMember {

    private String pilotLicenceNumber;

    public Pilot (String name, Rank rank, String pilotLicenceNumber) {
        super(name, rank);
        this.pilotLicenceNumber = pilotLicenceNumber;
    }

    public String getPilotLicenceNumber() {
        return pilotLicenceNumber;
    }

    public static String canFlyThePlane() {
        return "to infinity and beyond";
    }
}