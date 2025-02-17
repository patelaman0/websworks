/*Write a java program to create Teacher table(TNo.TName, Sal, Desg) and
insert a record in it. Slip5_1*/
import java.sql.*;
class Slip24
{
public static void main(String obj[])
{
try{
Class.forName("oracle.jdbc.OracleDriver");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
System.out.print("Connected!");
PreparedStatement ps = con.prepareStatement("create table Slip5_1(tno number, tname varchar(30), sal number, desg varchar(20))");
ps.executeUpdate();
System.out.print("\nTable Created!");
PreparedStatement ps1 = con.prepareStatement("insert into Slip5_1 values(101, 'Ashwini Thopte', 400000, 'Assist.Professor')");
ps1.executeUpdate();
}catch(Exception e){}
}
}
