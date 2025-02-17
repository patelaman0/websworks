// Write a multithreading program in java to display all the alphabets from A to Z after 3 seconds
import java.util.*;

public class Slip14 extends Thread {
    char c;
    public void run()
    {
        for(c='A'; c<='Z'; c++)
        {
            System.out.print(c+" ");
            try{
                Thread.sleep(3000);

            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
    public static void main(String args[])
    {
        Slip26_1 t1 = new Slip26_1();
        t1.start();
    }
    
}
