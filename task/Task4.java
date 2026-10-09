import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a string : ");
            String input = scanner.nextLine();

            String cleaned = input.toLowerCase();
            String reversed = new StringBuilder(cleaned).reverse().toString();

            if (cleaned.equals(reversed)) {
                System.out.println("The input string is a palindrome");
            } else {
                System.out.println("The input string is not a palindrome");
            }
        }
    }
}