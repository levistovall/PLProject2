package stovall.account;

/**
 * Create a class named Transactions that contains
 the following
 static methods for
 depositing and withdrawing funds from either type of account:
 public static void deposit(Depositable account, double amount){
 account.deposit(amount);
 }
 public static void withdraw(Withdrawable account, double amount){
 account.withdraw(amount);
 }
 * Created by Levi on 2/18/2016.
 */
public class Transactions {
    public static void deposit(Depositable account, double amount){
        account.deposit(amount);
    }

    public static void withdraw(Withdrawable account, double amount){
        account.withdraw(amount);
    }
}
