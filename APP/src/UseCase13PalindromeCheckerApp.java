
import java.util.*;

public class UseCase13PalindromeCheckerApp {

    // Method 1: Reverse String
    public static boolean reverseMethod(String str) {
        String cleaned = str.toLowerCase().replaceAll("\\s", "");
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    // Method 2: Two Pointer (BEST)
    public static boolean twoPointerMethod(String str) {
        String cleaned = str.toLowerCase().replaceAll("\\s", "");
        int left = 0, right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    // Method 3: Stack Method
    public static boolean stackMethod(String str) {
        String cleaned = str.toLowerCase().replaceAll("\\s", "");
        Stack<Character> stack = new Stack<>();

        for (char c : cleaned.toCharArray())
            stack.push(c);

        for (char c : cleaned.toCharArray()) {
            if (c != stack.pop())
                return false;
        }
        return true;
    }

    // Method 4: Recursion Method
    static int left;
    public static boolean recursionHelper(String str, int right) {
        if (right < left)
            return true;

        if (str.charAt(left) != str.charAt(right))
            return false;

        left++;
        return recursionHelper(str, right - 1);
    }

    public static boolean recursionMethod(String str) {
        String cleaned = str.toLowerCase().replaceAll("\\s", "");
        left = 0;
        return recursionHelper(cleaned, cleaned.length() - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        long start, end;

        // Reverse Method
        start = System.nanoTime();
        boolean r1 = reverseMethod(input);
        end = System.nanoTime();
        System.out.println("\nReverse Method: " + (r1 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Time: " + (end - start) + " ns");

        // Two Pointer Method
        start = System.nanoTime();
        boolean r2 = twoPointerMethod(input);
        end = System.nanoTime();
        System.out.println("\nTwo Pointer Method: " + (r2 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Time: " + (end - start) + " ns");

        // Stack Method
        start = System.nanoTime();
        boolean r3 = stackMethod(input);
        end = System.nanoTime();
        System.out.println("\nStack Method: " + (r3 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Time: " + (end - start) + " ns");

        // Recursion Method
        start = System.nanoTime();
        boolean r4 = recursionMethod(input);
        end = System.nanoTime();
        System.out.println("\nRecursion Method: " + (r4 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Time: " + (end - start) + " ns");

        sc.close();
    }
}