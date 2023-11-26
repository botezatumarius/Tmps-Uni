package domain.patterns.command;

import domain.models.Light;

public class SwitchLightsCommand implements Command {
    private Light runwayLights;

    public SwitchLightsCommand(Light runwayLights) {
        this.runwayLights = runwayLights;
    }

    @Override
    public void execute() {
        runwayLights.switchLights();
    }
}
