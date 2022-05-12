import java.io.*;
import java.sql.*;

public class Jdbc_Projects {
	public static void main(String args[]) 
	{
//		insertRecords();  
//		updateRecords();
//		deleteRecords();
//		selectRecords();
//		insertMultipleRecords();
	}
	
	public static void insertRecords()
	{
		Connection con = getConnection();
		try {
			PreparedStatement stmt = con.prepareStatement("insert into employee values(?,?,?,?,?)");
			stmt.setInt(1,11);
			stmt.setString(2, "Raj");
			stmt.setInt(3, 28000);
			stmt.setString(4, null);
			stmt.setString(5, "Sales");
			int i = stmt.executeUpdate();
			System.out.println(i + "\t" + "Records inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
	
	public static void updateRecords()
	{
		Connection con = getConnection();
		try {
			PreparedStatement stmt = con.prepareStatement("update employee set salary = ? where eno = ?");
			stmt.setInt(1,50000);
			stmt.setInt(2,10);
			int i = stmt.executeUpdate();
			System.out.println(i + "\t" + "Records updated");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void deleteRecords()
	{
		Connection con = getConnection();
		try {
			PreparedStatement stmt = con.prepareStatement("delete from employee where eno = ?");
			stmt.setInt(1,11);
			int i = stmt.executeUpdate();
			System.out.println(i + "\t" + "Records deleted");
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	public static void selectRecords()
	{
		Connection con = getConnection();
		try {
			PreparedStatement stmt = con.prepareStatement("select * from employee");
			ResultSet rs = stmt.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t" + rs.getString(4) + "\t" + rs.getString(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void insertMultipleRecords()
	{
		Connection con = getConnection();
		try {
			PreparedStatement stmt = con.prepareStatement("insert into employee values(?,?,?,?,?)");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			do 
			{
				System.out.println("Enter Eno : ");
				int Eno = Integer.parseInt(br.readLine());
				System.out.println("Enter Name : ");
				String Name = br.readLine();
				System.out.println("Enter Salary : ");
				int Salary = Integer.parseInt(br.readLine());
				System.out.println("Enter Manager : ");
				String Manager = br.readLine();
				System.out.println("Enter Dept : ");
				String Dept = br.readLine();
				
				stmt.setInt(1,Eno);
				stmt.setString(2,Name);
				stmt.setInt(3,Salary);
				stmt.setString(4,Manager);
				stmt.setString(5,Dept);
				int i = stmt.executeUpdate();
				System.out.println(i + "Records affected");
			
				System.out.println("Do you want to continue : y / n ");
				String s = br.readLine();
				if(s.startsWith("n"))
				{
					break;
				}			
			}while(true);
		} catch (SQLException e) {
			e.printStackTrace();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static Connection getConnection()
	{
		try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			Connection con = null;
   		try {
   				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
   			} catch (SQLException e) {
   				e.printStackTrace();
   			}
   			return con;
	}
}