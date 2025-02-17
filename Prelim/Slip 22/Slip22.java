public class Slip22 extends Thread 
{
    public static void main(String args[])
    {
        System.out.println("This is the current Thread created by JVM");
        System.out.println("Name of Current thread : "+Thread.currentThread().getName());
        Thread.currentThread().setName("MyThread");
        System.out.println("After changing the name of mainThread : "+ Thread.currentThread().getName());
        System.out.println("Priority of the Thread :"+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(2);
        System.out.println("After changing the Thread Priority :"+Thread.currentThread().getPriority());
    }      
}
