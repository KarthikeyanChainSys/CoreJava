package com.chainsys.miniproject.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Employee;

public class EmployeeUI {
	public static void EmployeeOption()
	{
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("---Employee Details---");
			System.out.println("Press1 : Add New Employee");
			System.out.println("Press2 : Update Employee Details");
			System.out.println("Press3 : Delete Employee Details");
			System.out.println("Press4 : View Employee Details by ID");
			System.out.println("Press5 : View All Employee Details");
			int menu = sc.nextInt();
			switch(menu)
			{
			case 1 :
				EmployeeUI.addNewEmployee();
				break;
			case 2 :
				EmployeeUI.updateEmployeeDetails();
				break;
			case 3 : 
				EmployeeUI.deleteEmployeeDetails();
				break;
			case 4 :
				EmployeeUI.viewEmployeeDetailsById();
				break;
			case 5 :
				EmployeeUI.viewAllEmployeeDetails();
				break;
			default :
				System.out.println("Something Wrong Thank you!!!");
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}
	}
public static void addNewEmployee() {
		
		Scanner sc=new Scanner(System.in);
		Employee emp=new Employee();
		try {
		//Employee ID--------------------------------------
		System.out.println("Enter the Employee id:");
		String emp_id=sc.nextLine();
		try {
			Validator.checkStringForParseInt(emp_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			
		}
		int id=Integer.parseInt(emp_id);
		try {
			Validator.CheckNumberForGreaterThanZero(id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		emp.setEmp_id(id);
		
		//Employee First name----------------------------------
		System.out.println("Enter Employee first name:");
		String emp_Firstname=sc.nextLine();
		try {
			Validator.checkStringOnly(emp_Firstname);
		}catch(InvalidInputDataException e) {
			System.out.println("Error:"+e.getMessage());
		}
		emp.setFirst_name(emp_Firstname);
		
		//Employee Last name----------------------------------
		System.out.println("Enter Employee Last Name:");
		String emp_LastName=sc.nextLine();
		try {
			Validator.checkStringOnly(emp_LastName);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		emp.setLast_name(emp_LastName);
		
		//Employee Email----------------------------------------
	    System.out.println("Enter Employee Email:");
	    String emp_email=sc.nextLine();
	    try {
			Validator.checkEmail(emp_email); 
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
	    emp.setEmail(emp_email);
	    
	    //Employee Hire date-------------------------------------
	    System.out.println("Enter Employee hire_date like \"dd/mm/yyyy\":");
	    SimpleDateFormat hire_dateFormate=new SimpleDateFormat("dd/MM/yyyy");
	    String emp_HireDate=sc.nextLine();
	    //Date hire_date=hire_dateFormate.parse(emp_HireDate);
	    try {
			emp.setHire_date(hire_dateFormate.parse(emp_HireDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	    
	    //Job ID--------------------------------------------
	    System.out.println("Enter the job_id:");
	    String emp_Job_id=sc.nextLine();
	    try {
	    	Validator.checkJobId(emp_Job_id);
	    }catch(InvalidInputDataException e) {
	    	e.printStackTrace();
	    }
	    emp.setJob_id(emp_Job_id);
	    
	    //Employee Salary-----------------------------------
	    System.out.println("Enter Salary of Employee:");
	    Float emp_salary=0.0f;
	    try {
	    	emp_salary=sc.nextFloat();
			Validator.checkSalaryLimit(emp_salary);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
	    emp.setSalary(emp_salary);
	    int result=EmployeeDao.insertEmployee(emp);
	    System.out.println(result+"row inserted");
	    sc.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void viewEmployeeDetailsById() {
		Scanner sc=new Scanner(System.in);
		//Employee ID--------------------------------------
		System.out.println("Enter the Employee id:");
		int emp_id=0;
		try {
			emp_id=sc.nextInt();
			Validator.CheckNumberForGreaterThanZero(emp_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		Employee emp=EmployeeDao.getEmployeeByID(emp_id);
		System.out.println("Employee id:"+emp.getEmp_id());
		System.out.println("Employee First Name:"+emp.getFirst_name());
		System.out.println("Employee last Name :"+emp.getLast_name());
		System.out.println("Employee hired date:"+emp.getHire_date());
		System.out.println("Employee job_id:"+emp.getJob_id());
		System.out.println("Employee Salary:"+emp.getSalary());
		sc.close();
	}
	public static void viewAllEmployeeDetails() {
		List<Employee> emplist =EmployeeDao.getAllEmployees();
		Iterator<Employee> empItr=emplist.iterator();
		while(empItr.hasNext()) {
			Employee emp=empItr.next();
			System.out.println("emp id:"+emp.getEmp_id());
		}
	}
	public static void updateEmployeeDetails() {
		Scanner sc=new Scanner(System.in);
		Employee emp=new Employee();
		//Employee ID---------------------------------
		System.out.println("Enter the Employee id:");
		String emp_id=null;
		try {
			emp_id=sc.nextLine();
			Validator.checkStringForParseInt(emp_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		int id=Integer.parseInt(emp_id);
		try {
			Validator.CheckNumberForGreaterThanZero(id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		emp.setEmp_id(id);
		
		//Employee First name------------------------------
		System.out.println("Enter Employee first name:");
		String emp_Firstname=sc.nextLine();
		try {
			Validator.checkStringOnly(emp_Firstname);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		emp.setFirst_name(emp_Firstname);
		
		//Employee Last name---------------------------------
		System.out.println("Enter Employee Last Name:");
		String emp_LastName=sc.nextLine();
		try {
			Validator.checkStringOnly(emp_LastName);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		emp.setLast_name(emp_LastName);
		
		//EMployee Email------------------------------------
	    System.out.println("Enter Employee Email:");
	    String emp_email=sc.nextLine();
	    try {
			Validator.checkEmail(emp_email);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
	    emp.setEmail(emp_email);
	    
	    //Employee Hire date-----------------------------------
	    System.out.println("Enter Employee hire_date like \"dd/mm/yyyy\":");
	    SimpleDateFormat hire_dateFormate=new SimpleDateFormat("dd/MM/yyyy");
	    String emp_HireDate=sc.nextLine();
	    //Date hire_date=hire_dateFormate.parse(emp_HireDate);
	    try {
			emp.setHire_date(hire_dateFormate.parse(emp_HireDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	    
	    //Job ID------------------------------------
	    System.out.println("Enter the job_id:");
	    String emp_Job_id=sc.nextLine();
	    try {
	    	Validator.checkJobId(emp_Job_id);
	    }catch(InvalidInputDataException e) {
	    	e.printStackTrace();
	    }
	    emp.setJob_id(emp_Job_id);
	    
	    //Employee Salary----------------------------------
	    System.out.println("Enter Salary of Employee:");
	    Float emp_salary=sc.nextFloat();
	    try {
	    	Validator.checkSalaryLimit(emp_salary);
	    }catch(InvalidInputDataException e) {
	    	e.printStackTrace();
	    }
	    emp.setSalary(emp_salary);
	    int result=EmployeeDao.updateEmployee(emp);
	    System.out.println(result+"row updated");
	    sc.close();
	}
	public static void deleteEmployeeDetails() {
		Scanner sc=new Scanner(System.in);
		//Employee ID---------------------------------------
		System.out.println("Enter Employee id:");
		int emp_id=0;
		try {
			emp_id=sc.nextInt();
			Validator.CheckNumberForGreaterThanZero(emp_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		int result = EmployeeDao.deleteEmployee(emp_id);
		System.out.println(result+"row deleted");
		sc.close();
	}
}	