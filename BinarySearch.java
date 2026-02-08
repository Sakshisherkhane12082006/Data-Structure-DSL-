import java.util.Scanner;

class BinarySearch {
    public static void main(String args[]) {
        int a[] = new int[5];
        int low = 0, high = 4, mid, key;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 sorted numbers:");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter number to search: ");
        key = sc.nextInt();

        while (low <= high) {
            mid = (low + high) / 2;

            if (a[mid] == key) {
                System.out.println("Element found");
                return;
            } else if (a[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Element not found");
    }
}

