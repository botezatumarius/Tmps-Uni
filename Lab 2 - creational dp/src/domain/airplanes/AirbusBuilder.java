package domain.airplanes;

import java.util.ArrayList;

import domain.passengers.Passenger;

public class AirbusBuilder extends AirplaneBuilder {

    public AirbusBuilder() {
        this.airplane = new Airbus();
        this.airplane.model = "Airbus";
        this.airplane.passengers = new ArrayList<Passenger>();
    }

    @Override
    public Airplane build() {
        return this.airplane;
    }

}
