package com.chainsys.collections;
import java.util.*;
public class ComparableDemo {
	public static void main(String args[])
	{
		sortComparableEmp();
	}
		public static void compareEmp()
		{
			Emp e1=new Emp(100,"karthi");
			e1.Name="Karthi";
			Emp e2=new Emp(200,"keyan");
			e2.Name="Keyan";
			Emp e3=new Emp(300,"tommy");
			e3.Name="Tommy";
			List<Emp> empList = new ArrayList<>();
			empList.add(e2);
			empList.add(e3);
			empList.add(e1);
			System.out.println(empList);
			//Collections.sort(empList);
			System.out.println(empList);
			/**
			 * The method sort(List<T>) in the type collections
			 * is not applicable for the arguments(ArrayList<Player>)
			 */
		}
		public static void sortComparableEmp()
		{
			EmpComparable e1=new EmpComparable(100);
			e1.Name="Karthi";
			EmpComparable e2=new EmpComparable(200);
			e2.Name="Keyan";
			EmpComparable e3=new EmpComparable(300);
			e3.Name="Tommy";
			
			
			List<EmpComparable> empList = new ArrayList<>();
			empList.add(e2);
			empList.add(e3);
			empList.add(e1);
			System.out.println(empList);
			Iterator<EmpComparable> emp_iterator = empList.iterator();
			while(emp_iterator.hasNext())
			{
				System.out.println(emp_iterator.next().getID());
			}
			Collections.sort(empList);
			System.out.println("----------");
			emp_iterator=empList.iterator();
			while(emp_iterator.hasNext())
			{
				System.out.println(emp_iterator.next().getID());
			}
			EmpNameComparator empComparator=new EmpNameComparator();
			Collections.sort(empList,empComparator);
			System.out.println("----------");
			emp_iterator=empList.iterator();
			while(emp_iterator.hasNext())
			{
				EmpComparable emp=emp_iterator.next();
				System.out.println(emp.getID()+" "+emp.Name);
			}
			
			
			EmpAgeComparator2 emp=new EmpAgeComparator2();
			Collections.sort(empList,empComparator);
			System.out.println("----------");
			emp_iterator=empList.iterator();
			while(emp_iterator.hasNext())
			{
				EmpComparable emp1=emp_iterator.next();
				System.out.println(emp1.getID()+" "+emp1.Name+" ");
			}
		}
}
