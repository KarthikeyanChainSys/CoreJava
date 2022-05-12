import java.io.*;
import java.sql.*;
public class Storing_Retrieve_Image {
	public static void main(String args[])
	{
		//retrieveImage();
		update();
	}
	
	public static void storeImage()
	{
		Connection con = getConnection();
		try{              
			PreparedStatement ps=con.prepareStatement("insert into IMGTABLE values(?,?)");  
			ps.setString(1,"Screenshot");  
			  
			FileInputStream fin=new FileInputStream("D:\\Img.png");  
			ps.setBinaryStream(2,fin,fin.available());  
			int i=ps.executeUpdate();  
			System.out.println(i+" records affected");           
		}catch (Exception e)
		{
			e.printStackTrace();
		}  
	}  
	
	public static void retrieveImage()
	{
		Connection con = getConnection();
		try {
		PreparedStatement ps=con.prepareStatement("select * from imgtable");  
		ResultSet rs=ps.executeQuery();  
		if(rs.next())
		{//now on 1st row  
		              
			Blob b=rs.getBlob(2);//2 means 2nd column data  
			byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
		              
			FileOutputStream fout=new FileOutputStream("d:\\Img1.jpg");  
			fout.write(barr);  
		              
			fout.close();  
		}//end of if  
		System.out.println("ok");  
		              
		con.close();  
		}catch (Exception e) 
		{
			e.printStackTrace(); 
		}  
		finally {
			try {
				con.close();
			}catch(Exception e )
			{
				System.out.println(e);
			}
		}
	}  
	
	public static void update()
	{
		Connection con = getConnection();
		try
        {
            PreparedStatement stmt=con.prepareStatement("update employee set name=? where eno=?");  
            stmt.setString(1,"mani");//1 specifies the first parameter in the query i.e. name  
            stmt.setInt(2,12);
            int i=stmt.executeUpdate();  
            System.out.println(i+" records updated");  
        }catch(Exception e)
        {
          System.out.println(e);
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
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 return con;
	}
}
