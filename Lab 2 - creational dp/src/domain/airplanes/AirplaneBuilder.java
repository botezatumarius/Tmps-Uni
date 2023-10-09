package domain.airplanes;

import java.util.ArrayList;

import domain.passengers.Passenger;

public abstract class AirplaneBuilder {

    protected Airplane airplane;

    public AirplaneBuilder setId(int id) {
        this.airplane.id = id;
        return this;
    }

    public AirplaneBuilder setLength(float length) {
        this.airplane.length = length;
        return this;
    }

    public AirplaneBuilder setTailHeight(float tailHeight) {
        this.airplane.tailHeight = tailHeight;
        return this;
    }

    public AirplaneBuilder setWingSpan(float wingSpan) {
        this.airplane.wingspan = wingSpan;
        return this;
    }

    public AirplaneBuilder setNrOfEngines(int nrOfEngines) {
        this.airplane.nrOfEngines = nrOfEngines;
        return this;
    }

    public AirplaneBuilder setNrOfSeats(int nrOfSeats) {
        this.airplane.nrOfSeats = nrOfSeats;
        return this;
    }

    public AirplaneBuilder setPassengers(ArrayList<Passenger> passengers) {
        this.airplane.passengers = new ArrayList<Passenger>();
        this.airplane.passengers.addAll(passengers);
        return this;

    }

    public abstract Airplane build();
}