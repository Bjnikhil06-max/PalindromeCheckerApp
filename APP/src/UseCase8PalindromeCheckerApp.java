import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class UseCase8PalindromeCheckerApp {

    // Function to check palindrome
    static boolean isPalindrome(Node head) {
        Stack<Integer> stack = new Stack<>();
        Node temp = head;

        // Push all elements into stack
        while(temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }

        // Compare again
        temp = head;
        while(temp != null) {
            if(temp.data != stack.pop()) {
                return false;
            }
            temp = temp.next;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, x;
        Node head = null, temp = null;

        System.out.print("Enter number of nodes: ");
        n = sc.nextInt();

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            x = sc.nextInt();
            Node newNode = new Node(x);

            if(head == null) {
                head = newNode;
                temp = newNode;
            } else {
                temp.next = newNode;
                temp = newNode;
            }
        }

        // Check palindrome
        if(isPalindrome(head)) {
            System.out.println("Linked List is a Palindrome");
        } else {
            System.out.println("Linked List is NOT a Palindrome");
        }

        sc.close();
    }
}