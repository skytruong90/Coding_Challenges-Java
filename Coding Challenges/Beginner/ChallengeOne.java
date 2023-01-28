package meeting1;

import java.util.Scanner;

public class ChallengeOne {

	public static void main(String[] args) {
		// Array to hold the surface gravity of each planet
		double[] surfaceGravity = {0.38, 0.91, 0.38, 2.34, 1.06, 0.92, 1.19, 0.06, 27.07};
		String[] planets = {"Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto", "The Sun"};
		
		// Scanner to get input from user
		Scanner input = new Scanner(System.in);
		
		// Get input from user
		System.out.print("Please enter your weight: ");
		double userWeight = input.nextDouble();
		
		// Print user's weight 
		System.out.printf("Earth: %.2f\n", userWeight);
		
		for(int i = 0; i < 9; i++) {
			// Calculate user's weight on other planets
			double planetWeight = surfaceGravity[i]*userWeight;
			// Output weight
			System.out.printf("%s: %.2f\n", planets[i], planetWeight);
		}
		
	}

}
