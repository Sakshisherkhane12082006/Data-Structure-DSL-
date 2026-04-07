import java.util.Scanner;

class Node {
    int data;
    Node next;
}

class QueueLL {
    Node front = null, rear = null;
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

    // Enqueue
    void enqueue(int x) {
        Node temp = getNode();
        temp.data = x;

        if (rear == null) {
            front = rear = temp;
        } else {
            rear.next = temp;
            rear = temp;
        }

        System.out.println("Inserted: " + x);
    }

    // Dequeue
    void dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return;
        }

        Node temp = front;
        System.out.println("Deleted: " + temp.data);

        front = front.next;
        if (front == null)
            rear = null;

        freeNode(temp);
    }

    // Display
    void display() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }

        Node temp = front;
        System.out.print("Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLL q = new QueueLL();
        int ch, val;

        do {
            System.out.println("\n--- QUEUE MENU ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter value: ");
                    val = sc.nextInt();
                    q.enqueue(val);
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.display();
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
