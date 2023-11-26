package domain.patterns.observer;

public class FlightControlTower implements AirportObserver {
    private String name;

    public FlightControlTower(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received update: " + message);
    }
}
