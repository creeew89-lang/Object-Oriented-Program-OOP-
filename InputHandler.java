package Hospital.utils;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public final class InputHandler {

    private static final Scanner SCAN = new Scanner(System.in);

    private InputHandler() {}

    public static String getStringInput(String prompt) {
        System.out.print(prompt);
        return SCAN.nextLine().trim();
    }

    public static int getIntInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(SCAN.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer, try again.");
            }
        }
    }

    public static int getIntInput(String prompt, int min, int max) {
        while (true) {
            int val = getIntInput(prompt);
            if (val >= min && val <= max) return val;
            System.out.println("Out of range, enter between " + min + " and " + max + ".");
        }
    }

    public static double getDoubleInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Double.parseDouble(SCAN.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid decimal, try again.");
            }
        }
    }

    public static LocalDate getDateInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return LocalDate.parse(SCAN.nextLine().trim());
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date (yyyy-MM-dd), try again.");
            }
        }
    }

    public static boolean getConfirmation(String prompt) {
        while (true) {
            String in = getStringInput(prompt + " (y/n): ").toLowerCase();
            if (in.equals("y")) return true;
            if (in.equals("n")) return false;
            System.out.println("Enter y or n.");
        }
    }
}