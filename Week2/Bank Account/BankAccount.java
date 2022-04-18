import java.util.Random;

public class BankAccount { // Create a BankAccount class.
    private double checkingBalance; // The class should have the following attributes: (double) checking balance, (double) savings balance.
    private double savingsBalance; 
    public static int numOfAccounts = 0; // Create a class member (static) that has the number of accounts created thus far.
    public static double totalMoneyStored = 0; // Create a class member (static) that tracks the total amount of money stored in every account created.

    private int accountNumber; // Ninja Bonus: add the following class attribute: account number. 

    // NINJA BONUS: Create a private method that returns a random ten digit account number.
    private static int createAccountNum() {
        Random randomGenerator = new Random();
        int accountNum = randomGenerator.nextInt(10000000, 999999999);
    }


    // In the constructor, be sure to increment the account count.
    public BankAccount() {
        numOfAccounts ++;
        this.accountNumber = BankAccount.genAccountNum();
    }

    // Create a getter method for the user's checking account balance.
    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    // Create a getter method for the user's saving account balance.
    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    // Ninja Bonus
    public int getAccountNumber() {
        return this.accountNumber;
    }

    // Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored.
    public void depositMoney(double balance, String account) {
        if(account == "checking") {
            this.checkingBalance = this.checkingBalance + balance;
        }
        else if (account == "savings") {
            this.savingsBalance = this.savingsBalance + balance;
        }
        BankAccount.totalMoneyStored = totalMoneyStored + balance; 
    }

    // Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.
    public void withdrawAmount(double balance, String account){
        boolean okToWithdraw = false; 
        if(account == "checking") {
            if(this.checkingBalance - balance >= 0) {
                okToWithdraw = true;
                this.checkingBalance = this.checkingBalance - balance;
            }
            if (okToWithdraw) {
                BankAccount.totalMoneyStored = BankAccount.totalMoneyStored - balance;
            }
        }
        else if (account == "savings") {
            if(this.savingsBalance - balance >= 0) {
                okToWithdraw = true;
                this.savingsBalance = this.savingsBalance - balance;
            }
            if (okToWithdraw) {
                BankAccount.totalMoneyStored = BankAccount.totalMoneyStored - balance;
            }
        }
        else {
            System.out.println("Cannot Withdraw. Insufficient funds.");
        }
    }

    // Create a method to see the total money from the checking and saving.\
    public void displayAccountBal(){
        System.out.printf("Checking Total: $%.2f, Savings Total: $%.2f", this.checkingBalance, this.savingsBalance);
    }


    

}