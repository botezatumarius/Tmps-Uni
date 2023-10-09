package domain.passengers;

public class PassengerFactory {
    public Passenger createPassenger(String type) {
        Passenger passenger;
        switch (type) {
            case "Adult":
                passenger = new Adult();
                break;
            case "Child":
                passenger = new Child();
                break;
            case "Senior":
                passenger = new Senior();
                break;
            default:
                throw new IllegalArgumentException("Unsupported passenger type: " + type);
        }
        return passenger;
    }
}
