import java.util.Scanner;

class LinearSearch {
    public static void main(String args[]) {
        int a[] = new int[5];
        int key;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter number to search: ");
        key = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            if (a[i] == key) {
                System.out.println("Element found");
                return;
            }
        }

        System.out.println("Element not found");
    }
}
