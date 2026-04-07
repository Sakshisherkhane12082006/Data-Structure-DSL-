package ExperimentNo8;

import java.util.Scanner;

class DNode {
    int data;
    DNode prev, next;
}

class DoublyLL {
    DNode head = null;

    // Insert at beginning
    void insertBeg(int x) {
        DNode temp = new DNode();
        temp.data = x;

        temp.next = head;
        temp.prev = null;

        if (head != null)
            head.prev = temp;

        head = temp;
    }

    // Insert at end
    void insertEnd(int x) {
        DNode temp = new DNode();
        temp.data = x;
        temp.next = null;

        if (head == null) {
            temp.prev = null;
            head = temp;
            return;
        }

        DNode ptr = head;
        while (ptr.next != null)
            ptr = ptr.next;

        ptr.next = temp;
        temp.prev = ptr;
    }

    // Delete from end
    void deleteEnd() {
        if (head == null) {
            System.out.println("List Empty");
            return;
        }

        DNode ptr = head;
        while (ptr.next != null)
            ptr = ptr.next;

        System.out.println("Deleted: " + ptr.data);

        if (ptr.prev != null)
            ptr.prev.next = null;
        else
            head = null;
    }

    // Display forward
    void display() {
        DNode ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " <-> ");
            ptr = ptr.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLL list = new DoublyLL();
        int ch;

        do {
            System.out.println("\n1.Insert Beg  2.Insert End  3.Delete End  4.Display  5.Exit");
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
                    list.deleteEnd();
                    break;
                case 4:
                    list.display();
                    break;
            }
        } while (ch != 5);
    }
}
