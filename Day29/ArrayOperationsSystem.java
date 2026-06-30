package Day29;
import java.util.Scanner;

public class ArrayOperationsSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[100];
        int n = 0;
        int choice;

        do {
            System.out.println("\n===== Array Operations System =====");
            System.out.println("1. Enter Array Elements");
            System.out.println("2. Display Array");
            System.out.println("3. Find Maximum Element");
            System.out.println("4. Find Minimum Element");
            System.out.println("5. Find Sum of Elements");
            System.out.println("6. Search an Element");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Size of Array: ");
                    n = scan.nextInt();

                    System.out.println("Enter Array Elements:");
                    for (int i = 0; i < n; i++) {
                        arr[i] = scan.nextInt();
                    }
                    break;

                case 2:
                    if (n == 0) {
                        System.out.println("Array is Empty.");
                    } else {
                        System.out.print("Array Elements: ");
                        for (int i = 0; i < n; i++) {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    if (n == 0) {
                        System.out.println("Array is Empty.");
                    } else {
                        int max = arr[0];
                        for (int i = 1; i < n; i++) {
                            if (arr[i] > max) {
                                max = arr[i];
                            }
                        }
                        System.out.println("Maximum Element = " + max);
                    }
                    break;

                case 4:
                    if (n == 0) {
                        System.out.println("Array is Empty.");
                    } else {
                        int min = arr[0];
                        for (int i = 1; i < n; i++) {
                            if (arr[i] < min) {
                                min = arr[i];
                            }
                        }
                        System.out.println("Minimum Element = " + min);
                    }
                    break;

                case 5:
                    if (n == 0) {
                        System.out.println("Array is Empty.");
                    } else {
                        int sum = 0;
                        for (int i = 0; i < n; i++) {
                            sum += arr[i];
                        }
                        System.out.println("Sum of Elements = " + sum);
                    }
                    break;

                case 6:
                    if (n == 0) {
                        System.out.println("Array is Empty.");
                    } else {
                        System.out.print("Enter Element to Search: ");
                        int key = scan.nextInt();
                        boolean found = false;

                        for (int i = 0; i < n; i++) {
                            if (arr[i] == key) {
                                System.out.println("Element Found at Index " + i);
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Element Not Found.");
                        }
                    }
                    break;

                case 7:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 7);

        scan.close();
    }
}