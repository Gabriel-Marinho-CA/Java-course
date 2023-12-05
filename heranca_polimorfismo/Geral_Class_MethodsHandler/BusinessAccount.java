package nelioAlves.course.heranca_polimorfismo.Geral_Class_MethodsHandler;

public class BusinessAccount extends Account {
    private Double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            deposit(amount);
            balance += amount - 10;
        }
    }

    @Override
    public final void withdraw(double amount) {
        super.withdraw(amount);
        balance -= 2;
    }
    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
}
