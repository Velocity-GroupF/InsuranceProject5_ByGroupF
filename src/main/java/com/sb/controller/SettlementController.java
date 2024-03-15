package com.sb.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sb.model.Settlement;
import com.sb.service.SettlementService;

@RestController
public class SettlementController {
	@Autowired
	private SettlementService settlementService;

	
	
	@DeleteMapping("/deletesettlement/{id}")
	public String deletesettlement(@PathVariable("id") int id)
	{
		settlementService.deleteSettlemetById(id);
		
		
		return "Deleted Sucessfully";
	}

}
