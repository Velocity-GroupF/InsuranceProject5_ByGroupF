package com.sb.serviceimpl;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.sb.model.Payment;
import com.sb.repository.PaymentRepository;
import com.sb.service.PaymentService;


@Service
public class PaymentServiceimpl implements PaymentService {
	
	@Autowired
	private PaymentRepository paymentRepository;

	@Override
	public Payment savePayment(Payment payment) {
		
		return paymentRepository.save(payment);
	}

	
	

	
	
	
}
