package Week_3.General.Q_2;

public class SavingsAccount extends BankAccount {
    @Override
    public double calculateInterest() {
        return getBalance() * 0.05;
    }
}
