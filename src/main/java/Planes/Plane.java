package Planes;

public enum Plane {

    BOEING747(747);

    private int capacity;

    Plane(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}

