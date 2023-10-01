import domain.airplanes.Boeing;
import domain.airports.General;
import domain.availability.addPassenger;
import domain.availability.addPlane;
import domain.passengers.Adult;

public class Main {
    public static void main(String[] args) throws Exception {
        General generalAirport = new General(1, "Paris", 2000, 3000, 1000);
        Boeing boeing777 = new Boeing(1, 200, 450, 123, 2, "Boeing 777", 350);
        Adult george = new Adult(1, "George", "American");
        addPassenger addpa = new addPassenger();
        addPlane addpl = new addPlane();
        addpa.addPass(boeing777, george);
        addpl.addAirplane(generalAirport, boeing777);
        boeing777.showInfo();
        generalAirport.showInfo();
    }
}
