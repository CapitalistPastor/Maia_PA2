package Maia_P1;
import Maia_P1.*;
import java.util.Scanner;
import java.util.Arrays;
/*
 * 
write a program that will encrypt data so that it may be 
transmitted more securely. 
	All the data is transmitted as four-digit integers. 
	Your application should read a four-digit integer entered by the user and encrypt
	it as follows: 
[done]		Replace each digit with the result of adding 7 to the digit
[done]		and getting the remainder after dividing the new value by 10. 
[done]	Then swap the first digit with the third 
[done]	and swap the second digit with the fourth.
[done]	Then print the encrypted integer. 
	
[done]	Your application should also allow the user to enter
	an encrypted four-digit integer and then decrypt it 
	(by reversing the encryption scheme)
	to form the original number.


*/

public class Main {
	public static void main(String args[]) {
		int choice = 1;
		while(choice != 3) {
		System.out.println("What would you like to do?");
		System.out.println("1 - Encrypt data");
		System.out.println("2 - Decrypt data");
		System.out.println("3 - Exit");
		System.out.print("Your choice: ");
		Scanner userInputChoice = new Scanner (System.in);
		choice = userInputChoice.nextInt();
		
			if (choice == 1) {
				Encrypter.main(null);
				System.out.println();
			}
			if (choice == 2) {
				Decrypter.main(null);
				System.out.println();
			}
			if ((choice < 1) || (choice > 3)) {
				System.out.println("Invalid choice.");
			}
		}
		System.out.println("Thanks for using the program!");
	}
}
