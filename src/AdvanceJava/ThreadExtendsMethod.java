package AdvanceJava;

public class ThreadExtendsMethod extends Thread{

    @Override
    public void run(){

        for (int i=1; i<=2; i++){
            System.out.println("Current Thread: " + Thread.currentThread().getId() + " Thread count: " + i);
        }
    }
}
