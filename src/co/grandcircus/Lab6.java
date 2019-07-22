package co.grandcircus;
import java.util.Random;
import java.util.Scanner;
public class Lab6 {
	public static void main(String[] args) {
		//first thing is user input of sides in a pair of dice
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Grand Circus Casino");
		
		
		String cont ="y";
		while (cont.equalsIgnoreCase("y")) {
		System.out.println("Please enter the number of sides for your pair of Dice: ");
		
		//get user input
		int sidesToDice = scan.nextInt();
		
		
		// prompt user to roll dice
		System.out.println("Get Your Bets Ready!!!!");
		System.out.println("Roll:");
		//get user input
		//scan.next();
		
		
		
		//roll the dice
		int diceRoll1 = generateRandomDieRoll(sidesToDice); 
		int diceRoll2 = generateRandomDieRoll(sidesToDice);
		
		// get user input if they want to continue and repeat steps over again. 
	
		System.out.println("Dice Roll " + diceRoll1);
		System.out.println("Dice Roll " + diceRoll2);
		
		// logic for determining snake eyes, box cars... etc will require if statements
		if (diceRoll1 == 1 && diceRoll2 == 1) {
			System.out.println("snake eyes ");
		}
		else if (diceRoll1 == 6 && diceRoll2 == 6) {
			System.out.println("box cars you have the worst luck");
		}
		else if (diceRoll1 == 2 && diceRoll2 == 1) {
			System.out.println("craps you suck");
		}
		else if (diceRoll1 == 1 && diceRoll2 == 2) {
			System.out.println("craps you suck");
		}
		//scan.next();
		System.out.println("Would You Like to Continue?");
		cont = scan.next();
		}
		System.out.println("Thanks for playing you Lost");
	}
	public static int generateRandomDieRoll(int numberOfSides) {
		Random  randomGenerator = new Random();
		int randomNum = randomGenerator.nextInt(numberOfSides) + 1;
		
		
		return randomNum;
		
	}
}
