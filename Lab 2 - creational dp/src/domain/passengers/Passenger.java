package domain.passengers;

import domain.airplanes.Entity;

public abstract class Passenger implements Entity {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected int getId() {
        return id;
    }

    protected String getName() {
        return name;
    }
}
