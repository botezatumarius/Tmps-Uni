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
}
