package com.sb.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.model.Settlement;
import com.sb.repository.SettlementRepository;
import com.sb.service.SettlementService;

@Service
public class SettlemetImpl implements SettlementService{
	
	@Autowired
	private SettlementRepository settlementRepository;


	@Override
	public void deleteSettlemetById(int id) {
		settlementRepository.deleteById(id);
		
	}

}
