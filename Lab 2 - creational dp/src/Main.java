import domain.airplanes.Boeing;
import domain.airplanes.BoeingBuilder;
import domain.airports.AirportManager;
import domain.airports.General;
import domain.cloning.CloneFactory;
import domain.passengers.Passenger;
import domain.passengers.PassengerFactory;

public class Main {
    public static void main(String[] args) throws Exception {
        AirportManager airportManager = AirportManager.getInstance();
        General generalAirport = new General(1, "Paris", 2000, 3000, 1000);
        airportManager.addAirport(generalAirport);
        PassengerFactory passengerFactory = new PassengerFactory();
        Passenger Marius = passengerFactory.createPassenger("Adult");
        Marius.setId(1);
        Marius.setName("Marius");
        Passenger George = passengerFactory.createPassenger("Child");
        George.setId(1);
        George.setName("George");
        BoeingBuilder builder = new BoeingBuilder();
        Boeing boeingPlane = (Boeing) builder.setId(1).setLength(1000).setNrOfEngines(2).setNrOfSeats(1000)
                .setTailHeight(300)
                .setWingSpan(100).build();
        airportManager.addAirplane(generalAirport, boeingPlane);
        CloneFactory cloneFactory = new CloneFactory();
        Boeing boeingPlane2 = (Boeing) cloneFactory.getClone(boeingPlane);
        boeingPlane2.id = 2;
        airportManager.addPassenger(boeingPlane, Marius);
        airportManager.addPassenger(boeingPlane2, George);
        airportManager.addAirplane(generalAirport, boeingPlane2);
        airportManager.showAirports();
        airportManager.showPlanes(generalAirport);
    }
}
