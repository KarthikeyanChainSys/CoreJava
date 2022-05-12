import java.sql.*;
public class Dbmd{
	public static void main(String args[]) 
	{
		dbmdTables();
	}
	
	public static void dbmdDetails() 
	{
		Connection con = getConnection();
		try {
			DatabaseMetaData dbmd = con.getMetaData();
			System.out.println("Driver Name : " + dbmd.getDriverName());
			System.out.println("Driver Version : " + dbmd.getDriverVersion());
			System.out.println("User Name : " + dbmd.getUserName());
			System.out.println("Database Product Name : " + dbmd.getDatabaseProductName());
			System.out.println("Database Product Version : " + dbmd.getDatabaseProductVersion());
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void dbmdTables()
	{
		Connection con = getConnection();
		try {
				DatabaseMetaData dbmd = con.getMetaData();
				String table[] = {"TABLE"};
				ResultSet rs = dbmd.getTables(null, null, null,table);
				while(rs.next())
				{
					System.out.println(rs.getString(3));
				}
		}catch(Exception e) {
			System.out.println(e);
		}
	}	
	
	public static void dbmdViews()
	{
		Connection con = getConnection();
		try {
				DatabaseMetaData dbmd = con.getMetaData();
				String table[] = {"VIEW"};
				ResultSet rs = dbmd.getTables(null, null, null,table);
				while(rs.next())
				{
					System.out.println(rs.getString(3));
				}
		}catch(Exception e) {
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
 