import java.util.*;

class PalindromeChecker {
    private String text;   // encapsulated data

    // Constructor
    PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check palindrome
    public boolean isPalindrome() {
        String cleaned = text.toLowerCase().replaceAll("\\s", "");
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
}

public class UseCase11PalindromeCheckerApp  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Create object
        PalindromeChecker obj = new PalindromeChecker(input);

        // Call method
        if(obj.isPalindrome()) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}