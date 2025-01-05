public class SavingAccount extends Account {

    public SavingAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
    }

    public void withdraw(double amount) {
        if (amount > getBalance()) {
            System.out.println("Insufficient balance. Withdrawal not allowed.");
        } else {
            setBalance(getBalance() - amount);
        }
    }

    public String toString() {
        return "SavingAccount[id=" + getId() + ", balance=" + getBalance() +
                ", dateCreated=" + getDateCreated() + "]";
    }
}
