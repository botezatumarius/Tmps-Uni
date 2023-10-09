package domain.passengers;

public class Child extends Passenger {
    public void showInfo() {
        System.out.println("Id:" + getId() + "\n" + "Name:" + getName());
    }
}
