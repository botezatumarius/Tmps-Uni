# Creational Design Patterns

## Author: Botezatu Marius

---

## Objectives:

- Study and understand the Creational Design Patterns.
- Choose a domain, define its main classes/models/entities and choose the appropriate instantiation mechanisms.
- Use some creational design patterns for object instantiation in a sample project.

## Implementation

- I decided to continue my simple airport management system from lab 1 and implement creational design patterns into it. In this system you can create different types of airports, different
  types of airplanes and also different types of passengers. The passengers can be added to a specific airplane and an airplane can be added to a specific airport.

### Singleton:

- The singleton design pattern ensures that only one instance of a specific class exists. Therefore, I implemented this pattern into the AirportManager class which is used for managing the whole airport system, all of the airports and the airplanes inside them.

```
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

    public void showPlanes(Airport airport) {
        for (Airplane airplane : airport.airplanes)
            airplane.showInfo();
    }
}

```

### Factory:

- This design pattern can be seen in the class PassengerFactory. It has a method called createPassenger which expects as an argument a string of the passenger type and returns one of the 3 concrete classes that extend the Passenger abstract class: Child, Adult or Senior.

```
public class PassengerFactory {
    public Passenger createPassenger(String type) {
        Passenger passenger;
        switch (type) {
            case "Adult":
                passenger = new Adult();
                break;
            case "Child":
                passenger = new Child();
                break;
            case "Senior":
                passenger = new Senior();
                break;
            default:
                throw new IllegalArgumentException("Unsupported passenger type: " + type);
        }
        return passenger;
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
