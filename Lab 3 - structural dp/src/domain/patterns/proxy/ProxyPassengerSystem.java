package domain.patterns.proxy;

import java.util.ArrayList;
import java.util.List;

import domain.models.systems.IPassengerSystem;
import domain.models.systems.PassengerSystem;

public class ProxyPassengerSystem implements IPassengerSystem {
    private List<String> passengerCashe = new ArrayList<String>();
    private IPassengerSystem passengerSystem = new PassengerSystem();

    @Override
    public boolean registerPassenger(String passengerName) {
        if (passengerCashe.contains(passengerName)) {
            return false;
        } else {
            passengerCashe.add(passengerName);
            passengerSystem.registerPassenger(passengerName);
            return true;
        }
    }
}
