package domain.airports;

import java.util.ArrayList;

import domain.airplanes.Airplane;
import domain.availability.AddPassenger;
import domain.availability.AddPlane;
import domain.passengers.Passenger;

public class AirportManager {
    private static AirportManager manager;
    public ArrayList<Airport> airports;

    private AirportManager() {
        airports = new ArrayList<Airport>();
    }

    public static synchronized AirportManager getInstance() {
        if (manager == null)
            manager = new AirportManager();
        return manager;
    }

    public void addAirport(Airport airport) {
        airports.add(airport);
    }

    public void addAirplane(Airport airport, Airplane airplane) {
        AddPlane addPla = new AddPlane();
        addPla.addItem(airport, airplane);
    }

    public void addPassenger(Airplane airplane, Passenger passenger) {
        AddPassenger addPas = new AddPassenger();
        addPas.addItem(airplane, passenger);
    }

    public void showAirports() {
        for (Airport airport : airports)
            airport.showInfo();
    }
}
