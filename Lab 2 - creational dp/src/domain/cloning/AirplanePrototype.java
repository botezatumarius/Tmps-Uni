package domain.cloning;

import domain.airplanes.Airplane;

public interface AirplanePrototype extends Cloneable {
    public Airplane makeCopy();
}
