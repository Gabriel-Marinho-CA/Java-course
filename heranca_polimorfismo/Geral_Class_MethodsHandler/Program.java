package nelioAlves.course.heranca_polimorfismo.Geral_Class_MethodsHandler;

public class Program {
    public static void main(String[] args) {


        Account acc = new Account(1001, "gabs", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "maria", 0.0, 500.0);

        //UPCASTING = Obj da super class atribuido a subclass

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Alec", 0.0, 800.0);
        Account acc3 = new SavingsAccount(1003, "Alec", 0.0, 800.0);


        //DOWNCASTING = Obj da subclass atribuido a super class;

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100);

        // BusinessAccount acc5 = (BusinessAccount) acc3;

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(220);
            System.out.println("Loan");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Updateded");
        }


        Account acc6 = new Account(1001, "gabs", 1000.0);
        acc6.withdraw(200);
        System.out.println(acc6.getBalance());

        Account acc7 = new SavingsAccount(1007, "Alec", 1000.0, 0.1);
        acc7.withdraw(200);
        System.out.println(acc7.getBalance());

        Account acc8 = new BusinessAccount(1008, "Alec3", 2000.0, 0.1);
        acc8.withdraw(200);
        System.out.println(acc8.getBalance());


    }
}
