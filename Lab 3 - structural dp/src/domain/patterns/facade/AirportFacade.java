package domain.patterns.facade;

import domain.models.operations.*;
import domain.models.systems.*;
import domain.patterns.composite.AbstractAirportOperations;
import domain.patterns.composite.AirportOperations;
import domain.patterns.decorator.GuardGateDecorator;
import domain.patterns.proxy.ProxyPassengerSystem;

public class AirportFacade {
    private IFlightSystem flightSystem;
    private IPassengerSystem passengerSystemProxy;
    private ILuggageSystem luggageSystem;
    private AbstractAirportOperations airportOperations;

    AirportFacade() {
        this.flightSystem = new FlightSystem();
        this.passengerSystemProxy = new ProxyPassengerSystem();
        this.luggageSystem = new LuggageSystem();
        this.airportOperations = new AirportOperations();
    }

    public void bookTicketAndLuggage(String passenger, String flightNumber, String luggageDetails) {
        passengerSystemProxy.registerPassenger(passenger);
        flightSystem.bookTicket(passenger, flightNumber);
        luggageSystem.checkInLuggage(passenger, luggageDetails);
    }

    public void addOperation(String operationType, int id) {
        AirportOperation operation = createOperation(operationType, id);
        if (operation != null) {
            airportOperations.addComponent(operation);
        } else {
            System.out.println("Invalid operation type.");
        }
    }

    private AirportOperation createOperation(String operationType, int id) {
        switch (operationType) {
            case "Gate":
                return new Gate(id);
            case "GuardGate":
                return new GuardGateDecorator(new Gate(id));
            case "Runway":
                return new Runway(id);
            case "Terminal":
                return new Terminal(id);
            default:
                return null;
        }
    }

    public void removeOperation(AirportOperation operation) {
        airportOperations.removeComponent(operation);
    }

    public void showOperations() {
        airportOperations.operation();
    }
}
