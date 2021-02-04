package emailvalidation;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * @author Komasquin A. Lopez
 */
public class EmailValidation {
    public static void main(String[] args) {
    //lines 19-21: ask for user input and store the value in a 'String' variable
    Scanner in = new Scanner(System.in);
    System.out.print("Email Address: ");
    String email = in.next();
    //this line calls the 'static' method 'emailVarification'
    emailVarification(email);
    }//end of main method  
    
    public static void emailVarification(String email){
        //lines 28-32: is an 'ArrayList' that has all the employee emails added to it
        ArrayList<String> oop = new ArrayList();
        oop.add("\"komasq@fiu.edu\"");
        oop.add("\"komasq@gmail.com\"");
        oop.add("\"joeblow@gmail.com\"");
        oop.add("\"komasq@yahoo.com.com\"");
        //lines 34-35: 'StringBuilder' object that is populated with the emails from the above 'ArrayList' on lines 28-32
        StringBuilder sb = new StringBuilder();
        sb.append(oop);
        //lines 37-38: created two objects from 'Pattern' and 'Matcher' class repsectivly from 'regex' package
        //'pattern' takes the 'email' passed into the 'compile' method; then 'matcher' is initialized to 'pattern' using a method call to match the 'StringBuilder' object 'sb' to the method param 'email'
        final Pattern pattern = Pattern.compile(email);
        Matcher matcher = pattern.matcher(sb);
        //lines 41-45: if 'matcher', finds a match with the 'find()' method then it will return true and print "full match etc..." else it will print "invalid email"
        if(matcher.find()){
            System.out.println("Matching Email found: " + matcher.group(0));
        }else{
            System.out.println("Invalid email address");
        }//end of 'if statement'
    }//end of method 'emailVarifiction'
}
