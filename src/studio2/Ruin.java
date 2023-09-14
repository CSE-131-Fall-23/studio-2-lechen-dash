package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("start Amount: ");
		int startAmount = in.nextInt();
		System.out.println("win chance (1-0): ");
		double winChance = in.nextDouble();
		System.out.println("win limit: ");
		int winLimit = in.nextInt();
		String result;
		System.out.println("Total Simulations: ");
		int totalSimulations = in.nextInt();
		int win = 0;
		int lose = 0;
		
		
		for (int i = 1; i <= totalSimulations; i++) {
			while (startAmount > 0 && startAmount < winLimit) {
				double random = Math.random();
				if (random <= winChance) {
					startAmount++;
					result = "WIN";
					win++;
				}
				else {
					startAmount--;
					result = "LOSE";
					lose++;
				}
				 
			
			}
		}
		}
}
