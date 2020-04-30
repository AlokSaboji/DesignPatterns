package Adapter;

public class Student {

    private Pen pen = new PenAdapter();

    public void writeAssignment(String data){
        pen.write(data);
    }
}
