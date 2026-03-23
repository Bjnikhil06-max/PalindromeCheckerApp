import java.util.*;

public class UseCase7PalindromeCheckerApp {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);

        int n, x;

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            x = sc.nextInt();
            deque.add(x);   // insert at rear
        }

        // Display deque
        System.out.println("\nDeque elements: " + deque);

        // Get front and rear
        int front = deque.peekFirst();
        int rear = deque.peekLast();

        System.out.println("Front element: " + front);
        System.out.println("Rear element: " + rear);

        // Compare
        if(front == rear) {
            System.out.println("Front and Rear elements are EQUAL");
        } else {
            System.out.println("Front and Rear elements are NOT EQUAL");
        }

        sc.close();
    }
}