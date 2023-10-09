package domain.airports;

import java.util.ArrayList;

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
}
