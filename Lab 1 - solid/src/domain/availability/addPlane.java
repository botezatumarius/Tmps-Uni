package domain.availability;

import domain.airplanes.Airplane;
import domain.airports.Airport;

public class addPlane {
    public void addAirplane(Airport airport, Airplane airplane) {
        AirportChecker check = new AirportChecker();
        if (check.checkAirport(airport)) {
            airport.airplanes.add(airplane);
            airport.airplaneSpaces -= 1;
        } else {
            throw new IllegalStateException("This airport doesn't have any more airplane spaces!");
        }
    }
}