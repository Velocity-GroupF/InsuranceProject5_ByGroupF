package com.sb.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.model.Policy;
import com.sb.model.Settlement;
import com.sb.repository.PolicyRepository;
import com.sb.repository.SettlementRepository;
import com.sb.service.SettlementService;

@Service
public class SettlemetImpl implements SettlementService{
	
	@Autowired
	private SettlementRepository settlementRepository;
	
	@Autowired
	private PolicyRepository policyRepository;




	@Override
	public void deleteSettlemetById(int id) {
		settlementRepository.deleteById(id);
		
	}

	@Override
	public Settlement SaveSettlement(Settlement settlement) {
		System.out.println("inside serviceimpl class");
		return settlementRepository.save(settlement);
	}
	
	@Override
	public Policy savePolicy(Policy policy) {
		
		return policyRepository.save(policy);
	}

	@Override
	public Settlement saveSettlement(Settlement settlement) {
		
		return settlementRepository.save(settlement);
	}
}
