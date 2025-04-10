//Write a java program to generate a number based on the input of a user.
// upper limit off the number should be inclusive can not enter zero or negative figure

import java.security.SecureRandom;
import java.util.Scanner;

public class RandomNumberGenerator{
	public static void main(String[] args){
        SecureRandom secureRandom = new SecureRandom();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter input: ");
		long num = scan.nextLong();
		
		if(num <= 0){
			System.out.println("Number must be greater than 0");
		}
		else{
			long number = secureRandom.nextLong(num)+1;
			System.out.println("The lower Limit is 0");
			System.out.println("The upper Limit is "+(num +1));
			
			System.out.printf("The genarated number is %d%n",num);
		}
	}
}