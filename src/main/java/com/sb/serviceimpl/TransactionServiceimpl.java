package com.sb.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.sb.model.Transaction;
import com.sb.repository.TransactionRepository;
import com.sb.service.TransactionService;

@Service
public class TransactionServiceimpl implements TransactionService {
	
	@Autowired
	private TransactionRepository transactionRepository;
	


	@Override
	public Transaction savetransaction(Transaction transaction) {
		return transactionRepository.save(transaction);
		
	}

	@Override
	public List<Transaction> getTransaction() {
		List<Transaction> transactions= transactionRepository.findAll();
		 return transactions;
	}
	
	

	@Override
	public Transaction updateTransaction(Transaction transaction) {
		return transactionRepository.save(transaction);
	}

	@Override
	public Transaction getTransactionbyid(int id) {
		
		return transactionRepository.findById(id).get();
	}

	
	
	
	
	
	
	
	
	@Override
	public void deleteTransaction() {
		 transactionRepository.deleteAll();;
		
	}

	@Override
	public void deleteTransactionbyid(int id) {
		transactionRepository.deleteById(id);		
	}

	

	
	
	

	
}
