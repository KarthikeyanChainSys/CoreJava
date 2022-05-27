package com.chainsys.miniproject.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chainsys.miniproject.pojo.Employee;
public class EmployeeDao {
	/**
	 * getConnection()
	 * insertEmployee(Employee newemp)
	 * getEmployeeByID(int id)
	 * getAllEmployees()
	 * updateEMployee(Employee newemp)
	 * deleteEmployee(int id)
	 */
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
	
//	To insert new row to the table employees
	public static int insertEmployee(Employee newemp)
	{
		String insertquery = "insert into employees(EMPLOYEE_ID,FIRST_NAME,LAST_NAME,EMAIL,HIRE_DATE,JOB_ID,SALARY) values (?,?,?,?,?,?,?)";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(insertquery);
			ps.setInt(1,newemp.getEmp_id());
			ps.setString(2,newemp.getFirst_name());
			ps.setString(3,newemp.getLast_name());
			ps.setString(4,newemp.getEmail());
			// Convert java.util.Date to java.sql.Date
			ps.setDate(5,convertToSqlDate(newemp.getHire_date()));
			ps.setString(6,newemp.getJob_id());
			ps.setDouble(7,newemp.getSalary());
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
	public static int updateEmployee(Employee newemp)
	{
		String updatequery = "update employees set FIRST_NAME=?,LAST_NAME=?,EMAIL=?,HIRE_DATE=?,JOB_ID=?,SALARY=? where employee_id=?";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(updatequery);
			ps.setInt(7,newemp.getEmp_id());
			ps.setString(1,newemp.getFirst_name());
			ps.setString(2,newemp.getLast_name());
			ps.setString(3,newemp.getEmail());
			// Convert java.util.Date to java.sql.Date
			ps.setDate(4,convertToSqlDate(newemp.getHire_date()));
			ps.setString(5,newemp.getJob_id());
			ps.setFloat(6,newemp.getSalary());
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
	
//	To update only one column of the table
	public static int updateEmployeeFirstName(int id, String fname)
	{
		String updatequery = "update employees set first_name=? where employee_id=?";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(updatequery);
			ps.setString(1, fname);
			ps.setInt(2, id);
			ps.executeUpdate();
			rows = ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				ps.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		return rows;
	}
	
	
//	To update salary column of the table
	public static int updateEmployeeSalary(int id, float salary)
	{
		String updatequery = "update employees set salary=? where employee_id=?";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(updatequery);
			ps.setFloat(1, salary);
			ps.setInt(2, id);
			ps.executeUpdate();
			rows = ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				ps.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		return rows;
	}
	
//	To delete a row from the table using id
	public static int deleteEmployee(int id)
	{
		String deletequery = "delete employees where employee_id=?";
		Connection con = getConnection();
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
	
//	To retrieve specific Employee data using employee_id
	public static Employee getEmployeeByID(int id)
	{
		Employee emp = null;
		String selectquery = "select EMPLOYEE_ID,FIRST_NAME,LAST_NAME,EMAIL,HIRE_DATE,JOB_ID,SALARY from employees where employee_id=?";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(selectquery);
			ps.setInt(1,id);
			rs = ps.executeQuery();
			emp = new Employee();
			while(rs.next())
			{
				emp.setEmp_id(rs.getInt(1));
				emp.setFirst_name(rs.getString(2));
				emp.setLast_name(rs.getString(3));
				emp.setEmail(rs.getString(4));
				java.util.Date date = new java.util.Date(rs.getDate(5).getTime());
				// Date retrieved from the database will be of type java.sql.Date (rs.getDate(5))
				// emp.setHire_date requires date of type java.util.Date
				// So we are converting sql date to util date
				// The constructor of java.util.Date requires a long value
				// So we use the getTime() which returns the sql date as a long value
				emp.setHire_date(date);
				emp.setJob_id(rs.getString(6));
				emp.setSalary(rs.getFloat(7));
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
		return emp;		
	}
	
//	To retrieve all employee data from the table
	public static List<Employee> getAllEmployees()
	{
		List<Employee> listofEmployees = new ArrayList<Employee>();
		Employee emp = null;
		String selectquery = "select EMPLOYEE_ID,FIRST_NAME,LAST_NAME,EMAIL,HIRE_DATE,JOB_ID,SALARY from employees";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(selectquery);
			rs = ps.executeQuery();
			while(rs.next())
			{
				emp = new Employee();
				emp.setEmp_id(rs.getInt(1));
				emp.setFirst_name(rs.getString(2));
				emp.setLast_name(rs.getString(3));
				emp.setEmail(rs.getString(4));
				java.util.Date date = new java.util.Date(rs.getDate(5).getTime());
				emp.setHire_date(date);
				emp.setJob_id(rs.getString(6));
				emp.setSalary(rs.getFloat(7));
				listofEmployees.add(emp);
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
		return listofEmployees;
	}
}
