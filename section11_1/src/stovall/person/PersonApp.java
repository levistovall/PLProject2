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
        System.out.println("Welcome to the Person Tester Application");
        System.out.println();

        // perform 1 or more selections
        Scanner sc = new Scanner(System.in);
        String choice1 = "y";

        while (choice1.equalsIgnoreCase("y")) {
            System.out.print("Create customer or employee? (c/e): ");
            String choice2 = sc.nextLine();  // read the product code
            System.out.println("");

            String firstName = "";
            String lastName = "";
            String email = "";

            System.out.print("Enter first name: ");
            firstName = sc.nextLine();
            System.out.print("Enter last name: ");
            lastName = sc.nextLine();
            System.out.print("Enter email address: ");
            email = sc.nextLine();

            if(choice2.equalsIgnoreCase("c")){
                System.out.print("Customer number: ");
                String custNum = sc.nextLine();
                System.out.println("");


                Customer customer = new Customer();
                customer.setFirstName(firstName);
                customer.setLastName(lastName);
                customer.setEmail(email);
                customer.setCustNum(custNum);

                System.out.println("You entered: ");
                System.out.print(customer.getDisplayText());
                System.out.println("");
            }else{
                System.out.print("Social security number: ");
                String socialNum = sc.nextLine();
                System.out.println("");


                Employee employee = new Employee();
                employee.setFirstName(firstName);
                employee.setLastName(lastName);
                employee.setEmail(email);
                employee.setSocialNum(socialNum);

                System.out.println("You entered: ");
                System.out.print(employee.getDisplayText());
                System.out.println("");
            }


            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice1 = sc.nextLine();
            System.out.println();
        }
    }
}
