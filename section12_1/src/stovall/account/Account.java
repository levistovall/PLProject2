package stovall.account;

import java.text.NumberFormat;

/**
 * Create a class named Account that implements all three of these interfaces.
 In addition, it should supply a method like the following method that returns a balance
 that has been formatted as currency:
 String getBalanceFormatted()
 * Created by Levi on 2/18/2016.
 */
public class Account implements Depositable, Withdrawable, Balanceable {

    private double balance;

    public Account(){
        this.balance = 1000;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double amt) {
        balance = amt;
    }

    @Override
    public void deposit(double amt) {
        balance = balance + amt;
    }

    @Override
    public void withdraw(double amt) {
        balance = balance - amt;
    }

    public String getBalanceFormatted(){
        String balanceFormatted = "Checking: " + NumberFormat.getCurrencyInstance().format(this.getBalance());
        return balanceFormatted;
    }
}
