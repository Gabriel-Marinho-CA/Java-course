package nelioAlves.course.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("How much products : ");
        int n = sc.nextInt();
        double sum = 0;

        ProdutoEx[] vect = new ProdutoEx[n];


        for(int i = 0 ; i < vect.length ; i++) {
            System.out.println("Name");
            String name = sc.next();
            System.out.println("Price");
            double price = sc.nextDouble();

            ProdutoEx pdp = new ProdutoEx(name,price);

            vect[i] = pdp;
        }


        for(ProdutoEx pdp : vect) {
            sum += pdp.getPrice();
        }

        System.out.printf("AVARAGE PRICE = %.2f",sum/n);
        sc.close();



        String[] names = new String[] {"gabs","sta","ped"};

        for (String name : names) {

        }

    }
}

