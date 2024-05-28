package AdvanceJava;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccountLock {

    private double balance;
    private final Lock lockk = new ReentrantLock();

    //constructor
    public BankAccountLock(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.balance = balance;
    }

    //getters and setters
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //methods for Application
    public void deposit_amount(double amount) {
        lockk.lock();
        try {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
        } else if (amount > 0) {
            balance = balance + amount;
            System.out.printf("Amount \"%.2f\" deposited. Your balance is %.2f.\n",amount,balance);
        }
    }
        finally {
            lockk.unlock();
        }
    }

    public void withdraw_amount(double amount) {
        lockk.lock();
        try {
            if (amount <= 0) {
                System.out.println("Invalid withdraw amount");
            }
            else if (amount < balance) {
                balance = balance - amount;
                System.out.println("Amount \""+amount+"\" withdrawn. Your balance is "+balance);
            }
        }
        finally {
            lockk.unlock();
        }
    }

    public void check_balance() {
        lockk.lock();
        try {
            System.out.println("Balance is " +balance);
        }
        finally {
            lockk.unlock();
        }
    }
}
