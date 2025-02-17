import java.util.Scanner;

class Slip13 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(), fact = 1;
        sc.close();

        for (int i = 1; i <= num; i++) {
            fact *= i;
            System.out.println("Calculating... " + i);
            Thread.sleep(500);
        }

        System.out.println("Factorial of " + num + " is: " + fact);
    }
}