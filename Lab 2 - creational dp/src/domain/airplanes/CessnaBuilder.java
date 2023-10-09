package domain.airplanes;

public class CessnaBuilder extends AirplaneBuilder {

    public CessnaBuilder() {
        this.airplane.model = "Cessna";
        this.airplane = new Cessna();
    }

    @Override
    public Airplane build() {
        return this.airplane;
    }

}
