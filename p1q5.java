/*Create a " BankAccount " class with a constructor that takes in the account number,
the account holder's name, and the balance. The class should have methods for
depositing and withdrawing money from the account, as well as a method for transferring
money to another account */
class BankAccount{
    long accountNumber;
    String Name;
    double balance;
     
    BankAccount(long a, String n, long b){
        accountNumber = a;
        Name = n;
        balance = b;
    }
    public void depositing(double amount){
        balance = balance + amount;
        System.out.println("Deposited: "+amount+" Account Number: "+accountNumber);
    }
    public void withdrawing(double amount){
        if(amount>balance){
            System.out.println("Insufficent balance");
        }
        else{
            balance = balance-amount;
            System.out.println("Deposited "+amount+" into account number "+accountNumber);
        }
    }
    public void transfer(double amount, BankAccount recipient){
        if(amount>balance){
            System.out.println("Insufficent balance");
        }
        else{
            balance = balance-amount;
            recipient.depositing(amount);
            System.out.println("Transfer amount "+amount+" from "+accountNumber+" to account " + recipient.getAccountNumber());
        }
    }
    public long getAccountNumber(){
        return accountNumber;
    }
    public String getAccountHolderName(){
        return Name;
    }
    public double getBalance(){
        return balance;
    }
}
public class p1q5 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1001, "Alice", 1000);
        BankAccount account2 = new BankAccount(1002, "Bob", 500);
        
        account1.depositing(500);
        account2.withdrawing(200);
        account1.transfer(300, account2);
    }
}
