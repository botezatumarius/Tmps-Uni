package domain.availability;

import domain.airplanes.Airplane;
import domain.passengers.Passenger;

public class AddPassenger implements ItemAdder<Airplane> {

    public void addItem(Airplane airplane, Object item) {
        AirplaneChecker check = new AirplaneChecker();
        if (check.checkAvailability(airplane)) {
            airplane.passengers.add((Passenger) item);
            airplane.nrOfSeats -= 1;
        } else {
            throw new IllegalStateException("This airplane doesn't have any more seats!");
        }
    }

}
