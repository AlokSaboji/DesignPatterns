package command;

import java.util.ArrayList;
import java.util.List;

public class TrafficBroker {

    List<Command> commandList = new ArrayList<>();

    public void takeCommands(Command command){
        commandList.add(command);
    }


    public void execute(){
        for(int i=0; i < commandList.size();i++ ){
            commandList.get(i).execute();
        }
    }
}
