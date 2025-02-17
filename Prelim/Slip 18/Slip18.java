/* Write a java program to display IP Address and Name of client machine /*
IP Address and Name of client machine.*/

import java.net.*;
class Slip18
{

public static void main(String args[]) throws Exception
{
InetAddress inet=InetAddress.getByName("www.facebook.com");
System.out.println("Client Machine name="+inet.getLocalHost()+" \n"+"Ip Address of Facebook="+inet.getHostAddress());


}

}