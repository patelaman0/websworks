import java.util.Scanner;

class Slip8 implements Runnable {
    int n;

    Slip8(int n) {
        this.n = n;
    }

    public void run() {
        for (int i = 0; i < n; i++) {
            System.out.println("Hello Java");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of times: ");
        int n = sc.nextInt();
        sc.close();

        new Thread(new Slip8(n)).start();
    }
}