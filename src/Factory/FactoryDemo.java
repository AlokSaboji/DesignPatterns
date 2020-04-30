package Factory;

public class FactoryDemo {

    public static void main(String[] args) {
        Factory factory = new Factory();

        factory.giveMeDoor("wood").safeGuard();
    }
}
