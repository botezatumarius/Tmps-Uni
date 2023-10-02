package domain.airplanes;

import java.util.ArrayList;

import domain.passengers.Passenger;

public abstract class Airplane implements Entity {
    public int id;
    public float length;
    public float tailHeight;
    public float wingspan;
    public int nrOfEngines;
    public int nrOfSeats;
    public String model;
    public ArrayList<Passenger> passengers;

    public Airplane(int id, float length, float tailHeight, float wingsSpan, int nrOfEngines, String model,
            int nrOfSeats) {
        this.id = id;
        this.length = length;
        this.tailHeight = tailHeight;
        this.wingspan = wingsSpan;
        this.nrOfEngines = nrOfEngines;
        this.model = model;
        this.nrOfSeats = nrOfSeats;
        this.passengers = new ArrayList<Passenger>();
    }

    public void showInfo() {
        System.out.println("Id:" + id + "\n" + "Length:" + length + "\n" + "Tail height:" + tailHeight + "\n"
                + "Wing span:" + wingspan + "\n" + "Number of engines:" + nrOfEngines + "\n" + "Number of seats:"
                + nrOfSeats + "\n" + "Model:" + model + "\n" + "Current passengers:");

        for (Passenger passenger : passengers) {
            System.out.println("  - " + passenger.name);
        }
        System.out.println();
    }
}
