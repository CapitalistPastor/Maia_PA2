package BMIcalculator;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		float bmi;
		
	System.out.println("Welcome to BMI Calculator!");
	System.out.println("Please, choose your metric system:");
	System.out.println("1 - Pounds and feet");
	System.out.println("2 - Kilograms and meters");
	System.out.print("enter your choice: ");
	
	Scanner choseInput = new Scanner (System.in);
	int choice = choseInput.nextInt();
	if (choice == 1) {
		System.out.println();
		System.out.print("Enter your height in inches: ");
		Scanner heightInput = new Scanner (System.in);
		float height = heightInput.nextInt();
		
		System.out.print("Enter your weight in pounds: ");
		Scanner weightInput = new Scanner (System.in);
		float weight = weightInput.nextInt();
		bmi = (703 * weight)/(height*height);
		System.out.println();
		System.out.print("Your BMI is: " + bmi);
		System.out.println();
		System.out.println("BMI Categories:");
		System.out.println("Underweight = <18.5");
		System.out.println("Normal weight = 18.5–24.9");
		System.out.println("Overweight = 25–29.9");
		System.out.println("Obesity = BMI of 30 or greater");
	}
	if (choice == 2) {
		System.out.println();
		System.out.print("Enter your height in centimeters: ");
		Scanner heightInput = new Scanner (System.in);
		float height = heightInput.nextInt();
		height = height/100;
		System.out.print("Enter your weight in kg: ");
		Scanner weightInput = new Scanner (System.in);
		float weight = weightInput.nextInt();
		
		bmi = weight/(height*height);
		System.out.println();
		System.out.print("Your BMI is: " + bmi);
		System.out.println();
		System.out.println("BMI Categories:");
		System.out.println("Underweight = <18.5");
		System.out.println("Normal weight = 18.5–24.9");
		System.out.println("Overweight = 25–29.9");
		System.out.println("Obesity = BMI of 30 or greater");
		
	}
	if (choice < 0 || choice > 3) {
		System.out.println("Invalid choice.");
	}
		
	Scanner heightInput = new Scanner (System.in);
	int height = heightInput.nextInt();
	
	
	}
}
