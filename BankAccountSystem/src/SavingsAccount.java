public class SavingsAccount extends Account {
    public SavingsAccount() {
    }

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= 0) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Cannot withdraw. Insufficient funds.");
        }
    }

    @Override
    public String toString() {
        return "SavingsAccount ID: " + getId() + "\nBalance: " + getBalance();
    }
}