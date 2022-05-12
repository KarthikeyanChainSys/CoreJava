import java.sql.*;
import java.io.*;
public class Callable_Statement {
	public static void main(String args[])
	{
		//storedProcedure();
		sumFunc();
	}
	
	public static void storedProcedure()
	{
		Connection con = getConnection();
		try {
			CallableStatement stmt = con.prepareCall("{call insertR(?,?)}");
			stmt.setInt(1, 1);
			stmt.setString(2, "Karthi");
			stmt.execute();
			System.out.println("Success");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void sumFunc()
	{
		Connection con = getConnection();
		try {
			CallableStatement stmt = con.prepareCall("{?=call sum4(?,?)}");
			stmt.setInt(2, 40);
			stmt.setInt(3, 60);
			stmt.registerOutParameter(1, Types.INTEGER);
			stmt.execute();
			System.out.println(stmt.getInt(1));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	
	private static Connection getConnection()
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
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
