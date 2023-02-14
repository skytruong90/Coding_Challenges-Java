import java.util.Scanner;

public class ChallengeOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user to enter their weight in pounds
        System.out.print("Enter your weight in pounds: ");
        double weight = input.nextDouble();

        // Calculate the weight on each planet and the sun
        double mercuryWeight = weight * 0.38;
        double venusWeight = weight * 0.91;
        double marsWeight = weight * 0.38;
        double jupiterWeight = weight * 2.34;
        double saturnWeight = weight * 1.06;
        double uranusWeight = weight * 0.92;
        double neptuneWeight = weight * 1.19;
        double plutoWeight = weight * 0.06;
        double sunWeight = weight * 27.07;

        // Output the results
        System.out.println("Your weight on Mercury is " + mercuryWeight + " lbs.");
        System.out.println("Your weight on Venus is " + venusWeight + " lbs.");
        System.out.println("Your weight on Mars is " + marsWeight + " lbs.");
        System.out.println("Your weight on Jupiter is " + jupiterWeight + " lbs.");
        System.out.println("Your weight on Saturn is " + saturnWeight + " lbs.");
        System.out.println("Your weight on Uranus is " + uranusWeight + " lbs.");
        System.out.println("Your weight on Neptune is " + neptuneWeight + " lbs.");
        System.out.println("Your weight on Pluto is " + plutoWeight + " lbs.");
        System.out.println("Your weight on the Sun is " + sunWeight + " lbs.");
    }
}
