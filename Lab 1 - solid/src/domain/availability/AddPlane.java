package domain.availability;

import domain.airplanes.Airplane;
import domain.airports.Airport;

public class AddPlane implements ItemAdder<Airport> {
    public void addItem(Airport airport, Object item) {
        AirportChecker check = new AirportChecker();
        if (check.checkAvailability(airport)) {
            airport.airplanes.add((Airplane) item);
            airport.airplaneSpaces -= 1;
        } else {
            throw new IllegalStateException("This airport doesn't have any more airplane spaces!");
        }
    }
}