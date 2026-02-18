package week6_java_methods;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial program started");
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1; // base case
        }
        return n * factorial(n - 1); // recursive step
    }
}