package domain.airplanes;

import java.util.ArrayList;
import domain.passengers.Passenger;

public class BoeingBuilder extends AirplaneBuilder {

    public BoeingBuilder() {
        this.airplane = new Boeing();
        this.airplane.model = "Boeing";
        this.airplane.passengers = new ArrayList<Passenger>();
    }

    @Override
    public Airplane build() {
        return this.airplane;
    }

}
