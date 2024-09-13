import java.util.Scanner;

public class OddEvenChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read the first integer from the user
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        // Read the second integer from the user
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Check if the first number is odd or even
        if (num1 % 2 == 0) {
            System.out.println("The first number " + num1 + " is even.");
        } else {
            System.out.println("The first number " + num1 + " is odd.");
        }

        // Check if the second number is odd or even
        if (num2 % 2 == 0) {
            System.out.println("The second number " + num2 + " is even.");
        } else {
            System.out.println("The second number " + num2 + " is odd.");
        }

        // Close the scanner to prevent resource leaks
        sc.close();
    }
}