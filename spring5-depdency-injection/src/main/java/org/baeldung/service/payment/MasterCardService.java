package org.baeldung.service.payment;

import java.util.UUID;

import org.baeldung.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MasterCardService implements Payer{
	
	private static Logger logger = LoggerFactory.getLogger(MasterCardService.class);


	@Override
	public boolean submitPayment(String paymentId) {
		UUID payment=UUID.randomUUID();
		logger.info("Payment Txn Id {}","MasterCard:"+payment.toString());
		return true;
	}

}
