package Week_3.General.Q_2;

public class CheckingAccount extends BankAccount {
    @Override
    public double calculateInterest() {
        throw new UnsupportedOperationException("Checking accounts do not earn interest.");
    }
}
