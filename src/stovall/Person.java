package stovall;

/**
 * Create an abstract Person class that stores first name, last name, and email address.
 This class should provide a no
 -
 argument constructor, get and set methods for each
 instance variable
 , and it should
 override the toString method so it returns the first
 name, last name, and email fields in this format:
 Name: Frank Jones
 Email: frank44@hotmail.com
 In addition, it should contain an abstract method named getDisplayText that returns a
 string.
 * Created by Levi on 2/12/2016.
 */
public abstract class Person {
    private String firstName;
    private String lastName;
    private String email;

    public Person(){
        firstName = "";
        lastName = "";
        email = "";
    }

    public void setFirstName(String s){firstName = s;}

    public String getFirstName(){return this.firstName;}

    public void setLastName(String f){lastName = f;}

    public String getLastName(){return this.lastName;}

    public void setEmail(String e){email = e;}

    public String getEmail(){return this.email;}

    @Override
    public String toString(){
        String personFormatted =
                "Name: " + this.firstName + " " + this.lastName + "\n" +
                "Email: " + this.email;
        return personFormatted;
    }
}
