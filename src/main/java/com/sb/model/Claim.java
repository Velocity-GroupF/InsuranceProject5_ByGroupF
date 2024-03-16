package com.sb.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "claim")
public class Claim {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private String status;
    private LocalDateTime claimDate;
    private double amount;
    private String claimantName;
    private String insuranceCompany;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDateTime getClaimDate() {
		return claimDate;
	}
	public void setClaimDate(LocalDateTime claimDate) {
		this.claimDate = claimDate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getClaimantName() {
		return claimantName;
	}
	public void setClaimantName(String claimantName) {
		this.claimantName = claimantName;
	}
	public String getInsuranceCompany() {
		return insuranceCompany;
	}
	public void setInsuranceCompany(String insuranceCompany) {
		this.insuranceCompany = insuranceCompany;
	}
	@Override
	public String toString() {
		return "Claim [id=" + id + ", status=" + status + ", claimDate=" + claimDate + ", amount=" + amount
				+ ", claimantName=" + claimantName + ", insuranceCompany=" + insuranceCompany + "]";
	}
    
    
	   	
}

