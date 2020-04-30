package command;

public class CommandPatternDemo {

    public static void main(String[] args) {

        TrafficLight trafficLight = new TrafficLight();
        TrafficBroker trafficBroker = new TrafficBroker();
        trafficBroker.takeCommands(new TurnRed(trafficLight));
        trafficBroker.takeCommands(new TurnYellow(trafficLight));
        trafficBroker.takeCommands(new TurnGreen(trafficLight));
        trafficBroker.takeCommands(new TurnRed(trafficLight));

        trafficBroker.execute();


    }
}
