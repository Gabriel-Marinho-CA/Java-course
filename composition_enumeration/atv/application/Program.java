package nelioAlves.course.composition_enumeration.atv.application;

import nelioAlves.course.composition_enumeration.atv.entities.Client;
import nelioAlves.course.composition_enumeration.atv.entities.Order;
import nelioAlves.course.composition_enumeration.atv.entities.OrderItem;
import nelioAlves.course.composition_enumeration.atv.entities.Product;
import nelioAlves.course.composition_enumeration.atv.entities.enums.OrderStatus;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat bF = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");

        System.out.println("Name: ");
        String nameClient = sc.nextLine();

        System.out.println("Email: ");
        String emailClient = sc.nextLine();

        System.out.println("Birth date (DD/MM/YYYY) : ");
        Date birthClient = bF.parse(sc.nextLine());

        Client client = new Client(nameClient,emailClient,birthClient);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());

        Order order = new Order(new Date(), status, client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        for(int i = 0 ; i < n ; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(productName,productPrice);

            OrderItem orderItem = new OrderItem(quantity,productPrice,product);

            order.addItem(orderItem);

        }

        System.out.println("\n \n"+order);
        sc.close();

    }
}
