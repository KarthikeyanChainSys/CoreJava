package com.chainsys.miniproject.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chainsys.miniproject.pojo.Doctors;

public class DoctorsDao {
	private static Connection getConnection()
	{
		Connection con = null;
		String drivername = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String pwd = "oracle";
		try {
				Class.forName(drivername);
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
   		try {
   				con = DriverManager.getConnection(url,user,pwd);
   			} catch (SQLException e) {
   				e.printStackTrace();
   			}
   			return con;
	}
	
	public static java.sql.Date convertToSqlDate(java.util.Date date)
	{
		java.sql.Date sqldate = new java.sql.Date(date.getTime());
		return sqldate;
	}

//	To insert new row to the table doctors	
	public static int insertDoctor(Doctors newdoc)
	{
		String insertquery = "insert into doctors(doc_id,doc_name,dob,speciality,city,phone_no,standard_fees) values (?,?,?,?,?,?,?)";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(insertquery);
			ps.setInt(1,newdoc.getDoc_id());
			ps.setString(2,newdoc.getDoc_name());
			ps.setDate(3,convertToSqlDate(newdoc.getDob()));
			ps.setString(4, newdoc.getSpeciality());
			ps.setString(5,newdoc.getCity());
			// Convert java.util.Date to java.sql.Date
			ps.setInt(6,newdoc.getPhone_no());
			ps.setDouble(7,newdoc.getStandard_fees());
			rows = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}
	
//	For updating all the columns of the table
	public static int updateDoctor(Doctors newdoc)
	{
		String updatequery = "update doctors set doc_name=?,dob=?,speciality=?,city=?,phone_no=?,standard_fees=? where doc_id=?";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(updatequery);
			ps.setInt(7,newdoc.getDoc_id());
			ps.setString(1,newdoc.getDoc_name());
			ps.setDate(2,convertToSqlDate(newdoc.getDob()));
			ps.setString(3, newdoc.getSpeciality());
			ps.setString(4,newdoc.getCity());
			ps.setInt(5,newdoc.getPhone_no());
			ps.setInt(6,newdoc.getStandard_fees());
			rows = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}

//	To delete a row from the table using id
	public static int deleteDoctors(int id)
	{
		String deletequery = "delete doctors where doc_id=?";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(deletequery);
			ps.setInt(1,id);
			rows = ps.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}
	
//	To retrieve specific Doctors data using doc_id
	public static Doctors getDoctorsByID(int id)
	{
		Doctors doc = null;
		String selectquery = "select doc_id,doc_name,dob,speciality,city,phone_no,standard_fees from doctors where doc_id=?";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(selectquery);
			ps.setInt(1,id);
			rs = ps.executeQuery();
			doc = new Doctors();
			while(rs.next())
			{
				doc.setDoc_id(rs.getInt(1));
				doc.setDoc_name(rs.getString(2));
				java.util.Date date = new java.util.Date(rs.getDate(3).getTime());
				doc.setDob(date);
				doc.setSpeciality(rs.getString(4));
				doc.setCity(rs.getString(5));
				doc.setPhone_no(rs.getInt(6));
				doc.setStandard_fees(rs.getInt(7));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			try {
				ps.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return doc;		
	}
	
//	To retrieve all doctors data from the table
	public static List<Doctors> getAllDoctors()
	{
		List<Doctors> listofDoctors = new ArrayList<Doctors>();
		Doctors doc = null;
		String selectquery = "select doc_id,doc_name,dob,speciality,city,phone_no,standard_fees from doctors";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(selectquery);
			rs = ps.executeQuery();
			while(rs.next())
			{
				doc = new Doctors();
				doc.setDoc_id(rs.getInt(1));
				doc.setDoc_name(rs.getString(2));
				java.util.Date date = new java.util.Date(rs.getDate(3).getTime());
				doc.setDob(date);
				doc.setSpeciality(rs.getString(4));
				doc.setCity(rs.getString(5));
				doc.setPhone_no(rs.getInt(6));
				doc.setStandard_fees(rs.getInt(7));
				listofDoctors.add(doc);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			try {
				ps.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return listofDoctors;
	}
}