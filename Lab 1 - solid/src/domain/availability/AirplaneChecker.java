package domain.availability;

import domain.airplanes.Airplane;

public class AirplaneChecker {
    public boolean checkAirplane(Airplane airplane) {
        if (airplane.nrOfSeats != 0) {
            return true;
        } else
            return false;
    }

}
