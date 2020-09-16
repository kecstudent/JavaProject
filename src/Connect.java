import java.sql.*;
public class Connect
{
public Connection con;
public Connect()
{
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/trainreservation","root","");
}
catch(Exception e1)
{
System.out.println("Connection failed:"+e1);
}
}
}