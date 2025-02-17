// Write a java program to display each alphabet after 2 seconds between ‘a’ to ‘z’. 
import java.util.*;

class Slip17 extends Thread
{  
    char c;
    public void run() 
    {
        for(c='A'; c<='Z'; c++)
        {
            System.out.println(c+" ");
            
            try{
                Thread.sleep(2000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
    public static void main(String args[])
    {
        Slip15_1 t1 = new Slip15_1();
        t1.start();
        
    }
}