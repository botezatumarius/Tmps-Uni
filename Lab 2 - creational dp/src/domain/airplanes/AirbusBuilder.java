package domain.airplanes;

public class AirbusBuilder extends AirplaneBuilder {

    public AirbusBuilder() {
        this.airplane.model = "Airbus";
        this.airplane = new Airbus();
    }

    @Override
    public Airplane build() {
        return this.airplane;
    }

}
