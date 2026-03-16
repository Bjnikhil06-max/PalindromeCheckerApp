import java.util.Scanner;
import java.util.Stack;

public class UseCase5PalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Push characters into stack
        for(int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Pop characters to form reversed string
        String reversed = "";
        while(!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        System.out.println("Reversed string: " + reversed);

        // Check palindrome
        if(str.equals(reversed))
            System.out.println("The string is a Palindrome");
        else
            System.out.println("The string is NOT a Palindrome");

        sc.close();
    }
}