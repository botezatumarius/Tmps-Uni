import domain.airplanes.Boeing;
import domain.airports.General;
import domain.availability.AddPassenger;
import domain.availability.AddPlane;
import domain.passengers.Adult;

public class Main {
    public static void main(String[] args) throws Exception {
        General generalAirport = new General(1, "Paris", 2000, 3000, 1000);
        Boeing boeing777 = new Boeing(1, 200, 450, 123, 2, "Boeing 777", 350);
        Adult george = new Adult(1, "George", "American");
        AddPassenger addpa = new AddPassenger();
        AddPlane addpl = new AddPlane();
        addpa.addItem(boeing777, george);
        addpl.addItem(generalAirport, boeing777);
        boeing777.showInfo();
        generalAirport.showInfo();
    }
}
