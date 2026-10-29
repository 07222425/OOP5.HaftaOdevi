public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println(account.toString());
        System.out.println("Monthly Interest: " + account.getMonthlyInterest());

        SavingsAccount savings = new SavingsAccount(1133, 10000);
        savings.setAnnualInterestRate(3.0);
        savings.withdraw(12000);
        System.out.println(savings.toString());

        CheckingAccount checking = new CheckingAccount(1144, 5000, 1000);
        checking.setAnnualInterestRate(2.5);
        checking.withdraw(5500);
        System.out.println(checking.toString());
    }
}