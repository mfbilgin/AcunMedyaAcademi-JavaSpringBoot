package Week_3.General.Q_2;

public class Main {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount();
        savingsAccount.setBalance(500);
        System.out.println(savingsAccount.calculateInterest());

        BankAccount checkingAccount = new CheckingAccount();
        checkingAccount.setBalance(500);

        System.out.println(checkingAccount.calculateInterest());
    }
}
