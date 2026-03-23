import java.util.*;

public class UseCase6PalindromeCheckerApp {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        int n, x;

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            x = sc.nextInt();
            stack.push(x);   // LIFO
            queue.add(x);    // FIFO
        }

        // Stack (LIFO)
        System.out.print("\nStack (LIFO order): ");
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        // Queue (FIFO)
        System.out.print("\nQueue (FIFO order): ");
        while(!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }

        sc.close();
    }
}