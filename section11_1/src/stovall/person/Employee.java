package stovall.person;

/**
 * Create a class named Employee that inherits the Person class. This class should store
 a social security number, it should provide get and set methods for the social security
 number, it should provide a no
 -
 argument constructor, and it should provide an
 implementation of the getDisplayText method. The getDisplayText method should
 return a string that consists of the string returned by the toString method of the
 Person class appended with the Employees social security number like this:
 Name: Anne Prince
 Email:
 anne@murach.com
 Social security number: 111-11-1111
 * Created by Levi on 2/15/2016.
 */
public class Employee extends Person {
    private String socialNum;

    public String getSocialNum(){
        return this.socialNum;
    }

    public void setSocialNum(String s){
        socialNum = s;
    }

    public String getDisplayText(){
        String displayText = this.toString() + "\n" + "Social Security number: " + this.getSocialNum() + "\n";
        return displayText;
    }
}
