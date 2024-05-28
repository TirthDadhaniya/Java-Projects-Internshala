package AdvanceJava;

public class BankApplicationLock {

    public static void main(String[] args) {

        BankAccountLock account = new BankAccountLock(10000.00);

        //create threads
        Thread withdrawThread = new Thread(() -> { account.withdraw_amount(1000);});
        Thread depositeThread = new Thread(() -> {account.deposit_amount(500);});
        Thread checkThread = new Thread(() -> { account.check_balance();});

        //start
        withdrawThread.start();
        depositeThread.start();
        checkThread.start();

    }
}