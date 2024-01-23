package Threads;

public class Mains {
    public static void main(String[] args) {
        Basic_Thread basicThread=new Basic_Thread(); //it is a thread_object and it gives what logic to run as a thread
        System.out.println("Main thread: " + Thread.currentThread().getName());
        Thread t1=new Thread(basicThread); //child thread
        t1.start();
        Thread t2=new Thread(basicThread); //child thread
        t2.start();
    }
}
