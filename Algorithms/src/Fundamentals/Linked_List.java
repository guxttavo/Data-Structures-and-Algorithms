package Fundamentals;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Linked_List {
    public static void main(String[] args) {
        Stack_Ex myStack = new Stack_Ex();
        myStack.demo();

        Queue_Ex myQueue = new Queue_Ex();
        myQueue.demo();
    }
}

class Stack_Ex {
    //o tipo define o que você pode fazer
    //a instância define como isso é feito
    Deque<Integer> stack = new LinkedList<>();

    void demo() {
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek()); // 30
        stack.pop();
        System.out.println(stack.peek()); // 20
    }
}

class Queue_Ex {
    Queue<Integer> queue = new LinkedList<>();

    void demo() {
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println(queue.peek()); // 10
        queue.poll();
        System.out.println(queue.peek()); // 20
    }

}

