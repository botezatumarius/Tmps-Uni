package domain.passengers;

public class Adult extends Passenger {

    public void showInfo() {
        System.out.println("Id:" + getId() + "\n" + "Name:" + getName());
    }
}