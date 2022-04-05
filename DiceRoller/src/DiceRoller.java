import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Hello there! Please input the number of sides you'd like on your dice: ");
		
		int sides = scnr.nextInt();
		
		System.out.print("Would you like to roll the dice? (y/n): ");
		
		String roll = scnr.next().toLowerCase();
		
		int rollCount = 1;
		
		if (roll.equals("y")) {
			do {
				int roll1 = generateRandomDieRoll(sides);
				int roll2 = generateRandomDieRoll(sides);
				System.out.println("Roll " + rollCount + ":");
				System.out.println(roll1);
				System.out.println(roll2);
				System.out.println("\n");
				rollCount++;
				
				System.out.print("Would you like to roll again? (y/n): ");
				
				roll = scnr.next().toLowerCase();
				
			} while (roll.equals("y"));
		} else {
			System.out.println("Odd choice not to roll, but that's up to you!");
		}
			
		System.out.println("\n");
		System.out.println("Thank you! Have a nice days!");
		
		scnr.close();
		System.exit(0);
		
		
	}
	
	public static int generateRandomDieRoll(int sides) {
		
		Random randNum = new Random();
		
		int roll = randNum.nextInt(sides) + 1;
				
		return roll;
	}

}