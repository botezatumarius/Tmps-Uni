package domain.models.operations;

public class Gate implements AirportOperation {
    public int id;

    public Gate(int id) {
        this.id = id;
    }

    @Override
    public void operation() {
        System.out.println("Implemented a gate operation with id:" + id);
    }
}
