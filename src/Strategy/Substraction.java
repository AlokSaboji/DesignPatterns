package Strategy;

public class Substraction implements Calculator {

    @Override
    public void doOperation(int n1,int n2){
        System.out.println("Subtracting 2 numbers:" + (n1-n2));
    }
}
