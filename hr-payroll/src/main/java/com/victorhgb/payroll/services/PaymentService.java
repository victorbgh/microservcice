package com.victorhgb.payroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victorhgb.payroll.entities.Payment;
import com.victorhgb.payroll.entities.Worker;
import com.victorhgb.payroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeignClient;

	public Payment getPayment(Long workerId, int days) {
	
		
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
