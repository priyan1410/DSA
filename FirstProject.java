import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstProject {
    static List<Product> products = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    private static void display() {
        System.out.println("\n1.Add\t2.Display\t3.Update\t4.Search\t5.Delete\t6.Value\t7.Exit");
    }

    public static void addProduct() {
        System.out.print("ID: ");
        int id = input.nextInt();
        System.out.print("Name: ");
        String name = input.next();
        System.out.print("Quantity: ");
        int quantity = input.nextInt();
        System.out.print("Price: ");
        float price = input.nextFloat();
        Product product = new Product(id, name, quantity, price);
        products.add(product);
    }

    public static void updateProduct() {
        System.out.print("ID: ");
        int id = input.nextInt();
        boolean found = false;
        for (Product product : products) {
            if (product.getId() == id) {
                System.out.print("Name :");
                product.setName(input.next());
                System.out.print("Quantity :");
                product.setQuantity(input.nextInt());
                System.out.print("Price :");
                product.setPrice(input.nextFloat());
                found = true;
            }
        }
        if (!found) {
            System.out.println("ID not found");
        }
    }

    public static void Display() {
        for (Product product : products) {
            System.out.println("ID : " + product.getId());
            System.out.println("Name :" + product.getName());
            System.out.println("Quantity : " + product.getQuantity());
            System.out.println("Price : " + product.getPrice());
        }
    }

    public static void Search() {
        System.out.print("ID: ");
        int id = input.nextInt();
        boolean found = false;
        for (Product product : products) {
            if (product.getId() == id) {
                System.out.println("Name :" + product.getName());
                System.out.println("Quantity : " + product.getQuantity());
                System.out.println("Price : " + product.getPrice());
                found = true;
            }
        }
        if (!found) {
            System.out.println("ID not found");
        }
    }

    public static void Delete() {
        System.out.print("ID: ");
        int id = input.nextInt();
        boolean found = false;
        for (Product product : products) {
            if (product.getId() == id) {
                products.remove(product);
                found = true;
            }
        }
        if (!found) {
            System.out.println("ID not found");
        }
    }

    public static void value() {
        float tot = 0;
        for (Product product : products) {
            int qu = product.getQuantity();
            float val = product.getPrice();
            tot = tot + (qu * val);
        }
        System.out.println("Total Value : " + tot);
    }

    public static void main(String[] args) {
//        Product product1 = new Product();
//        Product product = new Product(1, "Printer", 10, 10000.00f);
        int choice;
        do {
            display();
            System.out.print("Enter choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    Display();
                    break;
                case 3:
                    updateProduct();
                    break;
                case 4:
                    Search();
                    break;
                case 5:
                    Delete();
                    break;
                case 6:
                    value();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("\nInvalid choice");
                    break;
            }
        } while (choice > 0);
    }
}
