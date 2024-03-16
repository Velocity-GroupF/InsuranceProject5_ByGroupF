package com.sb.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "policy")
public class Policy {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String policyholdername;
	private String type;
	private String premium;
	private String coverageamount;
	private String status;
	
	@OneToOne(targetEntity = User.class, cascade = CascadeType.ALL)
	private User user;
	
	@OneToOne(targetEntity = Driver.class, cascade = CascadeType.ALL)
	private Driver driver;
	
	
	
	
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPolicyholdername() {
		return policyholdername;
	}
	public void setPolicyholdername(String policyholdername) {
		this.policyholdername = policyholdername;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPremium() {
		return premium;
	}
	public void setPremium(String premium) {
		this.premium = premium;
	}
	public String getCoverageamount() {
		return coverageamount;
	}
	public void setCoverageamount(String coverageamount) {
		this.coverageamount = coverageamount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Policy [id=" + id + ", policyholdername=" + policyholdername + ", type=" + type + ", premium=" + premium
				+ ", coverageamount=" + coverageamount + ", status=" + status + ", user=" + user + ", driver=" + driver
				+ "]";
	}

	
	
	
	

}
