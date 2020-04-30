package command;

public class TurnYellow implements Command {

    TrafficLight trafficLight;

    TurnYellow(TrafficLight trafficLight){
        this.trafficLight = trafficLight;
    }

    @Override
    public void execute() {
        System.out.println("The turns will now be turned Yellow");
        this.trafficLight.turnYellow();
    }
}