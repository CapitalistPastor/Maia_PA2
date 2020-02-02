package Maia_P1;

import java.util.Scanner;
import java.util.Arrays;

public class Encrypter {
	public static void main(String[] args) {
		
		int[] dataArray = new int[4];
		int[] reminder = new int[4];
		int[] swap = new int[4];
		
		System.out.print("Please enter data to be encrypted: ");
		Scanner userInput = new Scanner (System.in);
		int data = userInput.nextInt();
//		System.out.println("data: " + data);
		
		if (data > 9999) {
			System.out.println("Invalid input.");
		}
		if ((9999 >= data) && (data >= 1000)) {
			dataArray[0] = data / 1000;
//			System.out.print("Data: ");
//			System.out.println(Arrays.toString(dataArray));
			data = data % 1000;
					
		}
		if ((999 >= data) && (data >= 100)) {
			dataArray[1] = data / 100;
//			System.out.print("Data: ");
//			System.out.println(Arrays.toString(dataArray));
			data = data % 100;
		}
		if ((99 >= data) && (data >= 10)) {
			dataArray[2] = data / 10;
//			System.out.print("Data: ");
//			System.out.println(Arrays.toString(dataArray));
			data = data % 10;
			
		}
		if ((9 >= data) && (data >= 0)) {
			dataArray[3] = data;
//			System.out.print("Data: ");
//			System.out.println(Arrays.toString(dataArray));
			dataArray[0] = dataArray[0]+7;
			dataArray[1] = dataArray[1]+7;
			dataArray[2] = dataArray[2]+7;
			dataArray[3] = dataArray[3]+7;
//			System.out.print("Data: ");
//			System.out.println(Arrays.toString(dataArray));
			reminder[0] = dataArray[0]%10;
			reminder[1] = dataArray[1]%10;
			reminder[2] = dataArray[2]%10;
			reminder[3] = dataArray[3]%10;
			// reminder
			dataArray[0] = dataArray[0]/10;
			dataArray[1] = dataArray[1]/10;
			dataArray[2] = dataArray[2]/10;
			dataArray[3] = dataArray[3]/10;
//			System.out.print("Data: ");
//			System.out.println(Arrays.toString(dataArray));
//			System.out.print("Reminder: ");
//			System.out.println(Arrays.toString(reminder));
			swap[0] = dataArray[0];
			swap[1] = dataArray[1];
			swap[2] = dataArray[2];
			swap[3] = dataArray[3];
//			System.out.print("Swap: ");
//			System.out.println(Arrays.toString(swap));
			dataArray[0] = swap[2];
			dataArray[1] = swap[3];
			dataArray[2] = swap[0];
			dataArray[3] = swap[1];
//			System.out.print("Swaped data: ");
//			System.out.println(Arrays.toString(dataArray));
//			System.out.print("Reminder: ");
//			System.out.println(Arrays.toString(reminder));
			swap[0] = reminder[0];
			swap[1] = reminder[1];
			swap[2] = reminder[2];
			swap[3] = reminder[3];
			reminder[0] = swap[2];
			reminder[1] = swap[3];
			reminder[2] = swap[0];
			reminder[3] = swap[1];
			System.out.print("Encrypted data: ");
			for(int i=0;i<dataArray.length;i++) {
				System.out.print(dataArray[i]);
			}
			System.out.println();
			System.out.print("Reminder: ");
			for(int i=0;i<dataArray.length;i++) {
				System.out.print(reminder[i]);
			}
		}
		if (data < 0) {
			System.out.println("Invalid input.");
		}
		
		
	}
}
