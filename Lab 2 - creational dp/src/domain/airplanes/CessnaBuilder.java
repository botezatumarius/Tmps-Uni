package domain.airplanes;

import java.util.ArrayList;

import domain.passengers.Passenger;

public class CessnaBuilder extends AirplaneBuilder {

    public CessnaBuilder() {
        this.airplane = new Cessna();
        this.airplane.model = "Cessna";
        this.airplane.passengers = new ArrayList<Passenger>();
    }

    @Override
    public Airplane build() {
        return this.airplane;
    }

}
