package Strategy;

public class StrategyDemo {
    public static void main(String[] args) {

        Context context = new Context(new Add());
        context.executeStrategy(1,2);

        context = new Context(new Substraction());
        context.executeStrategy(1,2);

        context = new Context(new Multiply());
        context.executeStrategy(1,2);


    }
}
