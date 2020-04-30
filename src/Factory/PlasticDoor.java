package Factory;

public class PlasticDoor implements Door {
    @Override
    public void safeGuard() {
        System.out.println("Giving plastic protection");
    }
}
