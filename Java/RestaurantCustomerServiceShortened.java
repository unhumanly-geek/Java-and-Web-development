import java.util.Scanner;

public class RestaurantCustomerServiceShortened {

    private static final String[] MENU = { "Burger", "Pizza", "Pasta", "Salad", "Soft Drink", "Dessert" };
    private static final double[] ITEM_PRICES = { 8.99, 10.99, 12.99, 7.99, 2.49, 5.99 };
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        displayMenu();
        double totalBill = takeOrder();
        System.out.printf("\nYour bill:\nTotal: $%.2f%n", totalBill);
        performInputOperations();
        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("Menu:");
        for (int i = 0; i < MENU.length; i++) {
            System.out.printf("%d. %s - $%.2f%n", (i + 1), MENU[i], ITEM_PRICES[i]);
        }
    }

    private static double takeOrder() {
        double totalBill = 0;
        System.out.println("Enter your order (or '0' when done):");
        while (true) {
            int itemNumber = getIntInput("Item number (1-6): ", 0, MENU.length);
            if (itemNumber == 0) {
                break;
            }
            int quantity = getIntInput("Quantity: ", 1, Integer.MAX_VALUE);
            totalBill += ITEM_PRICES[itemNumber - 1] * quantity;
        }
        return totalBill;
    }

    private static int getIntInput(String prompt, int minValue, int maxValue) {
        int input;
        do {
            System.out.print(prompt);
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
            input = scanner.nextInt();
            if (input < minValue || input > maxValue) {
                System.out.printf("Invalid input. Please enter a number between %d and %d.%n", minValue, maxValue);
            }
        } while (input < minValue || input > maxValue);
        return input;
    }

    private static void performInputOperations() {
        System.out.println("\nEnter two inputs:");
        if (scanner.hasNextInt() && scanner.hasNextInt()) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            System.out.println("Sum: " + (num1 + num2));
        } else if (scanner.hasNextDouble() && scanner.hasNextDouble()) {
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            System.out.println("Sum: " + (num1 + num2));
        } else if (scanner.hasNext() && scanner.hasNext()) {
            String str1 = scanner.next();
            String str2 = scanner.next();
            System.out.println("Concatenated String: " + str1 + " " + str2);
        } else {
            System.out.println("Invalid input format.");
        }
    }
}