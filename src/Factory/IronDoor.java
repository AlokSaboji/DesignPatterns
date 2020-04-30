package Factory;

public class IronDoor implements Door {

    @Override
    public void safeGuard() {
        System.out.println("Giving Iron Protection");
    }
}
