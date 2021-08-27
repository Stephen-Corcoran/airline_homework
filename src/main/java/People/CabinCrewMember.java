package People;

public class CabinCrewMember extends Person {

    private int rank;

    public CabinCrewMember (String name, int rank) {
        super(name);
        this.rank = rank;
    }

    public Rank getRank(Rank rank) {
        return rank;
    }

    public static String relayMessageToPassengers(){
        return "Brace for impact";
    }
}