import java.sql.*;
import java.util.Scanner;

public class DBConnection {
	public static void main(String args[])
	{
		//sample();
		//selectRecords();
		resultSetMetaData();
	}
	
	public static void viewRecords()
	{
		Connection con = getConnection();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from employee ");
			while(rs.next())
			{
				System.out.println(rs.getInt("SALARY") + "\t" + rs.getString("NAME"));
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			try {
				con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void selectRecords()
	{
		Connection con = getConnection();
		try {
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
			ResultSet rs=stmt.executeQuery("select * from employee");   
			rs.relative(3);
			System.out.println(rs.getInt("Eno")+"\t"+rs.getString("Name")+"\t"+rs.getInt("Salary")+"\t"+rs.getString("Manager")+"\t"+rs.getString("Dept"));
		} catch (SQLException e) {
			e.printStackTrace();
		}  
	}
	
	public static void sample() {
		Connection con = getConnection();
		try
        {
            PreparedStatement stmt=con.prepareStatement("insert into students values(?,?,?,?,?)");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter students roll_no,  s_name,  s_dept,  year,mark");
            int rn=sc.nextInt();
            String name=sc.next();
            String dept=sc.next();
            int year=sc.nextInt();
            int mark=sc.nextInt();
            sc.close();
            stmt.setInt(1,rn);
            stmt.setString(2,name);
            stmt.setString(3,dept);
            stmt.setInt(4,year);
            stmt.setInt(5,mark);
            int rows=stmt.executeUpdate();
            System.out.println(rows + "Updated.....");
        }catch(Exception e)
        {
            System.out.println(e);
        }
	}
	
	public static void resultSetMetaData()
	{
		Connection con = getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("select * from employee");
			ResultSet rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println("Total columns : " + rsmd.getColumnCount());
			System.out.println("Column Name of 1st column : " + rsmd.getColumnName(1));
			System.out.println("Column Type Name of 1st column : " + rsmd.getColumnTypeName(1));
		}catch(Exception e)
		{
			System.out.println(e);
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