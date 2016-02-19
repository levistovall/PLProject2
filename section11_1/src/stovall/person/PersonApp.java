/**
 * Create a class named PersonApp that prompts the user as shown in the console
 output. This class should create the necessary Customer and Employee objects from
 the data entered by the user, and it should
 use these objects to display the data to the
 user. To print the data for an object to the console, this application should use a static
 method named print that accepts a Person object.
 */

package stovall.person;

import java.util.Scanner;

public class PersonApp {

    public static void main(String args[]) {
        // display a welcome message
        Console.displayLine("Welcome to the Person Tester Application");
        Console.displayLine();

        // perform 1 or more selections
        String choice1 = "y";

        while (choice1.equalsIgnoreCase("y")) {
            String choice2 =
                    Console.getString("Create customer or employee? (c/e): ");
            Console.displayLine("");


            String firstName = Console.getString("Enter first name: ");
            String lastName = Console.getString("Enter last name: ");
            String email = Console.getString("Enter email address: ");

            if(choice2.equalsIgnoreCase("c")){
                String custNum = Console.getString("Customer number: ");
                Console.displayLine();


                Customer customer = new Customer();
                customer.setFirstName(firstName);
                customer.setLastName(lastName);
                customer.setEmail(email);
                customer.setCustNum(custNum);

                Console.displayLine("You entered: ");
                Console.displayLine(customer.getDisplayText());
            }else{
                String socialNum = Console.getString("Social security number: ");
                Console.displayLine();


                Employee employee = new Employee();
                employee.setFirstName(firstName);
                employee.setLastName(lastName);
                employee.setEmail(email);
                employee.setSocialNum(socialNum);

                Console.displayLine("You entered: ");
                Console.displayLine(employee.getDisplayText());
            }


            // see if the user wants to continue
            choice1 = Console.getString("Continue? (y/n): ");
            Console.displayLine();
        }
    }
}
