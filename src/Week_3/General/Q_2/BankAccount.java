package Week_3.General.Q_2;

public abstract class BankAccount {
    private int id;
    private String bankHolderIdentity;
    private double balance;

    public BankAccount(int id, String bankHolderIdentity, double balance) {
        this.id = id;
        this.bankHolderIdentity = bankHolderIdentity;
        this.balance = balance;
    }

    public BankAccount() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBankHolderIdentity() {
        return bankHolderIdentity;
    }

    public void setBankHolderIdentity(String bankHolderIdentity) {
        this.bankHolderIdentity = bankHolderIdentity;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public abstract double calculateInterest();
}
