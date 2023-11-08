package domain.patterns.composite;

import java.util.ArrayList;
import java.util.List;

import domain.models.operations.AirportOperation;

public class AirportOperations extends AbstractAirportOperations {
    private List<AirportOperation> components = new ArrayList<>();

    @Override
    public void operation() {
        for (AirportOperation component : components) {
            component.operation();
        }
    }

    public void addComponent(AirportOperation component) {
        components.add(component);
    }

    public void removeComponent(AirportOperation component) {
        components.remove(component);
    }
}
