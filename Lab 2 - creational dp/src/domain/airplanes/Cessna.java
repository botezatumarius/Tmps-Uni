package domain.airplanes;

import domain.passengers.Passenger;

public class Cessna extends Airplane {

    public void showInfo() {
        System.out.println("Id:" + id + "\n" + "Length:" + length + "\n" + "Tail height:" + tailHeight + "\n"
                + "Wing span:" + wingspan + "\n" + "Number of engines:" + nrOfEngines + "\n" + "Number of seats:"
                + nrOfSeats + "\n" + "Model:" + model + "\n" + "Current passengers:");

        for (Passenger passenger : passengers) {
            System.out.println("  - " + passenger.name);
        }
        System.out.println();
    }

}
