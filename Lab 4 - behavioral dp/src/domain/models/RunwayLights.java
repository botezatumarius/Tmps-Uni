package domain.models;

import domain.patterns.observer.Airport;

public class RunwayLights implements Light {
    private boolean switchedOn;
    private Airport airport;

    public RunwayLights(Airport airport) {
        this.airport = airport;
    }

    public void switchLights() {
        switchedOn = !switchedOn;
        if (switchedOn)
            airport.setStatus("Runway lights of the airport have been turned on");
        else
            airport.setStatus("Runway lights of the airport have been turned off");
    }
}
