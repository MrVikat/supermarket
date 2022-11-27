package product;

import java.util.ArrayList;
import java.util.Scanner;

public class Supermarket {

    ArrayList<Product> products = new ArrayList<>();
    private float totalRevenue;

    Scanner scanner = new Scanner(System.in);
    Scanner floatScanner = new Scanner(System.in);

    public void addProduct() {

        System.out.println("Adding a new product");
        System.out.println("Please enter product name");
        String name = scanner.nextLine();

        System.out.println("Please enter product quantity");
        float quantity = floatScanner.nextFloat();

        System.out.println("Please enter product description");
        String description = scanner.nextLine();

        System.out.println("Please enter product price");
        float price = floatScanner.nextFloat();

        Product product = new Product(name, quantity, description, price);
        products.add(product);

        System.out.println("Product added successfully");

    }

    public void viewAllProducts() {
        System.out.println("Viewing all products");

        for (Product product : products) {
            System.out.println(product);
        }

    }

    public void removeProduct() {
        System.out.println("please enter the product to remove");

        String name = scanner.nextLine();
        for (Product product : products) {
            if (product.name.equals(name)) {
                products.remove(product);
                System.out.println("Product removed successfully");
                return;
            }
        }
        System.out.println("Product not found");
    }

    public void viewProduct() {
        System.out.println("Please enter product to view: ");

        String name = scanner.nextLine();

        for (Product product : products) {
            if (product.name.equals(name)) {
                System.out.println(product);
                return;
            }
        }
        System.out.println("Product not found");
    }

    public void buyProduct() {

        System.out.println("Please enter product name to buy: ");
        String name = scanner.nextLine();

        int count = 0;

        for (Product product : products) {
            if (product.name.equals(name)) {
                count += 1;

            }
        }

            if (count < 1) {
                System.out.println("Product not found");
                return;
            }

                System.out.println("Please enter quantity you gonna buy: ");
                float quantity = scanner.nextFloat();

        for (Product product : products) {
            if (product.name.equals(name)) {
                if(product.quantity < quantity) {
                    System.out.println("Not enough quantity! Qty in stock: "+product.quantity);
                    return;
                }

            }
        }


                for (Product product : products) {

                    if (product.name.equals(name)) {
                        System.out.println("Product successfully bought: " + product.name + ". Quantity: " + quantity);
                        System.out.println("Total: €" + quantity * product.price);
                        product.quantity -= quantity;

                        totalRevenue += quantity * product.price;
                        return;
                    }

                }

        }



            public void getTotalRevenue () {

                System.out.println("The Supermarket has earned in Total:");
                System.out.println("€" + totalRevenue);

            }




}
