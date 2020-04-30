package Strategy;

public class Context  {
    private Calculator calculator;

    public Context(Calculator calculator) {
        this.calculator = calculator;
    }

    public void executeStrategy(int n1,int n2){
        calculator.doOperation(n1,n2);
    }
}
