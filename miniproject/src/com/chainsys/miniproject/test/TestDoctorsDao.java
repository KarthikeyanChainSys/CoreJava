package com.chainsys.miniproject.test;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.DoctorsDao;
import com.chainsys.miniproject.pojo.Doctors;

public class TestDoctorsDao {
	public static void testInsertDoctor()
	{
		try {
			Doctors newdoc = new Doctors();
			newdoc.setDoc_id(3);
			newdoc.setDoc_name("Micky Mouse");
			Calendar c1 = Calendar.getInstance();
			java.util.Date newDate = c1.getTime();
			newdoc.setDob(newDate);
			newdoc.setSpeciality("General");
			newdoc.setCity("Madurai");
			newdoc.setPhone_no(1234567890);
			newdoc.setStandard_fees(500);
			int result = DoctorsDao.insertDoctor(newdoc);
			System.out.println("Record Inserted : " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void testUpdateDoctor()
	{
		try {
			Doctors olddoc = DoctorsDao.getDoctorsByID(3);
			System.out.println("Doctor ID :" + olddoc.getDoc_id() + " " + "Doctor Name :" + olddoc.getDoc_name() + " " + "Doctor Speciality :" + olddoc.getSpeciality());
			olddoc.setDoc_name("Micky Mouse");
			Calendar c1 = Calendar.getInstance();
			java.util.Date newDate = c1.getTime();
			olddoc.setDob(newDate);
			olddoc.setSpeciality("General");
			olddoc.setCity("Trichy");
			olddoc.setPhone_no(1234567890);
			olddoc.setStandard_fees(500);
			int result = DoctorsDao.updateDoctor(olddoc);
			System.out.println("Record Updated : " + result);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public static void testDeleteDoctor()
	{
		try {
			int result = DoctorsDao.deleteDoctors(4);
			System.out.println("Records Deleted :" + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void testGetDoctorsById()
	{
		try {
			Doctors doc = DoctorsDao.getDoctorsByID(2);
			System.out.println("Doctor ID :" + doc.getDoc_id() + " " + "Doctor Name :" + doc.getDoc_name() + " " + "Doctor Speciality :" + doc.getSpeciality());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void testGetAllDoctors()
	{
		try {
			List<Doctors> allDoctors = DoctorsDao.getAllDoctors();
			Iterator<Doctors> docIterator = allDoctors.iterator();
			while(docIterator.hasNext())
			{
				Doctors doc = docIterator.next();
				System.out.println("Doctor ID :" + doc.getDoc_id() + " " + "Doctor Name :" + doc.getDoc_name() + " " + "Doctor Speciality :" + doc.getSpeciality());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
