import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class UseCase9PalindromeCheckerApp {

    static Node left;  // global pointer

    // Recursive function
    static boolean isPalindromeUtil(Node right) {
        if (right == null)
            return true;

        // Recurse till end
        boolean res = isPalindromeUtil(right.next);
        if (!res)
            return false;

        // Compare left and right
        if (left.data != right.data)
            return false;

        // Move left pointer forward
        left = left.next;

        return true;
    }

    static boolean isPalindrome(Node head) {
        left = head;
        return isPalindromeUtil(head);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, x;
        Node head = null, temp = null;

        System.out.print("Enter number of nodes: ");
        n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            Node newNode = new Node(x);

            if (head == null) {
                head = newNode;
                temp = newNode;
            } else {
                temp.next = newNode;
                temp = newNode;
            }
        }

        if (isPalindrome(head))
            System.out.println("Linked List is a Palindrome");
        else
            System.out.println("Linked List is NOT a Palindrome");

        sc.close();
    }
}