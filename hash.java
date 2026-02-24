import java.util.Scanner;

class HashTable {
    int arr[];
    int size;

    HashTable(int s) {
        size = s;
        arr = new int[size];

        // Initialize all positions as empty
        for (int i = 0; i < size; i++) {
            arr[i] = -1;   // -1 means empty
        }
    }

    // Insert
    void insert(int key) {
        int index = key % size;

        while (arr[index] != -1 && arr[index] != -2) {
            index = (index + 1) % size;   // linear probing
        }

        arr[index] = key;
        System.out.println("Inserted at index " + index);
    }

    // Delete
    void delete(int key) {
        int index = key % size;

        while (arr[index] != -1) {

            if (arr[index] == key) {
                arr[index] = -2;   // mark as deleted
                System.out.println("Deleted successfully");
                return;
            }

            index = (index + 1) % size;
        }

        System.out.println("Element not found");
    }

    // Search
    void search(int key) {
        int index = key % size;

        while (arr[index] != -1) {

            if (arr[index] == key) {
                System.out.println("Element found at index " + index);
                return;
            }

            index = (index + 1) % size;
        }

        System.out.println("Element not found");
    }

    // Display
    void display() {
        System.out.println("\nHash Table:");
        for (int i = 0; i < size; i++) {
            System.out.println("Index " + i + " : " + arr[i]);
        }
    }
}

public class hash {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hash table size: ");
        int size = sc.nextInt();

        HashTable h = new HashTable(size);

        int choice, value;

        do {
            System.out.println("\n1.Insert");
            System.out.println("2.Delete");
            System.out.println("3.Search");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    h.insert(value);
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    h.delete(value);
                    break;

                case 3:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    h.search(value);
                    break;

                case 4:
                    h.display();
                    break;

                case 5:
                    System.out.println("Program Ended");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);
    }
}

