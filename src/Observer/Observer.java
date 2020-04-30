package Observer;

public interface Observer {
    public void subscribe(Channel channel);
    public void receiveUpdate(String video,Channel channel);
}
