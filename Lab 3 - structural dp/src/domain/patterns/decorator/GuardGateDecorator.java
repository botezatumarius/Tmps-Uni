package domain.patterns.decorator;

import domain.models.operations.AirportOperation;

public class GuardGateDecorator extends OperationDecorator {
    private boolean securityGuardSet = false;

    public GuardGateDecorator(AirportOperation decoratedOperation) {
        super(decoratedOperation);
    }

    @Override
    public void operation() {
        decoratedOperation.operation();
        setSecurityGuard();
    }

    private void setSecurityGuard() {
        if (!securityGuardSet) {
            securityGuardSet = true;
            System.out.println("Security guard has been set near gate");
        } else {
            System.out.println("Security guard is already present near gate");
        }
    }
}
