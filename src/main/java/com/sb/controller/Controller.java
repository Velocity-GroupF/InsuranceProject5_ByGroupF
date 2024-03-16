package com.sb.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sb.model.Claim;
import com.sb.model.Payment;
import com.sb.model.Policy;
import com.sb.model.Settlement;
import com.sb.model.Transaction;
import com.sb.serviceimpl.PaymentServiceimpl;
import com.sb.serviceimpl.PolicyServiceimpl;
import com.sb.serviceimpl.TransactionServiceimpl;
import com.sb.service.SettlementService;

@RestController
public class Controller {
	@Autowired
	private SettlementService settlementService;


	@Autowired
	private PolicyServiceimpl policyServiceimpl;
	
	@Autowired
	private TransactionServiceimpl tsimpl;
	
	@Autowired
	private PaymentServiceimpl paymentServiceimpl;
	
	
	
	
	@PostMapping("/savepayment")
	public String savepayment(@RequestBody Payment payment)
	{
		payment.setDate(LocalDateTime.now());
		 paymentServiceimpl.savePayment(payment);
		 
		 if(payment.getStatus().equalsIgnoreCase("completed"))
		 		 {
		 return "payment Received...";
		 }
		 else{
			 return "payment Failed...";
			 
		}
		 
	}
	
	@PostMapping("/saveTransaction")
	public Transaction savetransction(@RequestBody Transaction transaction)
	{
		return tsimpl.savetransaction(transaction);
		
	}
	
	
	@GetMapping("/getall")
	public List<Transaction> getallTransactions()
	{
	List<Transaction> transactions=	tsimpl.getTransaction();
	return transactions;
		
	}
	
	
	@GetMapping("/getbyid/{id}")
	public Transaction getTransactionbyid(@PathVariable("id") int id)
	{
	Transaction transaction=tsimpl.getTransactionbyid(id);
	return transaction;
		
	}
	
	
	
	@PutMapping("/updatetransaction")
	public Transaction updateTransactions(@RequestBody Transaction transaction)
	{
	 return	tsimpl.updateTransaction(transaction);
	}
	
	
	@DeleteMapping("/deletetransction")
	public ResponseEntity<String> deleTransaction()
	{
		 tsimpl.deleteTransaction();
		 return ResponseEntity.ok().body("Deleted Sucessfully...");
	}
	
	
	@DeleteMapping("/deletebyid/{id}")
	public ResponseEntity<String> deletebyid(@PathVariable("id") int id)
	{
		tsimpl.deleteTransactionbyid(id);
		return ResponseEntity.ok().body("Deleted Sucessfully...");
	}
	
	
	@PostMapping("/savepolicy")
	public Policy savepolicy(@RequestBody Policy policy)
	{
		return policyServiceimpl.savePolicy(policy);
	}
	
	@DeleteMapping("/deletesettlement/{id}")
	public String deletesettlement(@PathVariable("id") int id)
	{
		settlementService.deleteSettlemetById(id);
		
		
		return "Deleted Sucessfully";
	}
	
	@PostMapping("/savesettlemet")
	public Settlement saveSettlement (@RequestBody Settlement settlement)
	{
		settlement.setDateTime(LocalDateTime.now());
		
//		System.out.println(settlement);
		return settlementService.SaveSettlement(settlement);
		
	
	}
	
	@GetMapping("/getPolicybyid/{id}")
	public Policy getPolicyById(@PathVariable("id") int id)
	{
	  return policyServiceimpl.getpolicyById(id);
	}
	
	@PostMapping("/savesetlement")
	public ResponseEntity<?> saveSettlement1(@RequestBody Settlement settlement)
	{
		String claimstatus= settlement.getClaim().getStatus();
		
		Claim claim1= settlement.getClaim();
		claim1.setClaimDate(LocalDateTime.now());
		settlement.setDateTime(LocalDateTime.now());
		
		if(claimstatus.equalsIgnoreCase("completed"))
		{
			Settlement s1= settlementService.SaveSettlement(settlement);
			return ResponseEntity.ok().body(s1);
		}
		else {
			 return ResponseEntity.badRequest().body("claim is not yet done");
			
		}
		
		
		
		
	}
	
}
