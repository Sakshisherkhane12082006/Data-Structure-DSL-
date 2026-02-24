package ExperimentNo5;
class Stack {
    int arr[];
    int top;
    int capacity;

    // Constructor
    Stack(int size) {
        capacity = size;
        arr = new int[capacity];
        top = -1;
    }

    // Push operation
    void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        arr[++top] = value;
        System.out.println(value + " pushed into stack");
    }

    // Pop operation
    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Stack is empty");
            return -1;
        }
        return arr[top--];
    }

    // Peek operation
    int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    // Check if stack is empty
    boolean isEmpty() {
        return top == -1;
    }

    // Display stack elements
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element: " + stack.peek());

        stack.display();
    }
}
