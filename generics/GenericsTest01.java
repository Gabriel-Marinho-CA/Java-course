package nelioAlves.course.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("gabs");
        list.add("mat");


    }

    public static class Owner {
        private String name;

        public Owner(String name) {
            this.name = name;
        }

        public void setName(String name) {
            name = this.name;
        }
    }

    private static void add(List<String> list, Owner owner) {
//        list.add(owner);
    }
}
