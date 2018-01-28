package org.baeldung.service.shipment;

import java.util.UUID;

/**
 * Class responsible for dispatching the shipment via UPS
 * 
 * @author baeldung
 *
 *
 */
public class UpsService implements Shipper {

	@Override
	public String dispatch(String address) {
		 UUID uuid = UUID.randomUUID();
		 //Return the Tracking Id
	     return "Ups:"+uuid.toString();
	}

}
