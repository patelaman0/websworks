/*Write a JDBC program to display the details of employees (eno, ename, department,
sal) whose department is “Computer Science. Slip3_1[10]*/

import java.sql.*;
import java.util.*;
class Slip23
{
public static void main(String obj[])
{
Scanner s = new Scanner(System.in);
int n;
try{
Class.forName("oracle.jdbc.OracleDriver");
Connection con  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
//PreparedStatement ps = con.prepareStatement("create table Slip3_1(eno number, ename varchar(30),dept varchar(30),sal number)");
//ps.executeUpdate();
System.out.print("ENter How Many : ");
n = s.nextInt();
PreparedStatement ps2 = con.prepareStatement("insert into Slip3_1 values(?,?,?,?)");
for(int i = 0;i<n;i++)
{
System.out.print("Enter Employee Number : ");
int no = s.nextInt();
System.out.print("Enter Employee Name : ");
String nm = s.next();
System.out.print("Enter Employee Designation :  ");
String dg = s.next();
System.out.print("Enter Employee Salary : ");
int sal =s.nextInt();
ps2.setInt(1,no);
ps2.setString(2,nm);
ps2.setString(3,dg);
ps2.setInt(4,sal);
ps2.executeUpdate();
}
PreparedStatement ps3 = con.prepareStatement("select * from Slip3_1 where dept = 'CS'");
ResultSet rs = ps3.executeQuery();
while(rs.next())
{
System.out.print("No :"+rs.getInt(1)+" Name : "+rs.getString(2)+"  Desig : "+rs.getString(3)+"  Salary : "+rs.getInt(4));
}
}catch(Exception e){}
}
}