package stovall.account;

/**
 * Create a class named AccountApp that prompts the user for a transaction, posts the
 transaction, and displays the information shown in the console output. Create the
 necessary objects for each transaction, and post the transaction using the appropriate
 method of the Transactions class.
 * Created by Levi on 2/18/2016.
 */
public class AccountApp {
    public static void main(String args[]){
        //display welcome message
        Console.displayLine("Welcome to the Account Calculator");
        Console.displayLine();

        CheckingAccount checking1 = new CheckingAccount();
        Console.displayLine("Starting Balance");
        Console.displayLine(checking1.getBalanceFormatted());
        Console.displayLine();

        Console.displayLine("Enter the transactions for the month");
        Console.displayLine();

        Transactions t = new Transactions();

        String choice1 = "y";
        while(choice1.equalsIgnoreCase("y")){
            String choice2 =
                    Console.getString("Withdrawal or deposit? (w/d): ");
            double a = Console.getDouble("Amount: ");
            if(choice2.equalsIgnoreCase("d")){
                if(a <= 10000){
                    t.deposit(checking1, a);
                }else{
                    Console.displayLine();
                    Console.displayLine("The requested deposit is too big.");
                }
            }else{
                if(a <= checking1.getBalance()){
                    t.withdraw(checking1, a);
                }else{
                    Console.displayLine();
                    Console.displayLine("The requested withdrawal is too big.");
                }
            }

            Console.displayLine();
            choice1 = Console.getString("Continue? (y/n): ");
            Console.displayLine();
        }
        Console.displayLine("Monthly Fees");
        Console.displayLine(checking1.getMonthlyFeeFormatted());
        Console.displayLine();

        Console.displayLine("Final Balance");
        Console.displayLine(checking1.getBalanceFormatted());
    }
}
