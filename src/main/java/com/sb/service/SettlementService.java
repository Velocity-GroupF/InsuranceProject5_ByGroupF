package com.sb.service;


import com.sb.model.Policy;
import com.sb.model.Settlement;

public interface SettlementService {
	
	public void deleteSettlemetById(int id);
	public Settlement SaveSettlement(Settlement settlement);
	
	public Policy savePolicy(Policy policy);
	public Settlement saveSettlement(Settlement settlement);
}
