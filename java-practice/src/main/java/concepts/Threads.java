/*Thread - a lightweight subprocess . A unit of processing in multi threading
*
*Thread can be created using
* Extending Thread class
* or implementing Runnable interface(explicitly should pass the instance of obj to Thread class else not identified as a thread)
*
*
*
*
*
*
*
*
*
*
* */
package concepts;
class ThreadClass extends Thread
{
    public void run()
    {
        System.out.println(" run using extending thread class");
    }
}
class RunnableExample implements Runnable
{
    public void run()
    {
        System.out.println("run using implementing runnable interface");
    }
}
public class Threads {
    public static void main(String[] args)
    {
        ThreadClass tc = new ThreadClass();
        tc.run();
        RunnableExample re = new RunnableExample();
        Thread rex = new Thread(re);
        rex.run();
    }
}
