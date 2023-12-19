package nelioAlves.course.generics;


import java.util.ArrayList;
import java.util.List;

public class GenericClass{
    public static void main(String[] args) {

    }
}

class Printer <T extends Animal> {
    T value;
    List<T> list;

    public Printer(T value) {
        this.value = value;
    }

    public void print() {
        System.out.println(value);
    }

    public void addToList(T value) {
        list.add(value);
    }
}