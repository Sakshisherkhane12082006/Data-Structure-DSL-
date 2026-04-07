import java.util.Scanner;

class Node {
    int data;
    Node next;
}

class StackLL {
    Node top = null;
    Node avail = null;

    // Get node
    Node getNode() {
        Node temp;
        if (avail != null) {
            temp = avail;
            avail = avail.next;
        } else {
            temp = new Node();
        }
        temp.next = null;
        return temp;
    }

    // Free node
    void freeNode(Node temp) {
        temp.next = avail;
        avail = temp;
    }

    // Push
    void push(int x) {
        Node temp = getNode();
        temp.data = x;
        temp.next = top;
        top = temp;
        System.out.println("Pushed: " + x);
    }

    // Pop
    void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }
        Node temp = top;
        System.out.println("Popped: " + temp.data);
        top = top.next;
        freeNode(temp);
    }

    // Display
    void display() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return;
        }
        Node temp = top;
        System.out.print("Stack: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackLL s = new StackLL();
        int ch, val;

        do {
            System.out.println("\n--- STACK MENU ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter value: ");
                    val = sc.nextInt();
                    s.push(val);
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    s.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (ch != 4);
    }
}