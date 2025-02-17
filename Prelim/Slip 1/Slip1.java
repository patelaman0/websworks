import java.util.*;
public class Slip1 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array :");
        int n = s.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i<n; i++)
        {
            numbers.add(s.nextInt());
        }
        Collections.reverse(numbers);
        System.out.println("Array elemtnts in reverse order :");  // use add method

        
        System.out.println(numbers);
        
    }
}
