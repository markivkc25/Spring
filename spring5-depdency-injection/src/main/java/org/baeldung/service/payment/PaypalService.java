package org.baeldung.service.payment;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PaypalService implements Payer{
	
	private static Logger logger = LoggerFactory.getLogger(PaypalService.class);


	@Override
	public boolean submitPayment(String paymentId) {
		UUID payment=UUID.randomUUID();
		logger.info("Payment Txn Id {}","Paypal:"+payment.toString());
		return true;
	}

}
