package Planes;

public class Plane {
    private PlaneType type;

    public Plane(PlaneType type){
        this.type = type;
    }

    public PlaneType getType() {
        return type;
    }

    public void setType(PlaneType type) {
        this.type = type;
    }
}
