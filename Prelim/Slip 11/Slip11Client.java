import java.io.*;
import java.net.*;
class Slip11Client
{
    public static void main(String args[]) throws Exception
    {
        Socket s=new Socket("localhost",7777);        
        DataInputStream dis=new DataInputStream(s.getInputStream());
        System.out.println(dis.readUTF());
    }    
}