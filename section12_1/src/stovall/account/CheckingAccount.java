package stovall.account;

import java.text.NumberFormat;

/**
 * Create a class named CheckingAccount that inherits the Account class. This class
 should include an instance variable for the monthly fee and these methods:
 void subtractMonthlyFee()
 void setMonthlyFee(double monthlyFee)
 double getMonthlyFee()
 String getMonthlyFeeFormatted()
 By default, the monthly fee for a checking account should be $1.
 * Created by Levi on 2/18/2016.
 */
public class CheckingAccount extends Account {
    private double monthlyFee;

    public void subtractMonthlyFee(){
        this.withdraw(monthlyFee);
    }

    public void setMonthlyFee(double monthlyFee){
        this.monthlyFee = monthlyFee;
    }

    double getMonthlyFee(){
        return monthlyFee;
    }

    public String getMonthlyFeeFormatted(){
        String monthlyFeeFormatted = "Cheking fee:" + NumberFormat.getCurrencyInstance().format(this.getMonthlyFee());
        return monthlyFeeFormatted;
    }
}
