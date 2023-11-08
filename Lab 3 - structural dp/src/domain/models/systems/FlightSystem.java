package domain.models.systems;

public class FlightSystem implements IFlightSystem {
    public void bookTicket(String passenger, String flightNumber) {
        // Logic for booking a ticket
        System.out.println("Booking ticket for " + passenger + " on flight " + flightNumber);
    }
}
