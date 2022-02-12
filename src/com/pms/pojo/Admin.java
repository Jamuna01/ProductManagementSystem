package com.pms.pojo;

public class Admin 
{
	private int aId;
	private String adminFName;
	private String adminLName;
	private String adminEmail;
	private String adminUName;
	private String adminPassword;
	
	
	public Admin() {
		super();
	}


	public Admin(int aId, String adminFName, String adminLName, String adminEmail, String adminUName,
			String adminPassword) {
		super();
		this.aId = aId;
		this.adminFName = adminFName;
		this.adminLName = adminLName;
		this.adminEmail = adminEmail;
		this.adminUName = adminUName;
		this.adminPassword = adminPassword;
	}


	public int getaId() {
		return aId;
	}


	public void setaId(int aId) {
		this.aId = aId;
	}


	public String getAdminFName() {
		return adminFName;
	}


	public void setAdminFName(String adminFName) {
		this.adminFName = adminFName;
	}


	public String getAdminLName() {
		return adminLName;
	}


	public void setAdminLName(String adminLName) {
		this.adminLName = adminLName;
	}


	public String getAdminEmail() {
		return adminEmail;
	}


	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}


	public String getAdminUName() {
		return adminUName;
	}


	public void setAdminUName(String adminUName) {
		this.adminUName = adminUName;
	}


	public String getAdminPassword() {
		return adminPassword;
	}


	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	
	
}
