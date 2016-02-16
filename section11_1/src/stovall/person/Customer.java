package stovall.person;

/**
 * Create a class
 named Customer that inherits the Person class. This class should store
 a customer number, it should provide get and set methods for the customer number, it
 should provide a no
 -
 argument constructor, and it should provide an implementation
 of the getDisplay
 Text method. The getDisplayText method should return a string that
 consists of the string returned by the toString method of the Person class appended
 with the Customer number like this:
 Name: Frank Jones
 Email: frank44@hotmail.com
 Customer number: M10293
 * Created by Levi on 2/15/2016.
 */
public class Customer extends Person {
    private String custNum;

    public String getCustNum(){
        return this.custNum;
    }

    public void setCustNum(String s){
        custNum = s;
    }

    public Customer(){
        custNum = "";
    }

    public String getDisplayText(){
        String displayText = this.toString() + "\n" + "Customer number: " + this.getCustNum() + "\n";
        return displayText;
    }
}
