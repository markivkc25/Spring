package org.baeldung.service.payment;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VisaService implements Payer{
	private static Logger logger = LoggerFactory.getLogger(VisaService.class);


	@Override
	public boolean submitPayment(String paymentId) {
		UUID payment=UUID.randomUUID();
		logger.info("Payment Txn Id {}","Visa:"+payment.toString());
		return true;
	}

}
