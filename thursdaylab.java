/*Write a program that creates 2 threads - each displaying a message (Pass the message as a parameter to the constructor). 
The threads should display the messages continuously till the user presses any key. */

package tanu31

class MyThread extends Thread {

	String str;
    public MyThread(String s)
    {
        str=s;  
    }
    public void run()
    {
        while(true)
        {   System.out.println((Thread.currentThread()).getName()+" "+"Message: "+str);
            System.out.println((Thread.currentThread()).getName()+" "+"Priority:  "+(Thread.currentThread()).getPriority());

            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ie)
            { 
                System.out.println(ie.toString());
            }           
        }
    }
}
public class ThreadSetA1
{
    public static void main(String args[])
    {
        MyThread t1= new MyThread("ON");
        MyThread t2= new MyThread("OFF");       
        System.out.println("Details of the Threads in running state....");
        t1.start();
        t2.start();
    }
}






------------------

/*Write a Java program using Synchronized Threads, which demonstrates Producer Consumer concept. 
Producer Consumer problem: The producer-consumer problem is the classical concurrency of a multi process synchronization problem. 
It is also known as bound-buffer problem. The problem describes two processes, the producer and the consumer, who share a common, fixed-size buffer used as a queue. 
The producer generates a piece of data, put it into the buffer and starts again. */

import java.util.LinkedList;

public class Threadexample {
    public static void main(String[] args)
        throws InterruptedException
    {
        // Object of a class that has both produce()
        // and consume() methods
        final PC pc = new PC();

        // Create producer thread
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    pc.produce();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Create consumer thread
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    pc.consume();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start both threads
        t1.start();
        t2.start();

        // t1 finishes before t2
        t1.join();
        t2.join();
    }

    // This class has a list, producer (adds items to list
    // and consumer (removes items).
    public static class PC {

        // Create a list shared by producer and consumer
        // Size of list is 2.
        LinkedList<Integer> list = new LinkedList<>();
        int capacity = 2;

        // Function called by producer thread
        public void produce() throws InterruptedException
        {
            int value = 0;
            while (true) {
                synchronized (this)
                {
                    // producer thread waits while list
                    // is full
                    while (list.size() == capacity)
                        wait();

                    System.out.println("Producer produced-"
                                       + value);

                    // to insert the jobs in the list
                    list.add(value++);

                    // notifies the consumer thread that
                    // now it can start consuming
                    notify();

                    // makes the working of program easier
                    // to  understand
                    Thread.sleep(1000);
                }
            }
        }

        // Function called by consumer thread
        public void consume() throws InterruptedException
        {
            while (true) {
                synchronized (this)
                {
                    // consumer thread waits while list
                    // is empty
                    while (list.size() == 0)
                        wait();

                    // to retrieve the first job in the list
                    int val = list.removeFirst();

                    System.out.println("Consumer consumed-"
                                       + val);

                    // Wake up producer thread
                    notify();

                    // and sleep
                    Thread.sleep(1000);
                }
            }
        }
    }
}





-------------------------

/* Write a JAVA program which will generate the threads: - To display 10 terms of Fibonacci series. - To display 1 to 10 in reverse order. */


import java.io.*;
class Fibonacci extends Thread
{
     public void run()
     {
          try
          {
               int a=0, b=1, c=0;
               BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

               System.out.print("Enter the Limit for fabonacci: ");

               int n = Integer.parseInt(br.readLine());
               System.out.println("\n=================================");
               System.out.println("Fibonacci series:");
               while (n>0)
               {
                    System.out.print(c+" ");
                    a=b;
                    b=c;
                    c=a+b;
                    n=n-1;
               }
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
}

}
