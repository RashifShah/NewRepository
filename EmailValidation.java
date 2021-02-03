package emailValidation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

	public class EmailValidation {
   
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Email Validation");
      System.out.println("Enter your email address: ");
      String email = sc.next();
      
      String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
      
      Pattern pattern = Pattern.compile(regex);
      
      Matcher matcher = pattern.matcher(email);
      
      if(matcher.matches()) {
         System.out.println("Email address is valid");
      } else {
         System.out.println("Email address is not valid");
      }
   }
}