package Threads.Demo1;

public class mains {
    public static void main(String[] args) {
        EvenPrinter evnprt=new EvenPrinter();
        System.out.println(Thread.currentThread().getName());
        OddPrinter oddprt=new OddPrinter();
        System.out.println(Thread.currentThread().getName());
        Thread ept=new Thread(evnprt);
        Thread opt=new Thread(oddprt);
        ept.start();
        opt.start();
    }
}
