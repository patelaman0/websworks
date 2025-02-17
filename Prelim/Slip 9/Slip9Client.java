import java.io.*;
import java.net.*;

class Slip9(Client)
{
  public static void main(String args[])
{
try{
ServerSocket ss=new ServerSocket(8888);
     Socket s=ss.accept();

DataInputStream dis=new DataInputStream (s.getInputStream());

String Filenm=(String)dis.readUTF();
File f=new File(Filenm);
if(f.exists())
{
System.out.println("File is present");

}
else{System.out.println("File is not present");
 }

}catch(Exception e){}



}



}