package domain.models.operations;

public class Terminal implements AirportOperation {
    public int id;

    public Terminal(int id) {
        this.id = id;
    }

    @Override
    public void operation() {
        System.out.println("Implemented a terminal operation with id" + id);
    }
}