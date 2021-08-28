package Planes;

public enum PlaneType {

    BOEING747(747);

    private int capacity;

    PlaneType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}

