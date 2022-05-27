package com.chainsys.miniproject.pojo;

import java.util.Date;

public class Doctors {
	private int doc_id;
	private String doc_name;
	private Date dob;
	private String speciality;
	private String city;
	private int phone_no;
	private int standard_fees;
	
	public int getDoc_id() {
		return doc_id;
	}
	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
	}
	public String getDoc_name() {
		return doc_name;
	}
	public void setDoc_name(String doc_name) {
		this.doc_name = doc_name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(int number) {
		this.phone_no = number;
	}
	public int getStandard_fees() {
		return standard_fees;
	}
	public void setStandard_fees(int standard_fees) {
		this.standard_fees = standard_fees;
	}
}
