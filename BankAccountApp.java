
public class BankAccountApp {
    public static void main(String[] args) {
        // Create 3 different bank account objects to test the methods in the BankAccount class.
        BankAccount account1 = new BankAccount("Bill", "Tomb", 500);
        BankAccount account2 = new BankAccount("Sarah", "Hellen", 500);
        BankAccount account3 = new BankAccount("Joe", "Wayne", 500);

        // Call 'printAccountTest' method for each account to test the debit, credit, and info display methods.
        account1 = printAccountTest(account1, 50.49, 20.85);
        account2 = printAccountTest(account2, 200, 50.99);
        account3 = printAccountTest(account3, 150, 30.50);
    }

    // 'printAccountTest' method takes an account, a debit amount, and a credit amount for the balance and displays the before and after to the user.
    public static BankAccount printAccountTest(BankAccount accountAffected, double debitAmount, double creditAmount) {
        System.out.println(accountAffected.getAccountInfo());
        System.out.println();
        accountAffected.debitBalance(debitAmount);
        accountAffected.creditBalance(creditAmount);
        System.out.println();
        System.out.println(accountAffected.getAccountInfo());

        return accountAffected;
    }
}