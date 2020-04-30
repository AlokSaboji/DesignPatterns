package Strategy;

public class Multiply implements Calculator {



    @Override
    public void doOperation(int n1,int n2) {
        System.out.println("Multiplying 2 numbers: " +  (n1*n2));
    }
}
