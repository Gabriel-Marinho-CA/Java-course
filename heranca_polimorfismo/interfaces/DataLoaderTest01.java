package nelioAlves.course.heranca_polimorfismo.interfaces;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        databaseLoader.remove();
        databaseLoader.checkPermission();

        fileLoader.load();
        fileLoader.remove();
        fileLoader.checkPermission();

    }
}
