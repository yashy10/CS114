public class TestAccounts {
    public static void main(String[] args) {
        Account account = new Account(1001, 1500, 3.5);
        System.out.println("Account Details:");
        System.out.println(account);
        System.out.println("Monthly Interest: $" + account.getMonthlyInterest());
        System.out.println();

        CheckingAccount checkingAccount = new CheckingAccount(2001, 1000, 2.5, 500);
        System.out.println("CheckingAccount Details:");
        System.out.println("Before Withdrawals: " + checkingAccount);
        checkingAccount.withdraw(1200);
        System.out.println("After Withdrawing $1200: " + checkingAccount);
        checkingAccount.withdraw(400);
        System.out.println("After Withdrawing $400: " + checkingAccount);
        System.out.println();

        SavingAccount savingAccount = new SavingAccount(3001, 2000, 3.0);
        System.out.println("SavingAccount Details:");
        System.out.println("Before Withdrawals: " + savingAccount);
        savingAccount.withdraw(2500);
        System.out.println("After Attempting to Withdraw $2500: " + savingAccount);
        savingAccount.withdraw(500);
        System.out.println("After Withdrawing $500: " + savingAccount);
    }
}
