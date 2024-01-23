package Threads;

public class Basic_Thread implements Runnable{

    @Override
    public void run() {
    System.out.println("I am new thread "+Thread.currentThread().getName());
    }

}
