package domain.airplanes;

public class BombardierBuilder extends AirplaneBuilder {

    public BombardierBuilder() {
        this.airplane.model = "Bombardier";
        this.airplane = new Bombardier();
    }

    @Override
    public Airplane build() {
        return this.airplane;
    }
}
