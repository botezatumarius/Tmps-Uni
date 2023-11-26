import domain.models.RunwayLights;
import domain.patterns.command.SwitchLightsCommand;
import domain.patterns.observer.Airport;
import domain.patterns.observer.FlightControlTower;

public class Main {
    public static void main(String[] args) throws Exception {
        Airport airport = new Airport();
        FlightControlTower tower1 = new FlightControlTower("Tower 1");
        FlightControlTower tower2 = new FlightControlTower("Tower 2");
        airport.addObserver(tower1);
        airport.addObserver(tower2);
        airport.setCommand(new SwitchLightsCommand(new RunwayLights(airport)));
        airport.executeCommand();
        airport.executeCommand();
    }
}
