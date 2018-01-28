package org.baeldung.service;

import org.baeldung.service.payment.Payer;
import org.baeldung.service.payment.PaypalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class responsible for confirming payment
 * 
 * @author baeldung
 *
 *
 */
public class PaymentService {
	
	private static Logger logger = LoggerFactory.getLogger(PaymentService.class);
	
	private Payer payer;

	public PaymentService() {
		super();
	}
	
	
	/**
	 * 
	 * @return
	 */
	public Boolean processPayment(String paymentId) {		
		return payer.submitPayment(paymentId);
	}


	public Payer getPayer() {
		return payer;
	}


	public void setPayer(Payer payer) {
		this.payer = payer;
	}

}
