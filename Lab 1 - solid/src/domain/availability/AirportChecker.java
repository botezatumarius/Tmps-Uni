package domain.availability;

import domain.airports.Airport;

public class AirportChecker {

    public boolean checkAirport(Airport airport) {
        if (airport.airplaneSpaces != 0) {
            return true;
        } else
            return false;
    }

}
