package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		System.out.println("How much money are you starting with?");
		double startAmount = in.nextDouble(); 
		
		System.out.println("What is the probability of winning?");
		double winChance = in.nextDouble();
		
		System.out.println("What is your win limit?"); 
		double winLimit = in.nextDouble();
		
		System.out.println("How many days will you play?");
		double totalSimulations = in.nextDouble();
		
		int numberOfGames = 0;
		double moneyToday = startAmount;
		for(int y = 0; y <= totalSimulations; y++ ) {
		moneyToday = startAmount;
		while (0 <= startAmount && startAmount <= winLimit)
		{
		double x = Math.random();
		if (x < winChance)
		{
			moneyToday ++; 
		}
		else 
		{
			moneyToday --;
		}
		numberOfGames ++;
		if (moneyToday > 0) {
			System.out.println("Simulation:" + y  + numberOfGames + "you win" );
		}
		else {	
		System.out.println("Simulation:" + y  + numberOfGames + "you lose" );
		}
		}
		}
		}
	}
