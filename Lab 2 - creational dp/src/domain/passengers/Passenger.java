package domain.passengers;

import domain.airplanes.Entity;
import domain.cloning.PassengerPrototype;

public abstract class Passenger implements Entity, PassengerPrototype {
    private int id;
    public String name;

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

    public Passenger makeCopy() {
        Passenger passengerObject = null;
        try {
            passengerObject = (Passenger) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Was not able to clone passenger");
        }
        return passengerObject;
    }
}
