import java.sql.*;
import java.io.*;
public class Store_Retrieve_File {
	public static void main(String args[])
	{
		//storeFile();
		retrieveFile();
	}
	
	public static void storeFile()
	{
		Connection con = getConnection();
		try {
			PreparedStatement ps=con.prepareStatement("insert into filetable values(?,?)");  
					              
			File f=new File("d:\\myfile.txt");  
			FileReader fr=new FileReader(f);  
					              
			ps.setInt(1,101);  
			ps.setCharacterStream(2,fr,(int)f.length());  
			int i=ps.executeUpdate();  
			System.out.println(i+" records affected"); 
			}catch (Exception e)
			{
				e.printStackTrace();
			}  
	}
	
	public static void retrieveFile()
	{
		Connection con = getConnection();
		try {
			PreparedStatement ps=con.prepareStatement("select * from filetable");  
			ResultSet rs=ps.executeQuery();  
			rs.next();//now on 1st row  
			              
			Clob c=rs.getClob(2);  
			Reader r=c.getCharacterStream();              
			              
			FileWriter fw=new FileWriter("d:\\retrivefile.txt");  
			              
			int i;  
			while((i=r.read())!=-1)  
			fw.write((char)i);  
			              
			fw.close();			              
			System.out.println("success");  
			}catch (Exception e) {
				e.printStackTrace();  
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
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection con = null;
		try {
			con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return con;
	}
}