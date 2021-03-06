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
				if (roll1 == 6 && roll2 ==6) {
					System.out.println("Wow! You rolled boxcars! Too bad you lost at craps!");
				} else if (roll1 == 1 && roll2 == 1) {
					System.out.println("Holy smokes! You rolled snake eyes! Too bad you lost at craps!");
				} else if (roll1 + roll2 == 7 || roll1 + roll2 == 11) {
					System.out.println("Holy craps! You just hit the jackpot if you're playing craps right now! Winner!");
				} else if (roll1 + roll2 == 3 || roll1 + roll2 == 12) {
					System.out.println("Yikes! I'm not trying to talk craps right now, but you just lost if you're playing it!");
				}
				System.out.println("\n");
				rollCount++;
				
				System.out.print("Would you like to roll again? (y/n): ");
				
				roll = scnr.next().toLowerCase();
				
			} while (roll.equals("y"));
		} else {
			System.out.println("Odd choice not to roll, but that's up to you!");
		}
			
		System.out.println("\n");
		System.out.println("Thank you! Have a nice day!");
		
		scnr.close();
		System.exit(0);
		
		
	}
	
	public static int generateRandomDieRoll(int sides) {
		
		Random randNum = new Random();
		
		int roll = randNum.nextInt(sides) + 1;
				
		return roll;
	}

}
