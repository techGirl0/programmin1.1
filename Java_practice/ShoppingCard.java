package Java_practice;

import java.util.ArrayList;

public class ShoppingCard {
    public static void main(String[] args) {

        ArrayList<String> cart = new ArrayList<>();

        cart.add("Milk");
        cart.add("Bread");
        cart.add("Eggs");
        cart.add("Apples");

        System.out.println("Shopping Cart:");
        for (String item : cart) {
            System.out.println("- " + item);
        }
        cart.remove("Bread");

        System.out.println("\nAfter removing Bread:");
        for (String item : cart) {
            System.out.println("- " + item);
        }
    }
}
