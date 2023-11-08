package domain.models.operations;

public class Runway implements AirportOperation {
    public int id;

    public Runway(int id) {
        this.id = id;
    }

    @Override
    public void operation() {
        System.out.println("Implemented a runway operation with id:" + id);
    }
}
