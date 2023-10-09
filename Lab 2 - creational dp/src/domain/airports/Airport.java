package domain.airports;

import java.util.ArrayList;
import domain.airplanes.Airplane;
import domain.airplanes.Entity;
import domain.cloning.AirportPrototype;

public abstract class Airport implements Entity, AirportPrototype {
    public int id;
    public String location;
    public float length;
    public float width;
    public int airplaneSpaces;
    public ArrayList<Airplane> airplanes;

    public Airport(int id, String location, float length, float width, int airplaneSpaces) {
        this.id = id;
        this.location = location;
        this.length = length;
        this.width = width;
        this.airplaneSpaces = airplaneSpaces;
        this.airplanes = new ArrayList<Airplane>();
    }

    public void showInfo() {
        System.out.println("Id:" + id + "\n" + "Location:" + location + "\n" + "Length:" + length + "\n" + "Width:"
                + width + "\n" + "Available airplane spaces:" + airplaneSpaces + "\n" + "Current airplanes:");

        for (Airplane airplane : airplanes) {
            System.out.println("  - " + airplane.model);
        }
        System.out.println();
    }

    public Airport makeCopy() {
        Airport airportObject = null;
        try {
            airportObject = (Airport) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Was not able to clone airport");
        }
        airportObject.airplanes = new ArrayList<Airplane>();
        return airportObject;
    }
}
