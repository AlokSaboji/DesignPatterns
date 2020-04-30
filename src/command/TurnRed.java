package command;

public class TurnRed implements Command {

    TrafficLight trafficLight;

    TurnRed(TrafficLight trafficLight){
        this.trafficLight = trafficLight;
    }

    @Override
    public void execute() {
        System.out.println("The turns will now be turned red");
        this.trafficLight.turnRed();
    }
}
