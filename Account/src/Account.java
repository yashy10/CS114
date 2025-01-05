import java.util.Date;

public class Account {

    private int ID;
    private double balance;
    private double interestRate;
    private final Date dateCreated;

    public Account(int id, double balance, double interestRate){
        this.ID = id;
        this.balance = balance;
        this.interestRate = interestRate;

        dateCreated = new Date();
    }
    public boolean widthdraw(double amount){
        if(balance >= amount) {
            balance = balance - amount;
            return true;
        }else {
            return false;
        }
    }
    public void deposit(double amount){
        balance = amount + balance;
    }
    public int getID(){
        return ID;
    }
    public void setID(int ID){
        this.ID = ID;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getInterestRate(){
        return interestRate;
    }
    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }
    public Date dateCreated() {
        return dateCreated;
    }
}
