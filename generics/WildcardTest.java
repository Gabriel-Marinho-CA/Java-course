package nelioAlves.course.generics;


abstract class Animal {
    public abstract void search();
}

class Dog extends Animal {

    @Override
    public void search() {
        System.out.println("Search for dog");
    }
}

class Kitty extends Animal {

    @Override
    public void search() {
        System.out.println("Search for cat");
    }
}

public class WildcardTest {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(), new Dog()};
        Kitty[] kitties = {new Kitty(), new Kitty()};
        Animal[] animals = {new Dog(), new Kitty()};

        showConsult(dogs);
        showConsult(kitties);
        showConsult(animals);
    }

    private static void showConsult(Animal[] animals) {
        for (Animal animal : animals) {
            animal.search();
        }
//        animals[1] = new Kitty();
    }
}
