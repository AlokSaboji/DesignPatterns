package Adapter;

public class PenAdapter implements Pen {


    @Override
    public void write(String data) {
        Marker marker = new Marker();
        marker.mark(data);
    }
}
