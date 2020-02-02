package Maia_P1;

import java.util.Scanner;
import java.util.Arrays;

public class Decrypter {
	public static void main(String [] args) {
		int[] dataArray = new int[4];
		int[] reminderArray = new int[4];
		int[] swap = new int[4];
		boolean valid = true;
		int decrypted;
		
		System.out.print("Enter encrypted data: ");
		Scanner dataInput = new Scanner (System.in);
		int data = dataInput.nextInt();

		System.out.println();
		System.out.print("Enter reminder: ");
		Scanner reminderInput = new Scanner (System.in);
		int reminder = reminderInput.nextInt();
		if ((data > 1111) || (reminder > 9999)) {
			System.out.println("Invalid input.");
			valid = false;
		}
		if ((data < 0) || (reminder < 0)) {
			System.out.println("Invalid input.");
			valid = false;
		}
		if(valid) {
			dataArray[0] = data/1000;
			data = data % 1000;
			dataArray[1] = data/100;
			data = data % 100;
			dataArray[2] = data/10;
			data = data % 10;
			dataArray[3] = data;
//			System.out.print("received data: ");
//			System.out.println(Arrays.toString(dataArray));
			reminderArray[0] = reminder/1000;
			reminder = reminder % 1000;
			reminderArray[1] = reminder/100;
			reminder = reminder % 100;
			reminderArray[2] = reminder/10;
			reminder = reminder % 10;
			reminderArray[3] = reminder;
//			System.out.print("received reminder: ");
//			System.out.println(Arrays.toString(reminderArray));
			swap[0] = dataArray[0];
			swap[1] = dataArray[1];
			swap[2] = dataArray[2];
			swap[3] = dataArray[3];
			dataArray[0] = swap[2];
			dataArray[1] = swap[3];
			dataArray[2] = swap[0];
			dataArray[3] = swap[1];
			swap[0] = reminderArray[0];
			swap[1] = reminderArray[1];
			swap[2] = reminderArray[2];
			swap[3] = reminderArray[3];
			reminderArray[0] = swap[2];
			reminderArray[1] = swap[3];
			reminderArray[2] = swap[0];
			reminderArray[3] = swap[1];
//			System.out.print("swaped data: ");
//			System.out.println(Arrays.toString(dataArray));
//			System.out.print("swaped reminder: ");
//			System.out.println(Arrays.toString(reminderArray));
			for(int i=0; i<4; i++) {
			dataArray[i] = ((dataArray[i]*10) + reminderArray[i]) - 7;
			}
			
//			System.out.print("Decrypted array: ");
//			System.out.println(Arrays.toString(dataArray));
			decrypted = dataArray[0]*1000;
			decrypted = decrypted + (dataArray[1]*100);
			decrypted = decrypted + (dataArray[2]*10);
			decrypted = decrypted + (dataArray[3]);
			System.out.print("Decrypted data: " + decrypted);
		}
		
	}

}
