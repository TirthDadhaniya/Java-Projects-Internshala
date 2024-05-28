package AdvanceJava;

public class ThreadApplication {

    public static void main(String[] args) {

        //EXTENDS method
        ThreadExtendsMethod thread1 = new ThreadExtendsMethod();
        ThreadExtendsMethod thread2 = new ThreadExtendsMethod();

        //start thread
        thread1.start();
        thread2.start();

        //RUNNABLE method
        ThreadRunnableInterface runnableobj = new ThreadRunnableInterface();

        //create thread
        Thread runnable1 = new Thread(runnableobj);
        Thread runnable2 = new Thread(runnableobj);

        //start thread
        runnable1.start();
        runnable2.start();

    }
}
