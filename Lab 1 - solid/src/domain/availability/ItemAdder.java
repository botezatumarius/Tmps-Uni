package domain.availability;

public interface ItemAdder<T> {
    public void addItem(T collection, Object item);
}
