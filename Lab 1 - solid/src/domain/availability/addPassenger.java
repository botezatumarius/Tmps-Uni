package domain.availability;

import domain.airplanes.Airplane;
import domain.passengers.Passenger;

public class addPassenger {
    public void addPass(Airplane airplane, Passenger passenger) {
        AirplaneChecker check = new AirplaneChecker();
        if (check.checkAirplane(airplane)) {
            airplane.passengers.add(passenger);
            airplane.nrOfSeats -= 1;
        } else {
            throw new IllegalStateException("This airplane doesn't have any more seats!");
        }
    }
}
