package People;

public class CabinCrewMember extends Person {

    private int rank;

    public CabinCrewMember (String name, int rank) {
        super(name);
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }
}