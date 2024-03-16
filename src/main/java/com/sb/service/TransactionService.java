package com.sb.service;

import java.util.List;



import com.sb.model.Transaction;

public interface TransactionService {
	
	public Transaction savetransaction(Transaction transaction);
	public List<Transaction> getTransaction();
//	public Transaction getTransactionbyid(int id);
	public Transaction updateTransaction(Transaction transaction);
	public void deleteTransaction();
	public void deleteTransactionbyid(int id);
//	public Transaction getTransactionbyid(int id);
	
	public Transaction getTransactionbyid(int id);
}
