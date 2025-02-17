//Write a JAVA program to create two threads, one displays "computer science" and  another displays "information science" five times. [
import java.util.*;

class computerSci extends Thread{
    public void run()
    {
        for (int i=0; i<5; i++)
        {
            System.out.println("Computer Science");
     
        }
    }
}

class InformationSci extends Thread{
    public void run()
    {
        for (int i=0; i<5; i++)
        {
            System.out.println("Information Science");
        }
    }

}


public class Slip15 {
    public static void main(String args[])
    {
        computerSci com = new computerSci();
        InformationSci info = new InformationSci();

        com.start();
        info.start();
    }    
}
