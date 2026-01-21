package week3_conditions_in_java;

import java.util.Scanner;

public class EarthquakeCategorizer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter earthquake magnitude: ");

        if (!input.hasNextDouble()) {
            System.out.println("Invalid input. please enter a number :(");
            return;
        }

        double magnitude = input.nextDouble();
        if (magnitude < 0) {
            System.out.println("Magnitude cannot be negative :(");
            return;
        }

        int category = (magnitude < 2.0) ? 1
                : (magnitude < 4.0) ? 2
                        : (magnitude < 5.0) ? 3
                                : (magnitude < 6.0) ? 4 : (magnitude < 7.0) ? 5 : (magnitude < 8.0) ? 6 : 7;

        switch (category) {
            case 1:
                System.out.println("Micro: Too small to feel.");
                System.out.println("Advice: You're totally fine — this one is basically nothing.");
                break;
            case 2:
                System.out.println("Minor: You probably won't feel it.");
                System.out.println("Advice: Just keep doing your thing, no worries here.");
                break;
            case 3:
                System.out.println("Light: People can feel it, but no real damage.");
                System.out.println("Advice: Maybe just stay alert, but it's not a big deal.");
                break;
            case 4:
                System.out.println("Moderate: You will feel it. Some damage possible.");
                System.out.println("Advice: Stay inside and move away from windows just to be safe.");
                break;
            case 5:
                System.out.println("Strong: This can cause serious damage.");
                System.out.println("Advice: Take cover under a table or desk — better safe than sorry.");
                break;
            case 6:
                System.out.println("Major: Very strong and dangerous.");
                System.out.println("Advice: Follow emergency instructions and be ready to move quickly.");
                break;
            case 7:
                System.out.println("Great: Extremely dangerous and destructive.");
                System.out.println("Advice: Evacuate immediately and get to an open area if you can.");
                break;
            default:
                System.out.println("Unknown category.");
        }

    }
}
