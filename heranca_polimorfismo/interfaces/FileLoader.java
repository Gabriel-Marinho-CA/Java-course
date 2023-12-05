package nelioAlves.course.heranca_polimorfismo.interfaces;

import org.w3c.dom.ls.LSOutput;

public class FileLoader  implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("loading file....");
    }

    @Override
    public void checkPermission() {
        System.out.println("Check permission in files...");
    }
    @Override
    public void remove() {
        System.out.println("Removing file...");
    }
}
