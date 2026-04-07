package ExperimentNo8;

import java.util.Scanner;

class Node {
    int data;
    Node next;
}

class SinglyLL {
    Node head = null;

    // Insert at beginning
    void insertBeg(int x) {
        Node temp = new Node();
        temp.data = x;
        temp.next = head;
        head = temp;
    }

    // Insert at end
    void insertEnd(int x) {
        Node temp = new Node();
        temp.data = x;
        temp.next = null;

        if (head == null) {
            head = temp;
            return;
        }

        Node ptr = head;
        while (ptr.next != null)
            ptr = ptr.next;

        ptr.next = temp;
    }

    // Delete from beginning
    void deleteBeg() {
        if (head == null) {
            System.out.println("List Empty");
            return;
        }
        System.out.println("Deleted: " + head.data);
        head = head.next;
    }

    // Display
    void display() {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLL list = new SinglyLL();
        int ch, val;

        do {
            System.out.println("\n1.Insert Beg  2.Insert End  3.Delete Beg  4.Display  5.Exit");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter value: ");
                    list.insertBeg(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter value: ");
                    list.insertEnd(sc.nextInt());
                    break;
                case 3:
                    list.deleteBeg();
                    break;
                case 4:
                    list.display();
                    break;
            }
        } while (ch != 5);
    }
}