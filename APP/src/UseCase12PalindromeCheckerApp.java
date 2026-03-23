import java.util.*;

class PalindromeAlgorithms {

    // Method 1: Reverse string
    public static boolean checkByReverse(String str) {
        String cleaned = str.toLowerCase().replaceAll("\\s", "");
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    // Method 2: Two-pointer technique
    public static boolean checkByTwoPointer(String str) {
        String cleaned = str.toLowerCase().replaceAll("\\s", "");
        int left = 0, right = cleaned.length() - 1;

        while(left < right) {
            if(cleaned.charAt(left) != cleaned.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}

public class UseCase12PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("\nChoose method:");
        System.out.println("1. Reverse Method");
        System.out.println("2. Two Pointer Method");

        int choice = sc.nextInt();
        boolean result = false;

        switch(choice) {
            case 1:
                result = PalindromeAlgorithms.checkByReverse(input);
                break;

            case 2:
                result = PalindromeAlgorithms.checkByTwoPointer(input);
                break;

            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }

        if(result)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}