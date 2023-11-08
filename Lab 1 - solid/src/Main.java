import domain.airplanes.Airplane;
import domain.airplanes.Boeing;
import domain.airports.Airport;
import domain.airports.General;
import domain.availability.AddPassenger;
import domain.availability.AddPlane;
import domain.availability.ItemAdder;
import domain.passengers.Adult;
import domain.passengers.Passenger;

public class Main {
    public static void main(String[] args) throws Exception {
        General generalAirport = new General(1, "Paris", 2000, 3000, 1000);
        Airplane boeing777 = new Boeing(1, 200, 450, 123, 2, "Boeing 777", 350);
        Passenger george = new Adult(1, "George", "American");
        ItemAdder<Airplane> addpa = new AddPassenger();
        ItemAdder<Airport> addpl = new AddPlane();
        addpa.addItem(boeing777, george);
        addpl.addItem(generalAirport, boeing777);
        boeing777.showInfo();
        generalAirport.showInfo();
    }
}
