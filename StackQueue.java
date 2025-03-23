//Ass 2
import java.util.*;

public class StackQueue {
    public static void main(String[] args) {
        // Stack Implementation
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);
        System.out.println("Popped from Stack: " + stack.pop());
        System.out.println("Top of Stack: " + stack.peek());
        System.out.println("Stack after pop: " + stack);

        // Queue Implementation
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println("\nQueue: " + queue);
        System.out.println("Removed from Queue: " + queue.poll());
        System.out.println("Front of Queue: " + queue.peek());
        System.out.println("Queue after poll: " + queue);
    }
}
/*Output
Stack: [10, 20, 30]
Popped from Stack: 30
Top of Stack: 20
Stack after pop: [10, 20]

Queue: [1, 2, 3]
Removed from Queue: 1
Front of Queue: 2
Queue after poll: [2, 3]*/