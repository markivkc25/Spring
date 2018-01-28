package org.baeldung.service;

import org.baeldung.service.shipment.Shipper;

/**
 * Class which is responsible for sending the shipment.
 * 
 * @author baeldung
 *
 */
public class ShipmentService {
	private Shipper shipper;

	public ShipmentService(Shipper shipper) {
		super();
		this.shipper = shipper;
	}

	public Shipper getShipper() {
		return shipper;
	}

	public void setShipper(Shipper shipper) {
		this.shipper = shipper;
	}
	
	/**
	 * 
	 * @param address
	 * @return tracking id
	 */
	public String dispatchPackage(String address) {
		return shipper.dispatch(address);
	}

}
