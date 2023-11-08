# Solid Principles

## Author: Botezatu Marius

---

## Objectives:

- Study and understand the SOLID Principles.
- Choose a domain, define its main classes/models/entities and choose the appropriate instantiation mechanisms.
- Create a sample project that respects SOLID Principles.

## Implementation

- I decided to create a simple airport management system where you can create different types of airports, different
  types of airplanes and also different types of passengers. The passengers can be added to a specific airplane and an airplane can
  be added to a specific airport.

### Single Responsibility Principle:

- Classes have only one job to do. For example, the AirplaneChecker class is only responsible for checking if there are any more empty
  seats available in that airplane.

```
public class AirplaneChecker implements AvailabilityManager {

    public boolean checkAvailability(Object item) {
        if (item instanceof Airplane) {
            Airplane airplane = (Airplane) item;
            if (airplane.nrOfSeats != 0) {
                return true;
            } else
                return false;
        } else {
            throw new IllegalArgumentException("The object passed in is not an airplane!");
        }
    }
}
```

- The AddPassenger class is only responsible for adding a new passenger to an airplane. To check if the airplane has any available seats the above class is called.

```
public class AddPassenger implements ItemAdder<Airplane> {

    public void addItem(Airplane airplane, Object item) {
        AirplaneChecker check = new AirplaneChecker();
        if (check.checkAvailability(airplane)) {
            airplane.passengers.add((Passenger) item);
            airplane.nrOfSeats -= 1;
        } else {
            throw new IllegalStateException("This airplane doesn't have any more seats!");
        }
    }

}
```

### Open-closed principle:

- Classes are open for extension but closed for modification. This means that new functionality can be added without the need to modify the already existing classes. An example is adding new airplanes. This can be done very easily by just creating a new class and extending it with the abstract class Airplane.

```
public abstract class Airplane implements Entity {
    public int id;
    public float length;
    public float tailHeight;
    public float wingspan;
    public int nrOfEngines;
    public int nrOfSeats;
    public String model;
    public ArrayList<Passenger> passengers;

    public Airplane(int id, float length, float tailHeight, float wingsSpan, int nrOfEngines, String model,
            int nrOfSeats) {
        this.id = id;
        this.length = length;
        this.tailHeight = tailHeight;
        this.wingspan = wingsSpan;
        this.nrOfEngines = nrOfEngines;
        this.model = model;
        this.nrOfSeats = nrOfSeats;
        this.passengers = new ArrayList<Passenger>();
    }

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
```

```
public class Boeing extends Airplane {

    public Boeing(int id, float length, float tailHeight, float wingsSpan, int nrOfEngines, String model,
            int nrOfSeats) {
        super(id, length, tailHeight, wingsSpan, nrOfEngines, model, nrOfSeats);
    }

}
```

### Liskov Substitution Principle

- Any of the airplane classes can substitute their base Airplane class without any issues. Same thing can be said about the airports which can substitute their base Airport class and the passengers which can substitute their base Passenger class.

### Interface Segregation Principle

- There are no classes that implement interfaces which have methods that they do not need. First of all, the Airplane, Airport and Passenger abstract classes all implement the interface Entity. It has only 1 method that is used to show info about that specific entity, a very useful functionality.

```
public interface Entity {
    public void showInfo();
}
```

- The AddPassenger and AddPlane classes both implement the interface ItemAdder which has a method that is used to add a specific item to a collection. This is important for the AddPassenger class because it's functionality is to add a passenger to the collection of passengers of a specific airplane and it is also important for the AddPlane class because it's functionality is to add an airplane to the collection of airplanes of a specific airport.

```
public interface ItemAdder<T> {
    public void addItem(T collection, Object item);
}
```

### Dependency Inversion principle:

- AddPassenger and AddPlane classes do not depend on a specific implementation of an airport or airplane. Instead, they depend on the abstract classes Airport and Airplane.

```
public class AddPassenger implements ItemAdder<Airplane> {

    public void addItem(Airplane airplane, Object item) {
        AirplaneChecker check = new AirplaneChecker();
        if (check.checkAvailability(airplane)) {
            airplane.passengers.add((Passenger) item);
            airplane.nrOfSeats -= 1;
        } else {
            throw new IllegalStateException("This airplane doesn't have any more seats!");
        }
    }

}
```

```
public class AddPlane implements ItemAdder<Airport> {
    public void addItem(Airport airport, Object item) {
        AirportChecker check = new AirportChecker();
        if (check.checkAvailability(airport)) {
            airport.airplanes.add((Airplane) item);
            airport.airplaneSpaces -= 1;
        } else {
            throw new IllegalStateException("This airport doesn't have any more airplane spaces!");
        }
    }
}
```

## Conclusion

The airport management system successfully follows the SOLID design principles, therefore, adding new functionalities and understanding specific classes is easy and not very time-consuming.
