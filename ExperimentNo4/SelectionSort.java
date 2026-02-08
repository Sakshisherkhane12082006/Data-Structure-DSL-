package ExperimentNo4;

import java.util.Scanner;

class SelectionSort {
    public static void main(String args[]) {
        int a[] = new int[5];
        int min, temp;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            min = i;
            for (int j = i + 1; j < 5; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
