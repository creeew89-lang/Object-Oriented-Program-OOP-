import jdk.jfr.Category;

import javax.lang.model.element.Name;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemDriver {

    public static List<Item> itemList = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        runMenu();
    }

    public static void runMenu() {
        boolean running = true;

        while (running) {
            System.out.println("===== Item Management Menu =====");
            System.out.println("1 - Add a New Item");
            System.out.println("2 - Edit an Existing Item");
            System.out.println("3 - Remove an Item");
            System.out.println("4 - Display All Items");
            System.out.println("5 - Exit");
            System.out.print("Please enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 1) {
                addItem();
            } else if (choice == 2) {
                editItem();
            } else if (choice == 3) {
                removeItem();
            } else if (choice == 4) {
                viewItems();
            } else if (choice == 5) {
                System.out.println("Exiting...");
                running = false;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public static void addItem() {
        System.out.print("Enter Item ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println(id);
        System.out.print("Enter Item name: ");
        String name = scanner.nextLine();
        System.out.println(name);
        System.out.print("Enter Item price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println(price);

        System.out.print("Enter Item category: ");
        String category = scanner.nextLine();
        System.out.println(category);
        Item item = new Item(id, name, price, category);
        itemList.add(item);
        System.out.println("Item added successfully.");
    }

    public static void editItem() {
        System.out.print("Enter ID of item to edit: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Item item : itemList) {
            if (item.getId() == id) {
                System.out.print("Enter new name: ");
                item.setName(scanner.nextLine());

                System.out.print("Enter new price: ");
                item.setPrice(scanner.nextDouble());
                scanner.nextLine();

                System.out.print("Enter new category: ");
                item.setCategory(scanner.nextLine());

                System.out.println("Item updated successfully.");
                return;
            }
        }

        System.out.println("Item with ID " + id + " not found.");
    }

    public static void removeItem() {
        System.out.print("Enter ID of item to remove: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Item item : itemList) {
            if (item.getId() == id) {
                itemList.remove(item);
                System.out.println("Item removed successfully.");
                return;
            }
        }

        System.out.println("Item with ID " + id + " not found.");
    }

    public static void viewItems() {
        if (itemList.isEmpty()) {
            System.out.println("No items in inventory.");
        } else {
            System.out.println("\n--- Item List ---");
            for (Item item : itemList) {
                System.out.println(item.toString());
            }
        }
    }
}