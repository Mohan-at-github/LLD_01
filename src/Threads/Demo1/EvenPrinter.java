package Threads.Demo1;

public class EvenPrinter implements Runnable{
    public void run()
    {
      for(int i=0;i<10;i++)
      {
          if(i%2==0)
          {
              System.out.println(i+" is even number");
          }
      }
    }
}
