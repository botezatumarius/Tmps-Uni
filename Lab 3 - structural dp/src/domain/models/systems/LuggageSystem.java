package domain.models.systems;

public class LuggageSystem implements ILuggageSystem {
    public void checkInLuggage(String passenger, String luggageDetails) {
        // Logic for luggage check-in
        System.out.println("Checking in luggage for " + passenger + ": " + luggageDetails);
    }
}