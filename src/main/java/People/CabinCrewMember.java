package People;

public class CabinCrewMember extends Person {

    private Rank rank;

    public CabinCrewMember (String name, Rank rank) {
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