package com.chainsys.classandmethods;

public class Phone {
	private final long phoneNo;// read only
	private int frontCameraPixel;
	private int rearCameraPixel;
	private float cost;
	private String model;
	private String manucture;
	private int memory;
	private java.util.Date dateofPurchase;
	private String planDetials;
	
	public Phone(long no) {phoneNo=no;}
	public Phone()
	{
		this.phoneNo=9999999999L;
	}
	
	public Phone(long no, float pcost, String pmodel)
	{
		this.phoneNo=no;
		this.cost=pcost;
		this.model=pmodel;
	}
	
	public void sendMSG(long toNo, String outmsg)
	{
		System.out.println("Phone.sendMSG");
	}
	
	public void receiveMSG(String incomingmsg)
	{
		System.out.println("Phone.receiveMSG"+incomingmsg);
	}
	
	public int getFrontCameraPixel() {
		return frontCameraPixel;
	}
	public void setFrontCameraPixel(int frontCameraPixel) {
		this.frontCameraPixel = frontCameraPixel;
	}
	public int getRearCameraPixel() {
		return rearCameraPixel;
	}
	public void setRearCameraPixel(int rearCameraPixel) {
		this.rearCameraPixel = rearCameraPixel;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getManucture() {
		return manucture;
	}
	public void setManucture(String manucture) {
		this.manucture = manucture;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public java.util.Date getDateofPurchase() {
		return dateofPurchase;
	}
	public void setDateofPurchase(java.util.Date dateofPurchase) {
		this.dateofPurchase = dateofPurchase;
	}
	public String getPlanDetials() {
		return planDetials;
	}
	public void setPlanDetials(String planDetials) {
		this.planDetials = planDetials;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void makeCall(long no)
	{
		System.out.println("Phone.makeCall");
	}

}
