public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(int id, double balance, double annualInterestRate, double overdraftLimit) {
        super(id, balance, annualInterestRate);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        if (getBalance() - amount < -overdraftLimit) {
            System.out.println("Withdrawal exceeds overdraft limit.");
        } else {
            setBalance(getBalance() - amount);
        }
    }

    public String toString() {
        return "CheckingAccount[id=" + getId() + ", balance=" + getBalance() +
                ", overdraftLimit=" + overdraftLimit + ", dateCreated=" + getDateCreated() + "]";
    }
}
