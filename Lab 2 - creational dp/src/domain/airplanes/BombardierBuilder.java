package domain.airplanes;

import java.util.ArrayList;

import domain.passengers.Passenger;

public class BombardierBuilder extends AirplaneBuilder {

    public BombardierBuilder() {
        this.airplane = new Bombardier();
        this.airplane.model = "Bombardier";
        this.airplane.passengers = new ArrayList<Passenger>();
    }

    @Override
    public Airplane build() {
        return this.airplane;
    }
}
