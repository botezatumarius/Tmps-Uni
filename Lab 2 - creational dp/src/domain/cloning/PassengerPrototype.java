package domain.cloning;

import domain.passengers.Passenger;

public interface PassengerPrototype extends Cloneable {
    public Passenger makeCopy();
}
