package domain.airplanes;

public class BoeingBuilder extends AirplaneBuilder {

    public BoeingBuilder() {
        this.airplane.model = "Boeing";
        this.airplane = new Boeing();
    }

    @Override
    public Airplane build() {
        return this.airplane;
    }

}
