package Observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject{
    private String name;
    private String video;
    private List<Subscriber> subscriberList = new ArrayList<>();

    public Channel(String name) {
        this.name = name;
    }
    @Override
    public void uploadVideo(String video){
        this.video = video;
        this.informSubscribers(video);
    }
    @Override
    public void informSubscribers(String video){
        for (Subscriber subscriber : subscriberList) {
            subscriber.receiveUpdate(video,this);
        }
    }
    @Override
    public void addSubscribers(Subscriber subscriber){
        subscriberList.add(subscriber);
    }


    public String getName() {
        return name;
    }
    public String getVideo() {
        return video;
    }
    public List<Subscriber> getSubscriberList() {
        return subscriberList;
    }

}
