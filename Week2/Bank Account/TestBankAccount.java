public class TestBankAccount {
    public static void main(String[] args){
        BankAccount bankAccount1 = new BankAccount();

        bankAccount1.depositMoney(30000, "checking");
        bankAccount1.depositMoney(2000, "savings");

        bankAccount1.displayAccountBal();

        bankAccount1.withdrawAmount(100, "checking");

        bankAccount1.displayAccountBal();
    }
}
