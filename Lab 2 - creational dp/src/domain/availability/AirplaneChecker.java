package domain.availability;

import domain.airplanes.Airplane;

public class AirplaneChecker implements AvailabilityManager {

    public boolean checkAvailability(Object item) {
        if (item instanceof Airplane) {
            Airplane airplane = (Airplane) item;
            if (airplane.nrOfSeats != 0) {
                return true;
            } else
                return false;
        } else {
            throw new IllegalArgumentException("The object passed in is not an airplane!");
        }
    }
}
