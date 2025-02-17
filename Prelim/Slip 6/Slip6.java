/*Write a JDBC program to remove “percentage” column from student (rno,
sname, percentage) table. Student table is already created.Slip11_1*/

import java.sql.*;
class Slip6
{
public static void main(String obj[])
{
try{
Class.forName("oracle.jdbc.OracleDriver");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
System.out.print("Connected!");
PreparedStatement st = con.prepareStatement("create table Slip11_1(rno number, sname varchar(30), percen number)");
st.executeUpdate();
System.out.print("\nTable Created!");
PreparedStatement st1 = con.prepareStatement("insert into Slip11_1 values(218, 'Saad Shaikh', 92.31)"); 
st1.executeUpdate();
System.out.print("\nRecord Inserted!");
PreparedStatement st2 = con.prepareStatement("alter table Slip11_1 drop column percen"); 
st2.executeUpdate();
System.out.print("\nThe Column (Percentage) is Dropped successfully!");
}catch(Exception e){}
}
}