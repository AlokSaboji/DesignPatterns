package command;

public class TurnGreen implements Command {

    TrafficLight trafficLight;

    TurnGreen(TrafficLight trafficLight){
        this.trafficLight = trafficLight;
    }

    @Override
    public void execute() {
        System.out.println("The turns will now be turned Green");
        this.trafficLight.turnGreen();
    }
}
