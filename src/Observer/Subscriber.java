package Observer;

import java.util.ArrayList;
import java.util.List;

public class Subscriber implements Observer{

    private String name;
    private List<Channel> channelList = new ArrayList<>();

    public Subscriber(String name) {
        this.name = name;
    }
    @Override
    public void subscribe(Channel channel){
        channelList.add(channel);
    }
    @Override
    public void receiveUpdate(String video,Channel channel){
        System.out.println( "Hi "+ name +", There is new video - " + video +" in channel "+ channel.getName() );
    }
}
