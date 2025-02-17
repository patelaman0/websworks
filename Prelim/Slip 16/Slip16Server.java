import java.io.*;
import java.net.*;

class Slip16Server {
    public static void main(String args[]) throws Exception {
        ServerSocket ss = new ServerSocket(8888);
        System.out.println("Server is waiting for a connection...");

        Socket s = ss.accept();
        System.out.println("Client connected!");

        // Read number from client
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        int num = dis.readInt();
        System.out.println("Received number: " + num);

        // Calculate factorial
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        // Send result back to client
        dos.writeInt(fact);
        System.out.println("Factorial sent to client: " + fact);

        // Close resources
        dis.close();
        dos.close();
        s.close();
        ss.close();
    }
}
