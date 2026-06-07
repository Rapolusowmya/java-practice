/* synchronisation - control access of multiple threads to a shared resource
*when you run the below code with no synchronous block, then t1 and t2 threads will run paralelley and there is no guarantee which one will execute frst. There will be no order
*
*If we put printTable as synchronised, then only either t1 or t2 can access printTable. so thats why frst 5 table prints and then 7 table prints.
*
*Synchronisation can be acheived in 2 methods
* 1. Mutual exclusive
*       synchronisation block -- lock on specific peice of code, so better control and performance. No intervention between the threads
*       synchronisation methods -- lock on object. Intervention between the threads is possible because threads will have lock at object level
*       static synchronisation method -- lock at class level. Either t1 or t2 enters. until t1 finishes t2 has to wait.
*2. Inter Thread commnication
* wait() -  waiting for a specified time or till another thread invokes notify or notifyAll
* notify() - wakes up a single thread that is under this objects monitor
* notifyAll() - wakes up all the thtead under this objects monitor
*
*
*
* */
package concepts;
class Table
{
    public synchronized void printTable(int t)
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(" jhgk" + t*i);
        }
    }
}
class Thread1 extends Thread
{
    Table t;
    Thread1(Table t)
    {
        this.t = t;
    }
    public void run()
    {
        t.printTable(5);
    }

}
class Thread2 extends Thread
{
    Table t;
    Thread2(Table t)
    {
        this.t = t;
    }
    public void run()
    {
        t.printTable(7);
    }
}

public class SynchronisedThreads {
    public static void main(String[] args)
    {
        Table t = new Table();
        Thread1 t1 = new Thread1(t);
        Thread2 t2 = new Thread2(t);
        t1.start();
        t2.start();

    }
}
