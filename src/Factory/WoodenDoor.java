package Factory;

public class WoodenDoor implements Door {

    @Override
    public void safeGuard() {
        System.out.println("Giving wood protection");
    }
}
