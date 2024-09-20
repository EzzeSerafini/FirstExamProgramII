package Service;

import Model.Product;
import Model.Chair;
import Model.Desk;
import Model.Printer;
import Model.Notebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService {
    // List of products
    private List<Product> productList;

    public ProductService() {
        productList = new ArrayList<>();
        // Adding products
        productList.add(new Chair("Office Chair", 150.0, 10, true));
        productList.add(new Desk("Large Desk", 300.0, 5, 120.0, 60.0));
        productList.add(new Printer("HP Printer", 200.0, 7, "HP", 30));
        productList.add(new Notebook("HP Notebook", 800.0, 3, "HP", 16));
    }

    // Implementing methods
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("\n===== Office Product Management Menu =====");
            System.out.println("1. Show all products");
            System.out.println("2. Apply discount to chairs and printers");
            System.out.println("3. Update prices for all products");
            System.out.println("4. Exit");
            System.out.print("Please select an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    showAllProducts();
                    break;
                case 2:
                    applyDiscount();
                    break;
                case 3:
                    updatePrices();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 4);
    }
    // Methods
    private void showAllProducts() {
        System.out.println("\n--- List of all products ---");
        for (Product product : productList) {
            System.out.println(product.toString());
        }
    }
    // Methods
    private void applyDiscount() {
        System.out.println("\n--- Applying discounts to Chairs and Printers ---");
        for (Product product : productList) {
            if (product instanceof Chair || product instanceof Printer) {
                double discountedPrice = product.discount(10); // 10% discount
                System.out.println(product.getClass().getSimpleName() + " new price with discount: " + discountedPrice);
            }
        }
    }
    // Methods
    private void updatePrices() {
        System.out.println("\n--- Updating product prices ---");
        for (Product product : productList) {
            if (product instanceof Chair) {
                product.updatePrice(5); // 5% increase
            } else if (product instanceof Desk) {
                product.updatePrice(10); // 10% increase
            } else if (product instanceof Printer) {
                product.updatePrice(15); // 15% increase
            } else if (product instanceof Notebook) {
                product.updatePrice(20); // 20% increase
            }
            System.out.println(product.getClass().getSimpleName() + " updated price: " + product.getPrice());
        }
    }
}

