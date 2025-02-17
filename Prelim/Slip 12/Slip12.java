import java.util.*;
public class Slip12 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        TreeSet<Integer> numbers = new TreeSet<>();
        System.out.println("Enter the number of elements you want to enter : ");
        int n = s.nextInt();
        System.out.println("Enter the Elements :");
        for(int i=0; i<n; i++)
        {
             numbers.add(s.nextInt());
        }

        
            System.out.println(numbers);
    }
}
