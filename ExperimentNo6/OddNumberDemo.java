package ExperimentNo6;

import java.util.Scanner;


class OddNumberException extends Exception {
    OddNumberException(String message) {
        super(message);
    }
}

public class OddNumberDemo {

    static void checkNumber(int num) throws OddNumberException {
        if (num % 2 != 0) {
            throw new OddNumberException("Number is Odd!");
        }
        System.out.println("Number is Even.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            checkNumber(n);
        } catch (OddNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}