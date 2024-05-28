package AdvanceJava;

public class ThreadRunnableInterface implements Runnable{

    @Override
    public void run(){
        for (int i=3; i<=4; i++){
            System.out.println("Current Thread: " + Thread.currentThread().getId() + " Thread count: " + i);
        }
    }
}
