import java.util.*;

public class UseCase10PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Step 1: convert to lowercase
        input = input.toLowerCase();

        // Step 2: remove spaces
        input = input.replaceAll("\\s", "");

        // Step 3: reverse string
        String reversed = "";
        for(int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Step 4: compare
        if(input.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}