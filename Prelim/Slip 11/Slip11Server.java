import java.net.*;
import java.io.*;
import java.util.*;
class Slip11Server
{
    public static void main(String args[]) throws Exception
    {
        ServerSocket ss=new ServerSocket(7777);
        while(true)
        {
            System.out.println("Waiting For Connection ...");
            Socket s=ss.accept();
            DataOutputStream dos=new DataOutputStream(s.getOutputStream());
	    Date d=new Date();
            dos.writeUTF("Server Date: " + d.toString() + "\n");//String representation of object
            dos.close();
            ss.close();
        }
    }
}