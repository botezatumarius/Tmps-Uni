import domain.airplanes.Boeing;
import domain.airplanes.BoeingBuilder;
import domain.airports.AirportManager;
import domain.airports.General;
import domain.passengers.Passenger;
import domain.passengers.PassengerFactory;

public class Main {
    public static void main(String[] args) throws Exception {
        AirportManager airportManager = AirportManager.getInstance();
        General generalAirport = new General(1, "Paris", 2000, 3000, 1000);
        airportManager.addAirport(generalAirport);
        PassengerFactory passengerFactory = new PassengerFactory();
        Passenger Marius = passengerFactory.createPassenger("Adult");
        BoeingBuilder builder = new BoeingBuilder();
        Boeing boeingPlane = (Boeing) builder.setId(1).setLength(1000).setNrOfEngines(2).setNrOfSeats(999)
                .setTailHeight(300)
                .setWingSpan(100).build();
        airportManager.addPassenger(boeingPlane, Marius);
        airportManager.addAirplane(generalAirport, boeingPlane);
        airportManager.showAirports();
    }
}
