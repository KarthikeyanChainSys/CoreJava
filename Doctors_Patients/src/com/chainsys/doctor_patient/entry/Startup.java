package com.chainsys.doctor_patient.entry;

import java.util.Scanner;

import com.chainsys.miniproject.ui.AppointmentsUI;
import com.chainsys.miniproject.ui.DoctorsUI;

public class Startup {
	public static void main(String[] args) {
		loadMenu();
	}
	
	private static void loadMenu()
	{
		System.out.println("------Have a Good Day------ " + "\n" + "\n" + "---Please select the option---");
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 : Doctor option" + "\n" + "Press 2 : Appointment option");
		try {
			int menus = sc.nextInt();
			switch(menus)
			{
			case 1 :
				DoctorsUI.DoctorOption();
				break;
			case 2 :
				AppointmentsUI.AppointmentOption();
				break;
			default :
				System.out.println("Thank you!!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
				sc.close();
		}
		
	}
	
	
}
