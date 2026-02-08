package ExperimentNo4;

import java.util.Scanner;

class BubbleSort {
    public static void main(String args[]) {
        int a[] = new int[5];
        int temp;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
