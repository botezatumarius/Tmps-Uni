package domain.cloning;

import domain.airplanes.Airplane;
import domain.airports.Airport;
import domain.passengers.Passenger;

public class CloneFactory {
    public Object getClone(Object object) {
        if (object instanceof Airport) {
            Airport airport = (Airport) object;
            return airport.makeCopy();
        }
        if (object instanceof Airplane) {
            Airplane airplane = (Airplane) object;
            return airplane.makeCopy();
        }
        if (object instanceof Passenger) {
            Passenger passenger = (Passenger) object;
            return passenger.makeCopy();
        }
        throw new IllegalArgumentException("Unsupported object type: " + object.getClass().getName());
    }
}
