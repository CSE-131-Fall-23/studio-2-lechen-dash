package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int index = 0;
		System.out.println("start Amount: ");
		int startAmount = in.nextInt();
		System.out.println("win chance (1-0): ");
		double winChance = in.nextDouble();
		System.out.println("win limit: ");
		int winLimit = in.nextInt();
		String result;
		
		while (startAmount > 0 && startAmount < winLimit) {
			double random = Math.random();
			if (random <= winChance) {
				startAmount++;
				result = "WIN";
			}
			else {
				startAmount--;
				result = "LOSE";
			}
			 
			index++;
			System.out.println("Simulation " + index + ": " + startAmount + " " + result);
		
		}
	}
}
