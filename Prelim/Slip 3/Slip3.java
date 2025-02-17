/* Write a JDBC program to delete the records of employees whose names are starts with 
‘A’ character. [10 M]Slip9_1 */

import java.sql.*;
import java.util.*;
class Slip3
{ 
static int n;
static char ch;
static Scanner s = new Scanner(System.in);
public static void main(String obj[])
{
try{
Class.forName("oracle.jdbc.OracleDriver");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
System.out.print("Connected");
PreparedStatement st = con.prepareStatement("create table Slip9_1(eno number, ename varchar(30), desg varchar(30))"); 
st.executeUpdate();
System.out.print("\nTable Created");
System.out.print("\nEnter no of records want to insert: ");
n = s.nextInt();
PreparedStatement st1 = con.prepareStatement("insert into Slip9_1 values(?,?,?)"); 
for(int i = 0;i<n;i++)
{
System.out.print("\nEnter Emp no : ");
int eno = s.nextInt();
System.out.print("Enter Name : ");
String ename = s.next();
System.out.print("Enter Designation : ");
String desg = s.next();
st1.setInt(1,eno);
st1.setString(2,ename);
st1.setString(3,desg);
st1.executeUpdate();
System.out.print("Inserted!");
}
PreparedStatement psd = con.prepareStatement("delete from Slip9_1 where  ename like 'A%'"); 
int val = psd.executeUpdate();
if(val>0)
{
System.out.print("\nEmployee Record Deleted Whose Name Starts With A");
}
else
{
System.out.print("\nNot Record Founded Whose Name Starts With A");
}
}catch(Exception e){}
}
}