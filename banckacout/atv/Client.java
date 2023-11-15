package nelioAlves.course.banckacout.atv;

public class Client {

    private int accNumber;
    private String accHolder;
    private double balance;


    public Client(int accNumber, String accHolder, double balance) {
        this.accNumber = accNumber;
        this.accHolder = accHolder;
        this.balance = balance;
    }

    public Client(int accNumber, String accHolder) {
        this.accNumber = accNumber;
        this.accHolder = accHolder;
    }

    double deposit(double depositValue) {
        return this.balance += depositValue;
    }

    double withdraw(double withdrawValue) {
        if (withdrawValue > this.balance) {
            System.out.print("It's not possible to withdran this value balance: $" + balance + " withdraw: $" + withdrawValue+"\n");
            return this.balance;
        }
        double newBalance = this.balance - withdrawValue - 5;

        return this.balance = newBalance;
    }


    public String toString() {
        return
                "Account " + accNumber +
                        ", Holder: " + String.format("%d", accHolder) +
                        ", Balance: $ " + String.format("%.2f", balance);
    }

    public int getAccNumber() {
        return accNumber;
    }

    public String getAccHolder() {
        return accHolder;
    }

    public void setAccHolder(String accHolder) {
        this.accHolder = accHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
