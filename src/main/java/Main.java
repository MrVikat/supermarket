import product.Supermarket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Supermarket supermarket = new Supermarket();

        String input = "";

        do {
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("Please choose an activity:");


            System.out.println();
            System.out.println("1. Add a product.");
            System.out.println("2. View all products.");
            System.out.println("3. Remove a product.");
            System.out.println("4. View a single product.");
            System.out.println("5. Buy product.");
            System.out.println("6. Track the Total amount Supermarket has earned.");

            input = scanner.nextLine();

            switch (input) {
                case "quit":
                    System.out.println("Exiting Application");
                    break;
                case "1":
                    supermarket.addProduct();
                    break;
                case "2":
                    supermarket.viewAllProducts();
                    break;
                case "3":
                    supermarket.removeProduct();
                    break;
                case "4":
                    supermarket.viewProduct();
                    break;
                case "5":
                    supermarket.buyProduct();
                    break;
                case "6":
                    supermarket.getTotalRevenue();

                    break;
                default:
                    System.out.println("Please select a valid input");
            }
        } while (!input.equals("quit"));

    }
}