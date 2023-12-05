package nelioAlves.course.heranca_polimorfismo.polimorfism;

import nelioAlves.course.heranca_polimorfismo.Geral_Class_MethodsHandler.Account;
import nelioAlves.course.heranca_polimorfismo.Geral_Class_MethodsHandler.SavingsAccount;

public class Polimorfism {
    public static void main(String[] args) {
        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1020, "Alex", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x+" -- "+y);
    }
}
