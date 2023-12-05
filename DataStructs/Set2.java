package nelioAlves.course.DataStructs;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set2 {

    public static void main(String[] args) {

//        Set<String> lista = new HashSet<String>();
        Set<String> lista = new TreeSet<>();
        lista.add("Gab");
        lista.add("J8kl");
        lista.add("Koe");

        for(String aa: lista) {
            System.out.println(aa);
        }
    }

}
