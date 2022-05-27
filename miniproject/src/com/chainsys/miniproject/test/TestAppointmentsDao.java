package com.chainsys.miniproject.test;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.AppointmentsDao;
import com.chainsys.miniproject.pojo.Appointments;

public class TestAppointmentsDao {
	public static void testInsertAppointments()
	{
		try {
			Appointments newapp = new Appointments();
			newapp.setApp_id(1);
			Calendar c1 = Calendar.getInstance();
			java.util.Date newDate = c1.getTime();
			newapp.setApp_date(newDate);
			newapp.setDoc_id(1);
			newapp.setPatient_name("Gopi");
			newapp.setFees_collected(1000);
			newapp.setFees_catogory("Standard fees");
			int result = AppointmentsDao.insertAppointment(newapp);
			System.out.println("Record Inserted : " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void testUpdateAppointments()
	{
		try {
			Appointments oldapp = AppointmentsDao.getAppointmentsByID(2);
			System.out.println("Appointment ID :" + oldapp.getApp_id() + "\n" + "Doctor ID :" + oldapp.getDoc_id() + "\n" + "Patient name : " + oldapp.getPatient_name());
			Calendar c1 = Calendar.getInstance();
			java.util.Date newDate = c1.getTime();
			oldapp.setApp_date(newDate);
			oldapp.setDoc_id(2);
			oldapp.setPatient_name("Ravi");
			oldapp.setFees_collected(300);
			oldapp.setFees_catogory("low");
			int result = AppointmentsDao.updateAppointment(oldapp);
			System.out.println("Record Updated : " + result);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public static void testDeleteAppointment()
	{
		try {
			int result = AppointmentsDao.deleteAppointment(3);
			System.out.println("Records Deleted :" + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void testGetAppointmentById()
	{
		try {
			Appointments app = AppointmentsDao.getAppointmentsByID(2);
			System.out.println("Appointment ID :" + app.getApp_id() + " " + "Doctor ID :" + app.getDoc_id() + " " + "Patient name :" + app.getPatient_name());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void testGetAllAppointment()
	{
		try {
			List<Appointments> allAppointments = AppointmentsDao.getAllAppointments();
			Iterator<Appointments> docIterator = allAppointments.iterator();
			while(docIterator.hasNext())
			{
				Appointments app = docIterator.next();
				System.out.println("Appointment ID :" + app.getApp_id() + "\n" + "Doctor ID :" + app.getDoc_id() + "\n" + "Patient name :" + app.getPatient_name());
				System.out.println("\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

