package nelioAlves.course.DataStructs;

import java.util.HashSet;
import java.util.Set;

public class Set1 {

    @SuppressWarnings({"rawtypes","unchecked"})
    public static void main(String[] args) {


        //HASHSET - não aceita repeticao

        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('X');
        conjunto.add('X');

        System.out.println(conjunto);

        System.out.println("TAM: "+conjunto.size());

        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.contains(1.2));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add("3");

        System.out.println(nums);

        conjunto.addAll(nums);
        // Uniao
        conjunto.retainAll(nums);

        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto );
    }


}
