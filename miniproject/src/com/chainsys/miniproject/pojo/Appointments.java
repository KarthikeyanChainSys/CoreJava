package com.chainsys.miniproject.pojo;

import java.util.Date;

public class Appointments {
	private int app_id;
	private Date app_date;
	private int doc_id;
	private String patient_name;
	private int fees_collected;
	private String fees_catogory;
	
	public int getApp_id() {
		return app_id;
	}
	public void setApp_id(int app_id) {
		this.app_id = app_id;
	}
	public Date getApp_date() {
		return app_date;
	}
	public void setApp_date(Date app_date) {
		this.app_date = app_date;
	}
	public int getDoc_id() {
		return doc_id;
	}
	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public int getFees_collected() {
		return fees_collected;
	}
	public void setFees_collected(int fees_collected) {
		this.fees_collected = fees_collected;
	}
	public String getFees_catogory() {
		return fees_catogory;
	}
	public void setFees_catogory(String fees_catogory) {
		this.fees_catogory = fees_catogory;
	}
}
