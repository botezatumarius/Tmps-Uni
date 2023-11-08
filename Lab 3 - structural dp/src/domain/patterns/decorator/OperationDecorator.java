package domain.patterns.decorator;

import domain.models.operations.AirportOperation;

public abstract class OperationDecorator implements AirportOperation {
    protected AirportOperation decoratedOperation;

    public OperationDecorator(AirportOperation decoratedOperation) {
        this.decoratedOperation = decoratedOperation;
    }

    public void operation() {
        decoratedOperation.operation();
    }
}
