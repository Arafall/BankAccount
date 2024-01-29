
public class BankAccount {
    // Class properties.
    private String firstName;
    private String lastName;
    private double balance;

    // Constructor used to instansiate an object while the properties.
    public BankAccount(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        // Calculates balance in a way to round down the decimal past 2 places.
        this.balance = Math.floor(balance * 100.0) / 100.0;
    }

    // 'debitBalance' method to remove an amount from the balance without exceeding it.
    public void debitBalance(double amountChanged) {
        // Debit the balance as long the amount doesn't exceed it.
        if (amountChanged > balance) {
            System.out.println("Cannot decrease more than the balance.");
        }
        else {
            // Decrease the balance and format the new value.
            balance -= amountChanged;
            balance = Math.floor(balance * 100.0) / 100.0;
            System.out.printf("Balance decreased by $%.2f\n", amountChanged);
        }
    }

    // 'creditBalance' method to increase the account balance.
    public void creditBalance(double amountChanged) {
        // Increase the balance and format the new value.
        balance += amountChanged;
        balance = Math.floor(balance * 100.0) / 100.0;
        System.out.printf("Balance increased by $%.2f\n", amountChanged);
    }

    // 'GetAccountInfo' method returns a string that will display a summary of the account.
    public String getAccountInfo()
    {
        String infoString = "";
        infoString += "------------------------------";
        infoString += "\n Account Holder:  " + firstName + " " + lastName;
        infoString += "\n Account Balance: $" + String.format("%.2f", balance);
        infoString += "\n------------------------------";

        return infoString;
    }
}


