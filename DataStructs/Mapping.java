package nelioAlves.course.DataStructs;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Mapping {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1,"Robert");
        usuarios.put(2,"Gabs");
        usuarios.put(3,"REWE");
        usuarios.put(4,"REWEss");
        usuarios.put(5,"REWEsssss");


        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());
        System.out.println(usuarios.containsKey(1));
        System.out.println(usuarios.containsValue(4));
        System.out.println(usuarios.get(3));
        System.out.println(usuarios.remove(3));
        System.out.println(usuarios.remove(1,"gabs"));
        System.out.println(usuarios.remove(1,"Robert"));


        for(int chave : usuarios.keySet()) {
            System.out.println(chave);
        }
        for(String valor : usuarios.values()) {
            System.out.println(valor);
        }

        for(Map.Entry<Integer,String> registro : usuarios.entrySet()) {
            System.out.println(registro.getKey() + " - " +registro.getValue());
        }

        System.out.println("============================================================");


        Consumidor c1 = new Consumidor(1L,"Gabs");
        Consumidor c2 = new Consumidor(1L,"Gabriel");

        Manga m1 = new Manga(1L,"Berserk",9.5);
        Manga m2 = new Manga(2L,"Berserk 2",19.5);
        Manga m3 = new Manga(3L,"Berserk 3",29.5);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();

        consumidorManga.put(c1,m1);
        consumidorManga.put(c2,m3);

        for(Map.Entry<Consumidor,Manga> entry : consumidorManga.entrySet()) {
            System.out.println("\n"+entry.getKey() +" - "+entry.getValue());
        }

    }

    public static class Manga {
        private Long id;
        private String name;
        private Double price;


        @Override
        public String toString() {
            return "Manga{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public Manga(Long id, String name, Double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }
    }

    public static class Consumidor {
        private Long id;
        private String name;

        public Consumidor() {

        }

        public Consumidor(Long id, String name) {
            this.id = ThreadLocalRandom.current().nextLong(0,10000);
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Consumidor that = (Consumidor) o;
            return Objects.equals(id, that.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

        @Override
        public String toString() {
            return "Consumidor{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
