package domain.airplanes;

import java.util.ArrayList;

import domain.cloning.AirplanePrototype;
import domain.passengers.Passenger;

public abstract class Airplane implements Entity, AirplanePrototype {
    public int id;
    public float length;
    public float tailHeight;
    public float wingspan;
    public int nrOfEngines;
    public int nrOfSeats;
    public String model;
    public ArrayList<Passenger> passengers;

    public Airplane makeCopy() {
        Airplane airplaneObject = null;
        try {
            airplaneObject = (Airplane) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Was not able to clone airplane");
        }
        return airplaneObject;
    }
}
