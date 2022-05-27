package com.chainsys.miniproject.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.AppointmentsDao;
import com.chainsys.miniproject.pojo.Appointments;

public class AppointmentsUI {
	public static void AppointmentOption() {
		System.out.println("\n ---Appointments Option---");
		Scanner sc=new Scanner(System.in);
		System.out.println("press 1 for add new appointment");
		System.out.println("press 2 for see the appointment details");
		System.out.println("press 3 for see all appointments detail");
		System.out.println("press 4 for update appointment details");
		System.out.println("press 5 for delete appointment detail");
		try {
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				addNewAppointments();
				break;
			case 2:
				viewAppointmentDetailsByID();
				break;
			case 3:
				viewAllAppointmentDetails();
				break;
			case 4:
				updateAppointmentDetails();
				break;
			case 5:
				deleteAppointmentDetails();
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
	public static void addNewAppointments() {
		Scanner sc = new Scanner(System.in);
		Appointments app = new Appointments();
		//Appointment ID-----------------------------------
		System.out.println("Enter the Appointment id:");
		String app_id = sc.nextLine();
		try {
			Validator.checkStringForParseInt(app_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			
		}
		int id=Integer.parseInt(app_id);
		try {
			Validator.CheckNumberForGreaterThanZero(id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}

		app.setApp_id(id);
		//Appointment Date--------------------------------------
		System.out.println("Enter Appointment Date like \"dd/mm/yyyy\":");
		SimpleDateFormat appFormate = new SimpleDateFormat("dd/MM/yyyy");
		String app_date = sc.nextLine();
		try {
			app.setApp_date(appFormate.parse(app_date));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		//Doctor ID-----------------------------------------
		System.out.println("Enter Doctor id:");
		String doc_Id = sc.nextLine();
		try {
			Validator.checkStringForParseInt(doc_Id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		int doctor_id=Integer.parseInt(doc_Id);
		try {
			Validator.CheckNumberForGreaterThanZero(doctor_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		app.setDoc_id(doctor_id);
		
		//Patient name-----------------------------------------
		System.out.println("Enter patient Name:");
		String patient = sc.nextLine();
		try {
			Validator.checkStringOnly(patient);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		app.setPatient_name(patient);
		
		//Fees Collected--------------------------------------
		System.out.println("Enter fees collected:");
		String fees_collected = sc.nextLine();
		try {
			Validator.checkStringForParseInt(fees_collected);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		int fees=Integer.parseInt(fees_collected);
		
		try {
			Validator.CheckNumberForGreaterThanZero(fees);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		app.setFees_collected(fees);
		
		//Fees Catogory-------------------------------------
		System.out.println("Enter fees catagery:");
		String fees_cat = sc.nextLine();
		try {
			Validator.checkStringOnly(fees_cat);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		app.setFees_catogory(fees_cat);
		int result = AppointmentsDao.insertAppointment(app);
		System.out.println(result + "row inserted");
		sc.close();
	}
	public static void viewAppointmentDetailsByID() {
		Scanner sc = new Scanner(System.in);
		//Appointment ID---------------------------------------
		System.out.println("Enter the Appointment id:");
		int app_id = sc.nextInt();
		try {
			Validator.CheckNumberForGreaterThanZero(app_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		Appointments doc = AppointmentsDao.getAppointmentsByID(app_id);
		System.out.println("Appointment id:" + doc.getApp_id());
		System.out.println("Appointment date:" + doc.getApp_date());
		System.out.println("Doctor id:" + doc.getDoc_id());
		System.out.println("fees collected:" + doc.getFees_collected());
		System.out.println("fees catagery:" + doc.getFees_catogory());
		sc.close();
	}
	public static void viewAllAppointmentDetails() {
		List<Appointments> applist =AppointmentsDao.getAllAppointments();
		Iterator<Appointments> appItr=applist.iterator();
		while(appItr.hasNext()) {
			Appointments app=appItr.next();
			System.out.println("app id:"+app.getApp_id()+"\n"+"patient name:" + app.getPatient_name());
		}
	}
	public static void updateAppointmentDetails() {
		Scanner sc = new Scanner(System.in);
		Appointments app = new Appointments();
		//Appointment ID---------------------------------------
		System.out.println("Enter the Appointment id:");
		String app_id = sc.nextLine();
		try {
			Validator.checkStringForParseInt(app_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		int id=Integer.parseInt(app_id);
		try {
			Validator.CheckNumberForGreaterThanZero(id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		app.setApp_id(id);
		//Appointment Date---------------------------------------------------
		System.out.println("Enter Appointment Date like \"dd/mm/yyyy\":");
		SimpleDateFormat appFormate = new SimpleDateFormat("dd/MM/yyyy");
		String app_date = sc.nextLine();
		try {
			app.setApp_date(appFormate.parse(app_date));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		//Doctor ID-------------------------------------
		System.out.println("Enter Doctor id:");
		String doc_name = sc.nextLine();
		try {
			Validator.checkStringForParseInt(doc_name);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		int doctor_id=Integer.parseInt(doc_name);
		try {
			Validator.CheckNumberForGreaterThanZero(doctor_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		app.setDoc_id(doctor_id);
		
		//Patient name-------------------------------------
		System.out.println("Enter patient Name:");
		String patient = sc.nextLine();
		try {
			Validator.checkStringOnly(patient);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		app.setPatient_name(patient);
		
		//Fees Collected-------------------------------------
		System.out.println("Enter fees collected:");
		String fees_collected = sc.nextLine();
		try {
			Validator.checkStringForParseInt(fees_collected);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		int fees=Integer.parseInt(fees_collected);
		try {
			Validator.CheckNumberForGreaterThanZero(fees);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		app.setFees_collected(fees);
		
		//Fees Catogory----------------------------------------
		System.out.println("Enter fees catagery:");
		String fees_cat = sc.nextLine();
		try {
			Validator.checkStringOnly(fees_cat);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		app.setFees_catogory(fees_cat);
		int result = AppointmentsDao.updateAppointment(app);
		System.out.println(result + "row updated");
		sc.close();
		}
	public static void deleteAppointmentDetails() {
		Scanner sc=new Scanner(System.in);
		//Appointment ID------------------------------------------
		System.out.println("Enter Appointment id:");
		int app_id=sc.nextInt();
		try {
			Validator.CheckNumberForGreaterThanZero(app_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		int result = AppointmentsDao.deleteAppointment(app_id);
		System.out.println(result+"row deleted");
		sc.close();
	}
}