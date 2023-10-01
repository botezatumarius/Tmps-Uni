package domain.passengers;

import domain.airplanes.Entity;

public abstract class Passenger implements Entity {
    public int id;
    public String name;
    public String ethnicity;

    public Passenger(int id, String name, String ethnicity) {
        this.id = id;
        this.name = name;
        this.ethnicity = ethnicity;
    }

    public void showInfo() {
        System.out.println("Id:" + id + "\n" + "Name:" + name + "\n" + "Ethnicity:" + ethnicity + "\n");
    }
}
