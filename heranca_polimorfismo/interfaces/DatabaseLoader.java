package nelioAlves.course.heranca_polimorfismo.interfaces;

public class DatabaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Loading... database");
    }

    @Override
    public void checkPermission() {
        System.out.println("Check permission database...");
    }

    @Override
    public void remove() {
        System.out.println("Removing from database...");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Inside Class static method");
    }
}
