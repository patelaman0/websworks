/*Write a JDBC program to count the number of records in table. (Without
using standard method) Slip10_1*/

import java.sql.*;
import java.util.*;
class Slip10
{
static int n,cnt=0;
static Scanner s = new Scanner(System.in);
public static void main(String obj[])
{
try{
Class.forName("oracle.jdbc.OracleDriver");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
//PreparedStatement st = con.prepareStatement("create table Slip10_1(rno number, nm varchar(30))");
System.out.print("Connected!");
//st.executeUpdate();
//System.out.print("\nCreated!");
System.out.print("\nEnter No of records you want : ");
n = s.nextInt();
PreparedStatement st1 = con.prepareStatement("insert into Slip10_1 values(?,?)"); 
for(int i = 0; i<n;i++)
{
System.out.print("\nEnter Roll No : ");
int rno = s.nextInt();
System.out.print("Enter Name : ");
String nm = s.next();
st1.setInt(1,rno);
st1.setString(2,nm);
st1.executeUpdate();
System.out.print("Record Inserted!");
}
PreparedStatement st2 = con.prepareStatement("select * from Slip10_1"); 
ResultSet rs = st2.executeQuery();
while(rs.next())
{
cnt++;
}
System.out.print("\nTotal Count of Records : "+cnt); 
}catch(Exception e){}
}
}