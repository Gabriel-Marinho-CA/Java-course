package nelioAlves.course.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("Gabri");
        list.add("Mano");
        list.add("Calabreso");
        list.add("Gaybersson");
        list.add("Galadriel");
        list.add(2,"Marco");

        System.out.println(list.size());

        System.out.println("-----------");


        list.removeIf(name -> name.charAt(0) == 'M');

        for(String names : list) {
            System.out.println(names);
        }

        System.out.println("-----------");

        System.out.println("Index of Calabreso " + list.indexOf("Calabreso"));
        System.out.println("Index of Gabri " + list.indexOf("KLDOSA"));


        System.out.println("-----------");


        List<String> result = list.stream().filter(letterA ->  letterA.charAt(0) == 'G').collect(Collectors.toList());


    }
}
