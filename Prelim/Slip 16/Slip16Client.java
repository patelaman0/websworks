import java.io.*;
import java.net.*;

class Slip16Client {
    public static void main(String args[]) throws Exception {
        Socket s = new Socket("localhost", 8888);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        int num = Integer.parseInt(br.readLine());

        // Send number to server
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        DataInputStream dis = new DataInputStream(s.getInputStream());
        dos.writeInt(num);

        // Receive factorial from server
        int result = dis.readInt();
        System.out.println("Factorial received from server: " + result);

        // Close resources
        dos.close();
        dis.close();
        s.close();
    }
}
