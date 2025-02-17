// Write a multithreading program in java to display all the vowels from a given String.
import java.util.*;
class Slip2 extends Thread{
    String s1;
    Slip2_1(String s)
    {
        s1 = s;
        start();
    }

    public void run()
    {
        for(int i=0; i<s1.length(); i++)
        {
            char ch = s1.charAt(i);
            if
            (
                ch =='a' || ch == 'e' || ch =='i' || ch=='o' || ch=='u'||
                 ch =='A' || ch == 'E' || ch =='I' || ch=='O' || ch=='U'
            )
            {
                System.out.println(ch +" ");
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name :");
        String str = s.next();
        Slip2_1 v = new Slip2_1(str);
    }
}