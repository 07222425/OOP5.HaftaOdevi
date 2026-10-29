public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount() {
        super();
        overdraftLimit = 0;
    }

    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= -overdraftLimit) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Cannot withdraw. Exceeds overdraft limit.");
        }
    }

    @Override
    public String toString() {
        return "CheckingAccount ID: " + getId() + "\nBalance: " + getBalance() + "\nOverdraft Limit: " + overdraftLimit;
    }
}