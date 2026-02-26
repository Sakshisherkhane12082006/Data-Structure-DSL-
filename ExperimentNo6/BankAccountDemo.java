package ExperimentNo6;

import java.util.Scanner;

class LowBalanceException extends Exception {
    LowBalanceException(String message) {
        super(message);
    }
}

class NegativeNumberException extends Exception {
    NegativeNumberException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) throws NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot deposit negative amount!");
        }
        balance += amount;
        System.out.println("Amount Deposited Successfully.");
    }

    void withdraw(double amount) throws LowBalanceException, NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot withdraw negative amount!");
        }
        if (amount > balance) {
            throw new LowBalanceException("Insufficient Balance!");
        }
        balance -= amount;
        System.out.println("Amount Withdrawn Successfully.");
    }

    void balanceEnquiry() {
        System.out.println("Current Balance: " + balance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount(1000);

        try {
            System.out.print("Enter amount to deposit: ");
            double d = sc.nextDouble();
            acc.deposit(d);

            System.out.print("Enter amount to withdraw: ");
            double w = sc.nextDouble();
            acc.withdraw(w);

        } catch (NegativeNumberException | LowBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        acc.balanceEnquiry();
        sc.close();
    }
}