import domain.models.operations.AirportOperation;
import domain.models.operations.Gate;
import domain.models.operations.Runway;
import domain.models.operations.Terminal;
import domain.patterns.composite.*;
import domain.patterns.decorator.*;
import domain.patterns.facade.*;
import domain.patterns.proxy.*;

public class Main {
    public static void main(String[] args) throws Exception {
        AirportFacade facade = new AirportFacade();
        facade.addOperation("Gate", 1);
        facade.addOperation("Runway", 2);
        facade.addOperation("Terminal", 3);
        facade.addOperation("GuardGate", 4);
        facade.showOperations();
        facade.bookTicketAndLuggage("Marius", "1A", "2 bags");
        facade.bookTicketAndLuggage("Marius", "2A", "2 bags");
    }

}
