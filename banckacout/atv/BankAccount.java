package nelioAlves.course.banckacout.atv;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class BankAccount {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Client client = createClient();
        System.out.println("Account data: \n" + client);
        menu(client);
    }

    private static Client createClient() {
        sc.useLocale(Locale.US);

        System.out.println("Enter account number : ");
        int accNumber = sc.nextInt();

        System.out.println("Enter account holder: ");
        String name = sc.next();

        System.out.println("Is there a initial deposit (y/n)?");
        String chooseChar = sc.next();

        boolean isInitialDeposit = chooseChar.equals("y");

        if (isInitialDeposit) {
            System.out.println("Enter initial deposit value: ");
            double depositValue = sc.nextDouble();

            return  new Client(accNumber, name, depositValue);

        }
        return new Client(accNumber, name);
    }

    private static void menu(Client client) {
        int op = 0;

        do {
            System.out.println("1 - Deposit");
            System.out.println("2 - Withdraw");
            System.out.println("3 - Exit");

            try {
                op = sc.nextInt();

                switch (op) {
                    case 1:
                        System.out.println("Enter a deposit value :");
                        double depositValue = sc.nextDouble();
                        client.deposit(depositValue);

                        System.out.println("Updated account data: \n" + client);

                        break;

                    case 2:
                        System.out.println("Enter a withdraw value :");
                        double withdrawValue = sc.nextDouble();
                        client.withdraw(withdrawValue);

                        System.out.println("Updated account data: \n" + client);

                        break;

                    case 3:
                        break;

                    default:
                        System.out.println("Enter only one of options numbers");
                }

            } catch (InputMismatchException e) {
                System.out.println("Only numbers are allowed");
                sc.nextLine();
            }
        } while (op != 3);

        sc.close();
    }
}
