package domain.models.systems;

public class PassengerSystem implements IPassengerSystem {
    public boolean registerPassenger(String passengerName) {
        // Logic for registering a passenger
        System.out.println("Registering passenger: " + passengerName);
        return true;
    }
}
