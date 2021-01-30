package calculator;

import java.util.Scanner; 

public class calculator {

	public static void main(String[] args) {
		System.out.println("Welcome to the Calculator");
		Scanner calc = new Scanner(System.in);
		
		double number1, number2, answer;
		char sign;
		
		System.out.println("Enter your first number: "); 
		number1 = calc.nextDouble();
		
		System.out.println("Enter your operation (+,-,*,/): ");
		sign=calc.next().charAt(0);
		
		System.out.println("Enter your second number: ");
		number2 = calc.nextDouble();
		
		if (sign == '+')
		{
			answer = number1 + number2;
			System.out.println("Answer: " + answer);
		}
		else if(sign == '-')
		{
			answer = number1 - number2;
			System.out.println("Answer: " + answer);
		}
		else if(sign == '*')
		{
			answer = number1 * number2;
			System.out.println("Answer: " + answer);  
		}
		else if(sign == '/')
		{
			answer = number1 / number2;
			System.out.println("Answer: " + answer);
		}
		else
			
		System.out.println("Your input is invalid.");
	
		calc.close();
		
			
	}

}