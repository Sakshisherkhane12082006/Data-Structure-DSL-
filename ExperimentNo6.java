import java.util.Scanner;

class QueueArray {
    int queue[];
    int front, rear, size;

    QueueArray(int n) {
        size = n;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    void enqueue(int x) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1)
                front = 0;
            rear++;
            queue[rear] = x;
            System.out.println(x + " inserted into queue");
        }
    }

    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(queue[front] + " deleted from queue");
            front++;
        }
    }

    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue elements:");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
}

public class ExperimentNo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueArray q = new QueueArray(5);

        int choice, value;

        do {
            System.out.println("\n1.Enqueue\n2.Dequeue\n3.Display\n4.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    q.enqueue(value);
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
        } while (choice != 4);
    }
}