package domain.patterns.observer;

import java.util.ArrayList;
import java.util.List;

import domain.patterns.command.Command;

public class Airport {
    private List<AirportObserver> observers = new ArrayList<>();
    private String status;
    public Command command;

    public void addObserver(AirportObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(AirportObserver observer) {
        observers.remove(observer);
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    private void notifyObservers() {
        for (AirportObserver observer : observers) {
            observer.update("Airport status: " + status);
        }
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}