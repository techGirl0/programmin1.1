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
                break;
            case 2:
                System.out.println("Minor: You probably won't feel it.");
                break;
            case 3:
                System.out.println("Light: People can feel it, but no real damage.");
                break;
            case 4:
                System.out.println("Moderate: You will feel it. Some damage possible.");
                break;
            case 5:
                System.out.println("Strong: This can cause serious damage.");
                break;
            case 6:
                System.out.println("Major: Very strong and dangerous.");
                break;
            case 7:
                System.out.println("Great: Extremely dangerous and destructive.");
                break;
            default:
                System.out.println("Unknown category.");
        }
    }
}
