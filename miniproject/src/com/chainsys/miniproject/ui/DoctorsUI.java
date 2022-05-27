package com.chainsys.miniproject.ui;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.DoctorsDao;
import com.chainsys.miniproject.pojo.Doctors;

public class DoctorsUI {
	public static void DoctorOption() {
		System.out.println("\n ---Doctors Option---");
		Scanner sc=new Scanner(System.in);
		System.out.println("press 1 for add new doctor");
		System.out.println("press 2 for see the doctor details by id");
		System.out.println("press 3 for see all doctor detail");
		System.out.println("press 4 for update doctor details");
		System.out.println("press 5 for delete doctor detail");
		try {
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				addNewDoctorDetails();
				break;
			case 2:
				viewDoctorsDetailsById();
				break;
			case 3:
				viewAllDoctorsDetails();
				break;
			case 4:
				updateDoctorDetails();
				break;
			case 5:
				deleteDoctorDetails();
				break;
			default:
				System.out.println("enter the number 7 and below");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				sc.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void addNewDoctorDetails() {

		Scanner sc = new Scanner(System.in);
		Doctors doc = new Doctors();
		//Doctor ID--------------------------------------
		System.out.println("Enter the Doctor id:");
		String doc_id = sc.nextLine();
		try {
			Validator.checkStringForParseInt(doc_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			
		}
		int doctor_id=Integer.parseInt(doc_id);
		try {
			Validator.CheckNumberForGreaterThanZero(doctor_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		doc.setDoc_id(doctor_id);
		
		//Doctor name--------------------------------------
		System.out.println("Enter Doctor name:");
		String doc_name = sc.nextLine();
		try {
			Validator.checkStringOnly(doc_name);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		doc.setDoc_name(doc_name);
		
		//Doctor DOB---------------------------------
		System.out.println("Enter Doctor Date of birth like \"dd/mm/yyyy\":");
		SimpleDateFormat dobFormate = new SimpleDateFormat("dd/MM/yyyy");
		String Dob = sc.nextLine();
		try {
			doc.setDob(dobFormate.parse(Dob));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		//Doctor Speciality--------------------------------
		System.out.println("Enter the Speciality:");
		String speciality = sc.nextLine();
		try {
			Validator.checkStringOnly(speciality);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		doc.setSpeciality(speciality);
		
		//Doctor City----------------------------------
		System.out.println("Enter city:");
		String city = sc.nextLine();
		try {
			Validator.checkStringOnly(speciality);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		doc.setCity(city);
		
		//Doctor number----------------------------------
		System.out.println("Enter phone number:");
		String phone = sc.nextLine();
		try {
			Validator.checkPhone(phone);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		doc.setPhone_no(Integer.parseInt(phone));
		
		//Enter Standard fees---------------------------
		System.out.println("Enter Standard fees:");
		int std_fees = sc.nextInt();
		try {
			Validator.CheckNumberForGreaterThanZero(std_fees);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		doc.setStandard_fees(std_fees);
		int result = DoctorsDao.insertDoctor(doc);
		System.out.println(result + "row inserted");
		sc.close();
	}

	public static void viewDoctorsDetailsById() {
		Scanner sc = new Scanner(System.in);
		//Doctor ID----------------------------------------
		System.out.println("Enter the Doctor id:");
		int doc_id = sc.nextInt();
		try {
			Validator.CheckNumberForGreaterThanZero(doc_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		Doctors doc = DoctorsDao.getDoctorsByID(doc_id);
		System.out.println("Doctor id:" + doc.getDoc_id());
		System.out.println("Doctor Name:" + doc.getDoc_name());
		System.out.println("Date of birth:" + doc.getDob());
		System.out.println("Speciality:" + doc.getSpeciality());
		System.out.println("phone number:" + doc.getPhone_no());
		System.out.println("Standard fees:" + doc.getStandard_fees());
		sc.close();
	}
	public static void viewAllDoctorsDetails() {
		List<Doctors> doclist =DoctorsDao.getAllDoctors();
		Iterator<Doctors> docItr=doclist.iterator();
		while(docItr.hasNext()) {
			Doctors doc=docItr.next();
			System.out.println("doc id:"+"\t"+doc.getDoc_id()+"\t"+"doc name:" +" "+doc.getDoc_name());
		}
	}
	public static void updateDoctorDetails() {
		Scanner sc = new Scanner(System.in);
		Doctors doc = new Doctors();
		//Doctor ID----------------------------------------
		System.out.println("Enter the Doctor id:");
		String doc_id = sc.nextLine();
		try {
			Validator.checkStringForParseInt(doc_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		int doctor_id=Integer.parseInt(doc_id);
		try {
			Validator.CheckNumberForGreaterThanZero(doctor_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		doc.setDoc_id(doctor_id);
		
		//Doctor name--------------------------------------
		System.out.println("Enter Doctor name:");
		String doc_name = sc.nextLine();
		try {
			Validator.checkStringOnly(doc_name);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();	
		}
		doc.setDoc_name(doc_name);
		
		//Doctor DOB-------------------------------------
		System.out.println("Enter Doctor Date of birth like \"dd/mm/yyyy\":");
		SimpleDateFormat dobFormate = new SimpleDateFormat("dd/MM/yyyy");
		String Dob = sc.nextLine();
		try {
			doc.setDob(dobFormate.parse(Dob));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		//Doctor Speciality------------------------------
		System.out.println("Enter the Speciality:");
		String speciality = sc.nextLine();
		try {
			Validator.checkStringOnly(speciality);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		doc.setSpeciality(speciality);
		
		//Doctor City--------------------------------
		System.out.println("Enter city:");
		String city = sc.nextLine();
		try {
			Validator.checkStringOnly(city);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		doc.setCity(city);
		
		//Doctor Number----------------------------------
		System.out.println("Enter phone number:");
		String phone = sc.nextLine();
		try {
			Validator.checkPhone(phone);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		doc.setPhone_no(Integer.parseInt(phone));
		
		//Doctor feed
		System.out.println("Enter Standard fees:");
		int std_fees = sc.nextInt();
		try {
			Validator.CheckNumberForGreaterThanZero(std_fees);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		doc.setStandard_fees(std_fees);
		int result = DoctorsDao.updateDoctor(doc);
		System.out.println(result + "row updated");
		sc.close();
	}
	public static void deleteDoctorDetails() {
		Scanner sc=new Scanner(System.in);
		
		//Doctor ID--------------------------------
		System.out.println("Enter Doctor id:");
		int doc_id=sc.nextInt();
		try {
			Validator.CheckNumberForGreaterThanZero(doc_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();	
		}
		int result = DoctorsDao.deleteDoctors(doc_id);
		System.out.println(result+"row deleted");
		sc.close();
	}
}
