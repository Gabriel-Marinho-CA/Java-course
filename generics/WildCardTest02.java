package nelioAlves.course.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardTest02 {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Kitty> kitties = List.of(new Kitty(), new Kitty());

        showConsult(dogs);
        showConsult(kitties);

        List<Animal> animals = new ArrayList<>();
        showAnimalConsult(animals);
    }

    // Recieve the super class Animal and it's children
    private static void showConsult(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.search();
        }
    }

    // Receive the super class Animal and wharever it's a parent
    private static void showAnimalConsult(List<? super Animal> animals) {
        animals.add(new Dog());
        animals.add(new Kitty());
    }
}
