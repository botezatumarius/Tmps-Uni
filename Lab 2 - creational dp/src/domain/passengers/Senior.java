package domain.passengers;

public class Senior extends Passenger {
    public void showInfo() {
        System.out.println("Id:" + getId() + "\n" + "Name:" + getName());
    }
}
