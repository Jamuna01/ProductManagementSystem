package com.pms.pojo;

public class Customer 
{
	private int cId;
	private String cfName;
	private String clName;
	private String cemail;
	private String cuName;
	private String cuPassword;
	
	public Customer()
	{
		super();
	}

	public Customer(int cId, String cfName, String clName, String cemail, String cuName, String cuPassword) {
		super();
		this.cId = cId;
		this.cfName = cfName;
		this.clName = clName;
		this.cemail = cemail;
		this.cuName = cuName;
		this.cuPassword = cuPassword;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getCfName() {
		return cfName;
	}

	public void setCfName(String cfName) {
		this.cfName = cfName;
	}

	public String getClName() {
		return clName;
	}

	public void setClName(String clName) {
		this.clName = clName;
	}

	public String getCemail() {
		return cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	public String getCuName() {
		return cuName;
	}

	public void setCuName(String cuName) {
		this.cuName = cuName;
	}

	public String getCuPassword() {
		return cuPassword;
	}

	public void setCuPassword(String cuPassword) {
		this.cuPassword = cuPassword;
	}

	
	
	
}
