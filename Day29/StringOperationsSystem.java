package Day29;
import java.util.Scanner;

public class StringOperationsSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = "";
        int choice;

        do {
            System.out.println("\n===== String Operations System =====");
            System.out.println("1. Enter String");
            System.out.println("2. Display String");
            System.out.println("3. Find Length");
            System.out.println("4. Convert to Uppercase");
            System.out.println("5. Convert to Lowercase");
            System.out.println("6. Reverse String");
            System.out.println("7. Check Palindrome");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine(); // Consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter a String: ");
                    str = scan.nextLine();
                    break;

                case 2:
                    if (str.isEmpty()) {
                        System.out.println("No String Entered.");
                    } else {
                        System.out.println("String: " + str);
                    }
                    break;

                case 3:
                    if (str.isEmpty()) {
                        System.out.println("No String Entered.");
                    } else {
                        System.out.println("Length = " + str.length());
                    }
                    break;

                case 4:
                    if (str.isEmpty()) {
                        System.out.println("No String Entered.");
                    } else {
                        System.out.println("Uppercase: " + str.toUpperCase());
                    }
                    break;

                case 5:
                    if (str.isEmpty()) {
                        System.out.println("No String Entered.");
                    } else {
                        System.out.println("Lowercase: " + str.toLowerCase());
                    }
                    break;

                case 6:
                    if (str.isEmpty()) {
                        System.out.println("No String Entered.");
                    } else {
                        String rev = "";
                        for (int i = str.length() - 1; i >= 0; i--) {
                            rev += str.charAt(i);
                        }
                        System.out.println("Reversed String: " + rev);
                    }
                    break;

                case 7:
                    if (str.isEmpty()) {
                        System.out.println("No String Entered.");
                    } else {
                        String rev = "";
                        for (int i = str.length() - 1; i >= 0; i--) {
                            rev += str.charAt(i);
                        }

                        if (str.equalsIgnoreCase(rev)) {
                            System.out.println("Palindrome String");
                        } else {
                            System.out.println("Not a Palindrome String");
                        }
                    }
                    break;

                case 8:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 8);

        scan.close();
    }
}