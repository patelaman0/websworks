//Write a JDBC Program in java to display the names of Employees starting with ‘S’ character.Slip21_1.

import java.sql.*;
import java.util.*;
class Slip19
{
static int n;
static Scanner s = new Scanner(System.in);
public static void main(String obj[])
{
try{
Class.forName("oracle.jdbc.OracleDriver");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
System.out.print("Connected!");
//PreparedStatement st = con.prepareStatement("create table Slip21_1(eno number, enm varchar(30))");
//st.executeUpdate();
//System.out.print("\nCreated!");
System.out.print("\nEnter No of records you want : ");
n = s.nextInt();
PreparedStatement st1 = con.prepareStatement("insert into Slip21_1 values(?,?)"); 
for(int i = 0; i<n;i++)
{
System.out.print("\nEnter Emp ID : ");
int eno = s.nextInt();
System.out.print("Enter Name : ");
String enm = s.next();
st1.setInt(1,eno);
st1.setString(2,enm);
st1.executeUpdate();
System.out.print("Record Inserted!");
}
PreparedStatement st2 = con.prepareStatement("select * from Slip21_1 where enm like 'S%'"); 
ResultSet rs = st2.executeQuery();
System.out.print("\n -Employee Details Whose Name starts with S -");
while(rs.next())
{
System.out.print("\nEmployee ID : "+rs.getInt(1)+"\tEmployee Name : "+rs.getString(2)); 
}
}catch(Exception e){}
}
}