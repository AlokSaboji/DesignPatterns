package Observer;

public interface Subject {
    public void uploadVideo(String video);
    public void informSubscribers(String video);
    public void addSubscribers(Subscriber subscriber);
}
