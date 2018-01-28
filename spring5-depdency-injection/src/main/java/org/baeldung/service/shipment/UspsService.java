package org.baeldung.service.shipment;

import java.util.UUID;

/**
 * Class responsible for dispatching the shipment via USPS
 * 
 * @author baeldung
 *
 *
 */
public class UspsService implements Shipper {

	@Override
	public String dispatch(String address) {
		 UUID uuid = UUID.randomUUID();
		 //Return the Tracking Id
	     return "Usps:"+uuid.toString();
	}

}
