package domain.availability;

import domain.airports.Airport;

public class AirportChecker implements AvailabilityManager {
    public boolean checkAvailability(Object item) {
        if (item instanceof Airport) {
            Airport airport = (Airport) item;
            if (airport.airplaneSpaces != 0) {
                return true;
            } else
                return false;
        } else {
            throw new IllegalArgumentException("The object passed in is not an airport!");
        }
    }

}
