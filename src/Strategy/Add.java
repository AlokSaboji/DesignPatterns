package Strategy;

public class Add implements Calculator {



    @Override
    public void doOperation(int n1,int n2) {
        System.out.println("Adding 2 numbers: " + (n1+n2));
    }
}
