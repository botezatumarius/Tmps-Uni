package domain.patterns.composite;

import domain.models.operations.AirportOperation;

public abstract class AbstractAirportOperations implements AirportOperation {
    public abstract void operation();

    public abstract void addComponent(AirportOperation component);

    public abstract void removeComponent(AirportOperation component);
}
