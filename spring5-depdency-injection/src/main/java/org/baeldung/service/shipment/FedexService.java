package org.baeldung.service.shipment;

import java.util.UUID;

import org.baeldung.service.payment.PaypalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class responsible for dispatching the shipment via Fedex
 * 
 * @author baeldung
 *
 *
 */
public class FedexService implements Shipper{
	
	private static Logger logger = LoggerFactory.getLogger(FedexService.class);


	@Override
	public String dispatch(String address) {
		 UUID uuid = UUID.randomUUID();
		 String txn=uuid.toString();
		 //Return the Tracking Id
		 logger.info("Fedex Txn Id {}","Fedex:"+txn);
	     return "Fedex:"+txn;
	}

}
